import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwl extends cvt {
   private static final int p = 3;
   private static final int q = 3;
   public static final int o = 0;
   private static final int r = 1;
   private static final int s = 9;
   private static final int t = 10;
   private static final int u = 10;
   private static final int v = 37;
   private static final int w = 37;
   private static final int x = 46;
   private final cwf y;
   private final crz z;
   private boolean A;

   public cwl(int $$0, cry $$1) {
      this($$0, $$1, cwf.a);
   }

   public cwl(int $$0, cry $$1, cwf $$2) {
      super(cxb.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.h;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(cvs $$0, aru $$1, crz $$2, cwk $$3, cxk $$4, @Nullable dew<deg> $$5) {
      def $$6 = $$3.aC_();
      arv $$7 = (arv)$$2;
      daa $$8 = daa.k;
      Optional<dew<deg>> $$9 = $$1.p().aI().a(dfc.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dew<deg> $$10 = $$9.get();
         deg $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            daa $$12 = $$11.a($$6, $$1.J_());
            if ($$12.a($$1.K())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new acu($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(bum $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof aru $$2) {
               a(this, $$2, this.z, this.m, this.n, null);
            }
         });
      }
   }

   @Override
   public void l() {
      this.A = true;
   }

   @Override
   public void a(aru $$0, dew<deg> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(crz $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(crz $$0) {
      return a(this.y, $$0, dng.cL);
   }

   @Override
   public daa b(crz $$0, int $$1) {
      daa $$2 = daa.k;
      cxp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         daa $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return daa.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return daa.k;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return daa.k;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return daa.k;
         }

         if ($$4.f()) {
            $$3.e(daa.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return daa.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(daa $$0, cxp $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cxp m() {
      return this.k.get(0);
   }

   @Override
   public List<cxp> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cxi an_() {
      return cxi.a;
   }

   @Override
   protected crz q() {
      return this.z;
   }
}
