import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccz extends ccu implements ccl {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bji> c = $$0 -> $$0.ff() || $$0.bM();

   public ccz(biw<? extends ccz> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public ccz(cpx $$0, bji $$1) {
      super(biw.aA, $$1, $$0);
   }

   public ccz(cpx $$0, double $$1, double $$2, double $$3) {
      super(biw.aA, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cjc s() {
      return cjk.uu;
   }

   @Override
   protected float w() {
      return 0.05F;
   }

   @Override
   protected void a(ehl $$0) {
      super.a($$0);
      if (!this.dL().B) {
         cjh $$1 = this.q();
         cle $$2 = clg.d($$1);
         List<bif> $$3 = clg.a($$1);
         boolean $$4 = $$2 == clh.c && $$3.isEmpty();
         hc $$5 = $$0.b();
         gw $$6 = $$0.a();
         gw $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (hc $$8 : hc.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(ehn $$0) {
      super.a($$0);
      if (!this.dL().B) {
         cjh $$1 = this.q();
         cle $$2 = clg.d($$1);
         List<bif> $$3 = clg.a($$1);
         boolean $$4 = $$2 == clh.c && $$3.isEmpty();
         if ($$4) {
            this.x();
         } else if (!$$3.isEmpty()) {
            if (this.y()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == ehn.a.c ? ((ehm)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dL().c($$5, this.dl(), clg.c($$1));
         this.ak();
      }
   }

   private void x() {
      ehk $$0 = this.cG().c(4.0, 2.0, 4.0);

      for (bji $$2 : this.dL().a(bji.class, $$0, c)) {
         double $$3 = this.f($$2);
         if ($$3 < 16.0) {
            if ($$2.ff()) {
               $$2.a(this.dM().c(this, this.v()), 1.0F);
            }

            if ($$2.bM() && $$2.bv()) {
               $$2.aD();
            }
         }
      }

      for (bwa $$5 : this.dL().a(bwa.class, $$0)) {
         $$5.s();
      }
   }

   private void a(List<bif> $$0, @Nullable bis $$1) {
      ehk $$2 = this.cG().c(4.0, 2.0, 4.0);
      List<bji> $$3 = this.dL().a(bji.class, $$2);
      if (!$$3.isEmpty()) {
         bis $$4 = this.G();

         for (bji $$5 : $$3) {
            if ($$5.fx()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bif $$9 : $$0) {
                     bid $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.v(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bif $$12 = new bif($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cjh $$0, cle $$1) {
      bip $$2 = new bip(this.dL(), this.dq(), this.ds(), this.dw());
      bis $$3 = this.v();
      if ($$3 instanceof bji) {
         $$2.a((bji)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bif $$4 : clg.b($$0)) {
         $$2.a(new bif($$4));
      }

      qy $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dL().b($$2);
   }

   private boolean y() {
      return this.q().a(cjk.ux);
   }

   private void a(gw $$0) {
      dfl $$1 = this.dL().a_($$0);
      if ($$1.a(apu.aJ)) {
         this.dL().a($$0, false, this);
      } else if (crp.c($$1)) {
         crp.a(null, $$1, this.dL(), $$0);
      } else if (ctk.g($$1)) {
         this.dL().a(null, 1009, $$0, 0);
         ctk.a(this.v(), this.dL(), $$0, $$1);
         this.dL().b($$0, $$1.a(ctk.b, Boolean.valueOf(false)));
      }
   }
}
