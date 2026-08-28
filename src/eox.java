import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eox implements eoz {
   private static final Logger b = LogUtils.getLogger();
   private final dby c;
   private final int d;
   private final ArrayDeque<eox.c> e = new ArrayDeque<>();
   private final List<eox.c> f = new ArrayList<>();
   private int g = 0;

   public eox(dby $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(je $$0, dsc $$1, iz $$2, iz $$3, int $$4, int $$5) {
      this.a($$2, new eox.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(iz $$0, dez $$1, iz $$2) {
      this.a($$0, new eox.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dsc $$0, iz $$1, dez $$2, iz $$3, boolean $$4) {
      this.a($$1, new eox.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(iz $$0, dez $$1, @Nullable je $$2) {
      this.a($$0, new eox.b($$0.i(), $$1, $$2));
   }

   private void a(iz $$0, eox.c $$1) {
      boolean $$2 = this.g > 0;
      boolean $$3 = this.d >= 0 && this.g >= this.d;
      this.g++;
      if (!$$3) {
         if ($$2) {
            this.f.add($$1);
         } else {
            this.e.push($$1);
         }
      } else if (this.g - 1 == this.d) {
         b.error("Too many chained neighbor updates. Skipping the rest. First skipped position: " + $$0.x());
      }

      if (!$$2) {
         this.a();
      }
   }

   private void a() {
      try {
         while (!this.e.isEmpty() || !this.f.isEmpty()) {
            for (int $$0 = this.f.size() - 1; $$0 >= 0; $$0--) {
               this.e.push(this.f.get($$0));
            }

            this.f.clear();
            eox.c $$1 = this.e.peek();

            while (this.f.isEmpty()) {
               if (!$$1.a(this.c)) {
                  this.e.pop();
                  break;
               }
            }
         }
      } finally {
         this.e.clear();
         this.f.clear();
         this.g = 0;
      }
   }

   static record a(dsc a, iz b, dez c, iz d, boolean e) implements eox.c {
      @Override
      public boolean a(dby $$0) {
         eoz.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements eox.c {
      private final iz a;
      private final dez b;
      @Nullable
      private final je c;
      private int d = 0;

      b(iz $$0, dez $$1, @Nullable je $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (eoz.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(dby $$0) {
         iz $$1 = this.a.a(eoz.a[this.d++]);
         dsc $$2 = $$0.a_($$1);
         eoz.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < eoz.a.length && eoz.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < eoz.a.length;
      }
   }

   interface c {
      boolean a(dby var1);
   }

   static record d(je a, dsc b, iz c, iz d, int e, int f) implements eox.c {
      @Override
      public boolean a(dby $$0) {
         eoz.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(iz a, dez b, iz c) implements eox.c {
      @Override
      public boolean a(dby $$0) {
         dsc $$1 = $$0.a_(this.a);
         eoz.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
