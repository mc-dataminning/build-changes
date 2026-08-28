import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cst extends csb {
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
   private final csn y;
   private final cov z;
   private boolean A;

   public cst(int $$0, cou $$1) {
      this($$0, $$1, csn.a);
   }

   public cst(int $$0, cou $$1, csn $$2) {
      super(ctj.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(csa $$0, arc $$1, cov $$2, css $$3, cts $$4, @Nullable dbh<dar> $$5) {
      daq $$6 = $$3.aB_();
      ard $$7 = (ard)$$2;
      cwn $$8 = cwn.j;
      Optional<dbh<dar>> $$9 = $$1.p().aI().a(dbn.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dbh<dar> $$10 = $$9.get();
         dar $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            cwn $$12 = $$11.a($$6, $$1.K_());
            if ($$12.a($$1.K())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new ach($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(bsb $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof arc $$2) {
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
   public void a(arc $$0, dbh<dar> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(cov $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cov $$0) {
      return a(this.y, $$0, djm.cI);
   }

   @Override
   public cwn b(cov $$0, int $$1) {
      cwn $$2 = cwn.j;
      ctx $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cwn.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cwn.j;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cwn.j;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cwn.j;
         }

         if ($$4.f()) {
            $$3.e(cwn.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwn.j;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cwn $$0, ctx $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public ctx m() {
      return this.k.get(0);
   }

   @Override
   public List<ctx> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public ctq am_() {
      return ctq.a;
   }

   @Override
   protected cov q() {
      return this.z;
   }
}
