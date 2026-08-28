import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvd extends cul {
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
   private final cux y;
   private final cqs z;
   private boolean A;

   public cvd(int $$0, cqr $$1) {
      this($$0, $$1, cux.a);
   }

   public cvd(int $$0, cqr $$1, cux $$2) {
      super(cvt.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(cuk $$0, aro $$1, cqs $$2, cvc $$3, cwc $$4, @Nullable ddo<dcy> $$5) {
      dcx $$6 = $$3.ax_();
      arp $$7 = (arp)$$2;
      cys $$8 = cys.k;
      Optional<ddo<dcy>> $$9 = $$1.p().aI().a(ddu.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         ddo<dcy> $$10 = $$9.get();
         dcy $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            cys $$12 = $$11.a($$6, $$1.F_());
            if ($$12.a($$1.K())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new aco($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(btr $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof aro $$2) {
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
   public void a(aro $$0, ddo<dcy> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(cqs $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cqs $$0) {
      return a(this.y, $$0, dlw.cI);
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cys.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cys.k;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cys.k;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cys.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cys $$0, cwh $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cwh m() {
      return this.k.get(0);
   }

   @Override
   public List<cwh> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cwa ai_() {
      return cwa.a;
   }

   @Override
   protected cqs q() {
      return this.z;
   }
}
