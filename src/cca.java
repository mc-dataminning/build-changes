import javax.annotation.Nullable;

public abstract class cca extends caa {
   private static final int a = 0;
   private static final int b = 1;
   private static final int c = 2;
   protected final bte e;
   protected final boolean f;
   private final boolean d;
   private int i;
   private int j;
   private int k;
   @Nullable
   protected btc g;
   protected int h = 60;

   public cca(bte $$0, boolean $$1) {
      this($$0, $$1, false);
   }

   public cca(bte $$0, boolean $$1, boolean $$2) {
      this.e = $$0;
      this.f = $$1;
      this.d = $$2;
   }

   @Override
   public boolean b() {
      btc $$0 = this.e.p();
      if ($$0 == null) {
         $$0 = this.g;
      }

      if ($$0 == null) {
         return false;
      } else if (!this.e.c($$0)) {
         return false;
      } else {
         exn $$1 = this.e.cl();
         exn $$2 = $$0.cl();
         if ($$1 != null && $$2 == $$1) {
            return false;
         } else {
            double $$3 = this.l();
            if (this.e.g((bsh)$$0) > $$3 * $$3) {
               return false;
            } else {
               if (this.f) {
                  if (this.e.L().a($$0)) {
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
      return this.e.g(buk.m);
   }

   @Override
   public void c() {
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   @Override
   public void d() {
      this.e.h(null);
      this.g = null;
   }

   protected boolean a(@Nullable btc $$0, cdt $$1) {
      if ($$0 == null) {
         return false;
      } else if (!$$1.a(this.e, $$0)) {
         return false;
      } else if (!this.e.a($$0.dr())) {
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

   private boolean a(btc $$0) {
      this.j = b(10 + this.e.dU().a(5));
      eox $$1 = this.e.J().a($$0, 0);
      if ($$1 == null) {
         return false;
      } else {
         eov $$2 = $$1.d();
         if ($$2 == null) {
            return false;
         } else {
            int $$3 = $$2.a - $$0.dv();
            int $$4 = $$2.c - $$0.dB();
            return (double)($$3 * $$3 + $$4 * $$4) <= 2.25;
         }
      }
   }

   public cca c(int $$0) {
      this.h = $$0;
      return this;
   }
}
