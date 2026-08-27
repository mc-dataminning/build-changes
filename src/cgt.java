import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgt extends cgo implements cgf {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bmo> c = $$0 -> $$0.fh() || $$0.bN();

   public cgt(bmc<? extends cgt> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgt(ctx $$0, bmo $$1) {
      super(bmc.aC, $$1, $$0);
   }

   public cgt(ctx $$0, double $$1, double $$2, double $$3) {
      super(bmc.aC, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cnb s() {
      return cnj.vk;
   }

   @Override
   protected float x() {
      return 0.05F;
   }

   @Override
   protected void a(ely $$0) {
      super.a($$0);
      if (!this.dL().B) {
         cng $$1 = this.q();
         ih<cpe> $$2 = cpg.d($$1);
         List<blj> $$3 = cpg.a($$1);
         boolean $$4 = $$2.a(cph.c) && $$3.isEmpty();
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
   protected void a(ema $$0) {
      super.a($$0);
      if (!this.dL().B) {
         cng $$1 = this.q();
         ih<cpe> $$2 = cpg.d($$1);
         List<blj> $$3 = cpg.a($$1);
         boolean $$4 = $$2.a(cph.c) && $$3.isEmpty();
         if ($$4) {
            this.y();
         } else if (!$$3.isEmpty()) {
            if (this.z()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == ema.a.c ? ((elz)$$0).a() : null);
            }
         }

         int $$5 = $$2.a().b() ? 2007 : 2002;
         this.dL().c($$5, this.dl(), cpg.c($$1));
         this.am();
      }
   }

   private void y() {
      elx $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (bmo $$2 : this.dL().a(bmo.class, $$0, c)) {
         double $$3 = this.f($$2);
         if ($$3 < 16.0) {
            if ($$2.fh()) {
               $$2.a(this.dM().c(this, this.w()), 1.0F);
            }

            if ($$2.bN() && $$2.bx()) {
               $$2.aF();
            }
         }
      }

      for (bzm $$5 : this.dL().a(bzm.class, $$0)) {
         $$5.u();
      }
   }

   private void a(List<blj> $$0, @Nullable blw $$1) {
      elx $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<bmo> $$3 = this.dL().a(bmo.class, $$2);
      if (!$$3.isEmpty()) {
         blw $$4 = this.I();

         for (bmo $$5 : $$3) {
            if ($$5.fy()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (blj $$9 : $$0) {
                     ih<blh> $$10 = $$9.b();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.w(), $$5, $$9.d(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        blj $$12 = new blj($$10, $$11, $$9.d(), $$9.e(), $$9.f());
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

   private void a(cng $$0, ih<cpe> $$1) {
      blt $$2 = new blt(this.dL(), this.dq(), this.ds(), this.dw());
      if (this.w() instanceof bmo $$3) {
         $$2.a($$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (blj $$4 : cpg.b($$0)) {
         $$2.a(new blj($$4));
      }

      so $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dL().b($$2);
   }

   private boolean z() {
      return this.q().a(cnj.vn);
   }

   private void a(hx $$0) {
      djp $$1 = this.dL().a_($$0);
      if ($$1.a(asi.aJ)) {
         this.dL().a($$0, false, this);
      } else if (cvq.c($$1)) {
         cvq.a(null, $$1, this.dL(), $$0);
      } else if (cxm.g($$1)) {
         this.dL().a(null, 1009, $$0, 0);
         cxm.a(this.w(), this.dL(), $$0, $$1);
         this.dL().b($$0, $$1.a(cxm.c, Boolean.valueOf(false)));
      }
   }
}
