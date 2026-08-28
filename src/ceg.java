import javax.annotation.Nullable;

public abstract class ceg extends ccg {
   private static final int a = 0;
   private static final int b = 1;
   private static final int c = 2;
   protected final bvk e;
   protected final boolean f;
   private final boolean d;
   private int i;
   private int j;
   private int k;
   @Nullable
   protected bvi g;
   protected int h = 60;

   public ceg(bvk $$0, boolean $$1) {
      this($$0, $$1, false);
   }

   public ceg(bvk $$0, boolean $$1, boolean $$2) {
      this.e = $$0;
      this.f = $$1;
      this.d = $$2;
   }

   @Override
   public boolean c() {
      bvi $$0 = this.e.O_();
      if ($$0 == null) {
         $$0 = this.g;
      }

      if ($$0 == null) {
         return false;
      } else if (!this.e.c($$0)) {
         return false;
      } else {
         fci $$1 = this.e.cr();
         fci $$2 = $$0.cr();
         if ($$1 != null && $$2 == $$1) {
            return false;
         } else {
            double $$3 = this.l();
            if (this.e.g($$0) > $$3 * $$3) {
               return false;
            } else {
               if (this.f) {
                  if (this.e.Q().a($$0)) {
                     this.k = 0;
                  } else if (++this.k > b(this.h)) {
                     return false;
                  }
               }

               this.e.h($$0);
               return true;
            }
         }
      }
   }

   protected double l() {
      return this.e.h(bwq.m);
   }

   @Override
   public void d() {
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   @Override
   public void e() {
      this.e.h(null);
      this.g = null;
   }

   protected boolean a(@Nullable bvi $$0, cfz $$1) {
      if ($$0 == null) {
         return false;
      } else if (!$$1.a(a(this.e), this.e, $$0)) {
         return false;
      } else if (!this.e.a($$0.dv())) {
         return false;
      } else {
         if (this.d) {
            if (--this.j <= 0) {
               this.i = 0;
            }

            if (this.i == 0) {
               this.i = this.a($$0) ? 1 : 2;
            }

            if (this.i == 2) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(bvi $$0) {
      this.j = b(10 + this.e.dY().a(5));
      eto $$1 = this.e.P().a($$0, 0);
      if ($$1 == null) {
         return false;
      } else {
         etm $$2 = $$1.d();
         if ($$2 == null) {
            return false;
         } else {
            int $$3 = $$2.a - $$0.dz();
            int $$4 = $$2.c - $$0.dF();
            return (double)($$3 * $$3 + $$4 * $$4) <= 2.25;
         }
      }
   }

   public ceg c(int $$0) {
      this.h = $$0;
      return this;
   }
}
