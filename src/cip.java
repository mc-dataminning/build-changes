import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cip extends cik implements cia {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<boi> c = $$0 -> $$0.fh() || $$0.bN();

   public cip(bnw<? extends cip> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cip(cvr $$0, boi $$1) {
      super(bnw.aC, $$1, $$0);
   }

   public cip(cvr $$0, double $$1, double $$2, double $$3) {
      super(bnw.aC, $$1, $$2, $$3, $$0);
   }

   @Override
   protected coy s() {
      return cpg.vk;
   }

   @Override
   protected float x() {
      return 0.05F;
   }

   @Override
   protected void a(env $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cpd $$1 = this.q();
         ij<cqz> $$2 = crb.d($$1);
         List<bnd> $$3 = crb.a($$1);
         boolean $$4 = $$2.a(crc.c) && $$3.isEmpty();
         ie $$5 = $$0.b();
         hz $$6 = $$0.a();
         hz $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (ie $$8 : ie.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(enx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cpd $$1 = this.q();
         ij<cqz> $$2 = crb.d($$1);
         List<bnd> $$3 = crb.a($$1);
         boolean $$4 = $$2.a(crc.c) && $$3.isEmpty();
         if ($$4) {
            this.y();
         } else if (!$$3.isEmpty()) {
            if (this.z()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == enx.a.c ? ((enw)$$0).a() : null);
            }
         }

         int $$5 = $$2.a().b() ? 2007 : 2002;
         this.dM().c($$5, this.dm(), crb.c($$1));
         this.am();
      }
   }

   private void y() {
      enu $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (boi $$2 : this.dM().a(boi.class, $$0, c)) {
         double $$3 = this.f($$2);
         if ($$3 < 16.0) {
            if ($$2.fh()) {
               $$2.a(this.dN().c(this, this.w()), 1.0F);
            }

            if ($$2.bN() && $$2.bx()) {
               $$2.aF();
            }
         }
      }

      for (cbh $$5 : this.dM().a(cbh.class, $$0)) {
         $$5.u();
      }
   }

   private void a(List<bnd> $$0, @Nullable bnq $$1) {
      enu $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<boi> $$3 = this.dM().a(boi.class, $$2);
      if (!$$3.isEmpty()) {
         bnq $$4 = this.I();

         for (boi $$5 : $$3) {
            if ($$5.fy()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bnd $$9 : $$0) {
                     ij<bnb> $$10 = $$9.b();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.w(), $$5, $$9.d(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bnd $$12 = new bnd($$10, $$11, $$9.d(), $$9.e(), $$9.f());
                        if (!$$12.a(20)) {
                           $$5.b($$12, $$4);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void a(cpd $$0, ij<cqz> $$1) {
      bnn $$2 = new bnn(this.dM(), this.dr(), this.dt(), this.dx());
      if (this.w() instanceof boi $$3) {
         $$2.a($$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bnd $$4 : crb.b($$0)) {
         $$2.a(new bnd($$4));
      }

      sw $$5 = $$0.w();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dM().b($$2);
   }

   private boolean z() {
      return this.q().a(cpg.vn);
   }

   private void a(hz $$0) {
      dlj $$1 = this.dM().a_($$0);
      if ($$1.a(aua.aJ)) {
         this.dM().a($$0, false, this);
      } else if (cxk.c($$1)) {
         cxk.a(null, $$1, this.dM(), $$0);
      } else if (czg.g($$1)) {
         this.dM().a(null, 1009, $$0, 0);
         czg.a(this.w(), this.dM(), $$0, $$1);
         this.dM().b($$0, $$1.a(czg.c, Boolean.valueOf(false)));
      }
   }
}
