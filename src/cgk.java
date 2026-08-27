import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgk extends cgf implements cfw {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bmk> c = $$0 -> $$0.fh() || $$0.bN();

   public cgk(bly<? extends cgk> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cgk(cto $$0, bmk $$1) {
      super(bly.aB, $$1, $$0);
   }

   public cgk(cto $$0, double $$1, double $$2, double $$3) {
      super(bly.aB, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cms s() {
      return cna.vh;
   }

   @Override
   protected float x() {
      return 0.05F;
   }

   @Override
   protected void a(elo $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cmx $$1 = this.q();
         cov $$2 = cox.d($$1);
         List<blh> $$3 = cox.a($$1);
         boolean $$4 = $$2 == coy.c && $$3.isEmpty();
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
   protected void a(elq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cmx $$1 = this.q();
         cov $$2 = cox.d($$1);
         List<blh> $$3 = cox.a($$1);
         boolean $$4 = $$2 == coy.c && $$3.isEmpty();
         if ($$4) {
            this.y();
         } else if (!$$3.isEmpty()) {
            if (this.z()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == elq.a.c ? ((elp)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dM().c($$5, this.dm(), cox.c($$1));
         this.am();
      }
   }

   private void y() {
      eln $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (bmk $$2 : this.dM().a(bmk.class, $$0, c)) {
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

      for (bze $$5 : this.dM().a(bze.class, $$0)) {
         $$5.u();
      }
   }

   private void a(List<blh> $$0, @Nullable blu $$1) {
      eln $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<bmk> $$3 = this.dM().a(bmk.class, $$2);
      if (!$$3.isEmpty()) {
         blu $$4 = this.J();

         for (bmk $$5 : $$3) {
            if ($$5.fy()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (blh $$9 : $$0) {
                     blf $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.w(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        blh $$12 = new blh($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cmx $$0, cov $$1) {
      blr $$2 = new blr(this.dM(), this.dr(), this.dt(), this.dx());
      blu $$3 = this.w();
      if ($$3 instanceof bmk) {
         $$2.a((bmk)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (blh $$4 : cox.b($$0)) {
         $$2.a(new blh($$4));
      }

      sn $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dM().b($$2);
   }

   private boolean z() {
      return this.q().a(cna.vk);
   }

   private void a(hx $$0) {
      djg $$1 = this.dM().a_($$0);
      if ($$1.a(asg.aJ)) {
         this.dM().a($$0, false, this);
      } else if (cvh.c($$1)) {
         cvh.a(null, $$1, this.dM(), $$0);
      } else if (cxd.g($$1)) {
         this.dM().a(null, 1009, $$0, 0);
         cxd.a(this.w(), this.dM(), $$0, $$1);
         this.dM().b($$0, $$1.a(cxd.c, Boolean.valueOf(false)));
      }
   }
}
