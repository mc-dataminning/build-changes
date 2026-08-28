import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvv extends cvd {
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
   private final cvp y;
   private final crj z;
   private boolean A;

   public cvv(int $$0, cri $$1) {
      this($$0, $$1, cvp.a);
   }

   public cvv(int $$0, cri $$1, cvp $$2) {
      super(cwl.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.h;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(cvc $$0, arq $$1, crj $$2, cvu $$3, cwu $$4, @Nullable deg<ddq> $$5) {
      ddp $$6 = $$3.ay_();
      arr $$7 = (arr)$$2;
      czk $$8 = czk.k;
      Optional<deg<ddq>> $$9 = $$1.p().aI().a(dem.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         deg<ddq> $$10 = $$9.get();
         ddq $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            czk $$12 = $$11.a($$6, $$1.F_());
            if ($$12.a($$1.K())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new acq($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(btz $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof arq $$2) {
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
   public void a(arq $$0, deg<ddq> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(crj $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(crj $$0) {
      return a(this.y, $$0, dmo.cL);
   }

   @Override
   public czk b(crj $$0, int $$1) {
      czk $$2 = czk.k;
      cwz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return czk.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return czk.k;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return czk.k;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return czk.k;
         }

         if ($$4.f()) {
            $$3.e(czk.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czk.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(czk $$0, cwz $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cwz m() {
      return this.k.get(0);
   }

   @Override
   public List<cwz> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cws aj_() {
      return cws.a;
   }

   @Override
   protected crj q() {
      return this.z;
   }
}
