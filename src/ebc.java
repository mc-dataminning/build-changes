import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebc implements ebe {
   private static final Logger b = LogUtils.getLogger();
   private final cpl c;
   private final int d;
   private final ArrayDeque<ebc.c> e = new ArrayDeque<>();
   private final List<ebc.c> f = new ArrayList<>();
   private int g = 0;

   public ebc(cpl $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ha $$0, dez $$1, gu $$2, gu $$3, int $$4, int $$5) {
      this.a($$2, new ebc.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(gu $$0, csl $$1, gu $$2) {
      this.a($$0, new ebc.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dez $$0, gu $$1, csl $$2, gu $$3, boolean $$4) {
      this.a($$1, new ebc.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(gu $$0, csl $$1, @Nullable ha $$2) {
      this.a($$0, new ebc.b($$0.i(), $$1, $$2));
   }

   private void a(gu $$0, ebc.c $$1) {
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
            ebc.c $$1 = this.e.peek();

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

   static record a(dez a, gu b, csl c, gu d, boolean e) implements ebc.c {
      @Override
      public boolean a(cpl $$0) {
         ebe.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements ebc.c {
      private final gu a;
      private final csl b;
      @Nullable
      private final ha c;
      private int d = 0;

      b(gu $$0, csl $$1, @Nullable ha $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (ebe.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(cpl $$0) {
         gu $$1 = this.a.a(ebe.a[this.d++]);
         dez $$2 = $$0.a_($$1);
         $$2.a($$0, $$1, this.b, this.a, false);
         if (this.d < ebe.a.length && ebe.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < ebe.a.length;
      }
   }

   interface c {
      boolean a(cpl var1);
   }

   static record d(ha a, dez b, gu c, gu d, int e, int f) implements ebc.c {
      @Override
      public boolean a(cpl $$0) {
         ebe.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(gu a, csl b, gu c) implements ebc.c {
      @Override
      public boolean a(cpl $$0) {
         dez $$1 = $$0.a_(this.a);
         ebe.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
