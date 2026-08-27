import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqg implements eqi {
   private static final Logger b = LogUtils.getLogger();
   private final dca c;
   private final int d;
   private final ArrayDeque<eqg.c> e = new ArrayDeque<>();
   private final List<eqg.c> f = new ArrayList<>();
   private int g = 0;

   public eqg(dca $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(iw $$0, dtc $$1, ir $$2, ir $$3, int $$4, int $$5) {
      this.a($$2, new eqg.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(ir $$0, dfc $$1, ir $$2) {
      this.a($$0, new eqg.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dtc $$0, ir $$1, dfc $$2, ir $$3, boolean $$4) {
      this.a($$1, new eqg.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(ir $$0, dfc $$1, @Nullable iw $$2) {
      this.a($$0, new eqg.b($$0.i(), $$1, $$2));
   }

   private void a(ir $$0, eqg.c $$1) {
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
            eqg.c $$1 = this.e.peek();

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

   static record a(dtc a, ir b, dfc c, ir d, boolean e) implements eqg.c {
      @Override
      public boolean a(dca $$0) {
         eqi.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements eqg.c {
      private final ir a;
      private final dfc b;
      @Nullable
      private final iw c;
      private int d = 0;

      b(ir $$0, dfc $$1, @Nullable iw $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (eqi.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(dca $$0) {
         ir $$1 = this.a.a(eqi.a[this.d++]);
         dtc $$2 = $$0.a_($$1);
         eqi.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < eqi.a.length && eqi.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < eqi.a.length;
      }
   }

   interface c {
      boolean a(dca var1);
   }

   static record d(iw a, dtc b, ir c, ir d, int e, int f) implements eqg.c {
      @Override
      public boolean a(dca $$0) {
         eqi.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(ir a, dfc b, ir c) implements eqg.c {
      @Override
      public boolean a(dca $$0) {
         dtc $$1 = $$0.a_(this.a);
         eqi.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
