import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cep extends cek implements ceb {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bky> c = $$0 -> $$0.fg() || $$0.bM();

   public cep(bkm<? extends cep> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cep(crs $$0, bky $$1) {
      super(bkm.aA, $$1, $$0);
   }

   public cep(crs $$0, double $$1, double $$2, double $$3) {
      super(bkm.aA, $$1, $$2, $$3, $$0);
   }

   @Override
   protected ckw s() {
      return cle.uv;
   }

   @Override
   protected float w() {
      return 0.05F;
   }

   @Override
   protected void a(eje $$0) {
      super.a($$0);
      if (!this.dL().B) {
         clb $$1 = this.q();
         cmy $$2 = cna.d($$1);
         List<bjv> $$3 = cna.a($$1);
         boolean $$4 = $$2 == cnb.c && $$3.isEmpty();
         hx $$5 = $$0.b();
         ht $$6 = $$0.a();
         ht $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (hx $$8 : hx.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(ejg $$0) {
      super.a($$0);
      if (!this.dL().B) {
         clb $$1 = this.q();
         cmy $$2 = cna.d($$1);
         List<bjv> $$3 = cna.a($$1);
         boolean $$4 = $$2 == cnb.c && $$3.isEmpty();
         if ($$4) {
            this.x();
         } else if (!$$3.isEmpty()) {
            if (this.y()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == ejg.a.c ? ((ejf)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dL().c($$5, this.dl(), cna.c($$1));
         this.ak();
      }
   }

   private void x() {
      ejd $$0 = this.cG().c(4.0, 2.0, 4.0);

      for (bky $$2 : this.dL().a(bky.class, $$0, c)) {
         double $$3 = this.f($$2);
         if ($$3 < 16.0) {
            if ($$2.fg()) {
               $$2.a(this.dM().c(this, this.v()), 1.0F);
            }

            if ($$2.bM() && $$2.bv()) {
               $$2.aD();
            }
         }
      }

      for (bxq $$5 : this.dL().a(bxq.class, $$0)) {
         $$5.s();
      }
   }

   private void a(List<bjv> $$0, @Nullable bki $$1) {
      ejd $$2 = this.cG().c(4.0, 2.0, 4.0);
      List<bky> $$3 = this.dL().a(bky.class, $$2);
      if (!$$3.isEmpty()) {
         bki $$4 = this.G();

         for (bky $$5 : $$3) {
            if ($$5.fy()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bjv $$9 : $$0) {
                     bjt $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.v(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bjv $$12 = new bjv($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(clb $$0, cmy $$1) {
      bkf $$2 = new bkf(this.dL(), this.dq(), this.ds(), this.dw());
      bki $$3 = this.v();
      if ($$3 instanceof bky) {
         $$2.a((bky)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bjv $$4 : cna.b($$0)) {
         $$2.a(new bjv($$4));
      }

      rz $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dL().b($$2);
   }

   private boolean y() {
      return this.q().a(cle.uy);
   }

   private void a(ht $$0) {
      dgw $$1 = this.dL().a_($$0);
      if ($$1.a(arc.aJ)) {
         this.dL().a($$0, false, this);
      } else if (ctk.c($$1)) {
         ctk.a(null, $$1, this.dL(), $$0);
      } else if (cvh.g($$1)) {
         this.dL().a(null, 1009, $$0, 0);
         cvh.a(this.v(), this.dL(), $$0, $$1);
         this.dL().b($$0, $$1.a(cvh.c, Boolean.valueOf(false)));
      }
   }
}
