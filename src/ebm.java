import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebm implements ebo {
   private static final Logger b = LogUtils.getLogger();
   private final cpv c;
   private final int d;
   private final ArrayDeque<ebm.c> e = new ArrayDeque<>();
   private final List<ebm.c> f = new ArrayList<>();
   private int g = 0;

   public ebm(cpv $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(hc $$0, dfj $$1, gw $$2, gw $$3, int $$4, int $$5) {
      this.a($$2, new ebm.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(gw $$0, csv $$1, gw $$2) {
      this.a($$0, new ebm.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dfj $$0, gw $$1, csv $$2, gw $$3, boolean $$4) {
      this.a($$1, new ebm.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(gw $$0, csv $$1, @Nullable hc $$2) {
      this.a($$0, new ebm.b($$0.i(), $$1, $$2));
   }

   private void a(gw $$0, ebm.c $$1) {
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
            ebm.c $$1 = this.e.peek();

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

   static record a(dfj a, gw b, csv c, gw d, boolean e) implements ebm.c {
      @Override
      public boolean a(cpv $$0) {
         ebo.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements ebm.c {
      private final gw a;
      private final csv b;
      @Nullable
      private final hc c;
      private int d = 0;

      b(gw $$0, csv $$1, @Nullable hc $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (ebo.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(cpv $$0) {
         gw $$1 = this.a.a(ebo.a[this.d++]);
         dfj $$2 = $$0.a_($$1);
         ebo.a($$0, $$2, $$1, this.b, this.a, false);
         if (this.d < ebo.a.length && ebo.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < ebo.a.length;
      }
   }

   interface c {
      boolean a(cpv var1);
   }

   static record d(hc a, dfj b, gw c, gw d, int e, int f) implements ebm.c {
      @Override
      public boolean a(cpv $$0) {
         ebo.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(gw a, csv b, gw c) implements ebm.c {
      @Override
      public boolean a(cpv $$0) {
         dfj $$1 = $$0.a_(this.a);
         ebo.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
