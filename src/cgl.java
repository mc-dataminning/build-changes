import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgl extends cgg implements cfx {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bml> c = $$0 -> $$0.fh() || $$0.bN();

   public cgl(blz<? extends cgl> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public cgl(ctp $$0, bml $$1) {
      super(blz.aB, $$1, $$0);
   }

   public cgl(ctp $$0, double $$1, double $$2, double $$3) {
      super(blz.aB, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cmt s() {
      return cnb.vh;
   }

   @Override
   protected float x() {
      return 0.05F;
   }

   @Override
   protected void a(elp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cmy $$1 = this.q();
         cow $$2 = coy.d($$1);
         List<bli> $$3 = coy.a($$1);
         boolean $$4 = $$2 == coz.c && $$3.isEmpty();
         ic $$5 = $$0.b();
         hx $$6 = $$0.a();
         hx $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (ic $$8 : ic.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(elr $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cmy $$1 = this.q();
         cow $$2 = coy.d($$1);
         List<bli> $$3 = coy.a($$1);
         boolean $$4 = $$2 == coz.c && $$3.isEmpty();
         if ($$4) {
            this.y();
         } else if (!$$3.isEmpty()) {
            if (this.z()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == elr.a.c ? ((elq)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dM().c($$5, this.dm(), coy.c($$1));
         this.am();
      }
   }

   private void y() {
      elo $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (bml $$2 : this.dM().a(bml.class, $$0, c)) {
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

      for (bzf $$5 : this.dM().a(bzf.class, $$0)) {
         $$5.u();
      }
   }

   private void a(List<bli> $$0, @Nullable blv $$1) {
      elo $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<bml> $$3 = this.dM().a(bml.class, $$2);
      if (!$$3.isEmpty()) {
         blv $$4 = this.J();

         for (bml $$5 : $$3) {
            if ($$5.fy()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bli $$9 : $$0) {
                     blg $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.w(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bli $$12 = new bli($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cmy $$0, cow $$1) {
      bls $$2 = new bls(this.dM(), this.dr(), this.dt(), this.dx());
      blv $$3 = this.w();
      if ($$3 instanceof bml) {
         $$2.a((bml)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bli $$4 : coy.b($$0)) {
         $$2.a(new bli($$4));
      }

      sn $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dM().b($$2);
   }

   private boolean z() {
      return this.q().a(cnb.vk);
   }

   private void a(hx $$0) {
      djh $$1 = this.dM().a_($$0);
      if ($$1.a(ash.aJ)) {
         this.dM().a($$0, false, this);
      } else if (cvi.c($$1)) {
         cvi.a(null, $$1, this.dM(), $$0);
      } else if (cxe.g($$1)) {
         this.dM().a(null, 1009, $$0, 0);
         cxe.a(this.w(), this.dM(), $$0, $$1);
         this.dM().b($$0, $$1.a(cxe.c, Boolean.valueOf(false)));
      }
   }
}
