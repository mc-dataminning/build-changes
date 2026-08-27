import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cge extends cfz implements cfq {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bmf> c = $$0 -> $$0.fh() || $$0.bN();

   public cge(blt<? extends cge> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cge(cti $$0, bmf $$1) {
      super(blt.aB, $$1, $$0);
   }

   public cge(cti $$0, double $$1, double $$2, double $$3) {
      super(blt.aB, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cmm s() {
      return cmu.vh;
   }

   @Override
   protected float x() {
      return 0.05F;
   }

   @Override
   protected void a(eli $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cmr $$1 = this.q();
         cop $$2 = cor.d($$1);
         List<blc> $$3 = cor.a($$1);
         boolean $$4 = $$2 == cos.c && $$3.isEmpty();
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
   protected void a(elk $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cmr $$1 = this.q();
         cop $$2 = cor.d($$1);
         List<blc> $$3 = cor.a($$1);
         boolean $$4 = $$2 == cos.c && $$3.isEmpty();
         if ($$4) {
            this.y();
         } else if (!$$3.isEmpty()) {
            if (this.z()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == elk.a.c ? ((elj)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dM().c($$5, this.dm(), cor.c($$1));
         this.am();
      }
   }

   private void y() {
      elh $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (bmf $$2 : this.dM().a(bmf.class, $$0, c)) {
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

      for (byz $$5 : this.dM().a(byz.class, $$0)) {
         $$5.u();
      }
   }

   private void a(List<blc> $$0, @Nullable blp $$1) {
      elh $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<bmf> $$3 = this.dM().a(bmf.class, $$2);
      if (!$$3.isEmpty()) {
         blp $$4 = this.J();

         for (bmf $$5 : $$3) {
            if ($$5.fy()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (blc $$9 : $$0) {
                     bla $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.w(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        blc $$12 = new blc($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cmr $$0, cop $$1) {
      blm $$2 = new blm(this.dM(), this.dr(), this.dt(), this.dx());
      blp $$3 = this.w();
      if ($$3 instanceof bmf) {
         $$2.a((bmf)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (blc $$4 : cor.b($$0)) {
         $$2.a(new blc($$4));
      }

      sl $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dM().b($$2);
   }

   private boolean z() {
      return this.q().a(cmu.vk);
   }

   private void a(hx $$0) {
      dja $$1 = this.dM().a_($$0);
      if ($$1.a(asb.aJ)) {
         this.dM().a($$0, false, this);
      } else if (cvb.c($$1)) {
         cvb.a(null, $$1, this.dM(), $$0);
      } else if (cwx.g($$1)) {
         this.dM().a(null, 1009, $$0, 0);
         cwx.a(this.w(), this.dM(), $$0, $$1);
         this.dM().b($$0, $$1.a(cwx.c, Boolean.valueOf(false)));
      }
   }
}
