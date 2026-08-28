import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eov implements eox {
   private static final Logger b = LogUtils.getLogger();
   private final dbw c;
   private final int d;
   private final ArrayDeque<eov.c> e = new ArrayDeque<>();
   private final List<eov.c> f = new ArrayList<>();
   private int g = 0;

   public eov(dbw $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(je $$0, dsa $$1, iz $$2, iz $$3, int $$4, int $$5) {
      this.a($$2, new eov.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(iz $$0, dex $$1, iz $$2) {
      this.a($$0, new eov.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dsa $$0, iz $$1, dex $$2, iz $$3, boolean $$4) {
      this.a($$1, new eov.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(iz $$0, dex $$1, @Nullable je $$2) {
      this.a($$0, new eov.b($$0.i(), $$1, $$2));
   }

   private void a(iz $$0, eov.c $$1) {
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
            eov.c $$1 = this.e.peek();

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

   static record a(dsa a, iz b, dex c, iz d, boolean e) implements eov.c {
      @Override
      public boolean a(dbw $$0) {
         eox.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements eov.c {
      private final iz a;
      private final dex b;
      @Nullable
      private final je c;
      private int d = 0;

      b(iz $$0, dex $$1, @Nullable je $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (eox.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(dbw $$0) {
         iz $$1 = this.a.a(eox.a[this.d++]);
         dsa $$2 = $$0.a_($$1);
         eox.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < eox.a.length && eox.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < eox.a.length;
      }
   }

   interface c {
      boolean a(dbw var1);
   }

   static record d(je a, dsa b, iz c, iz d, int e, int f) implements eov.c {
      @Override
      public boolean a(dbw $$0) {
         eox.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(iz a, dex b, iz c) implements eov.c {
      @Override
      public boolean a(dbw $$0) {
         dsa $$1 = $$0.a_(this.a);
         eox.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
