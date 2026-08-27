import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cea extends cdv implements cdm {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bkj> c = $$0 -> $$0.fg() || $$0.bM();

   public cea(bjx<? extends cea> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cea(cqz $$0, bkj $$1) {
      super(bjx.aA, $$1, $$0);
   }

   public cea(cqz $$0, double $$1, double $$2, double $$3) {
      super(bjx.aA, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cke s() {
      return ckm.uu;
   }

   @Override
   protected float w() {
      return 0.05F;
   }

   @Override
   protected void a(eib $$0) {
      super.a($$0);
      if (!this.dL().B) {
         ckj $$1 = this.q();
         cmg $$2 = cmi.d($$1);
         List<bjg> $$3 = cmi.a($$1);
         boolean $$4 = $$2 == cmj.c && $$3.isEmpty();
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
   protected void a(eid $$0) {
      super.a($$0);
      if (!this.dL().B) {
         ckj $$1 = this.q();
         cmg $$2 = cmi.d($$1);
         List<bjg> $$3 = cmi.a($$1);
         boolean $$4 = $$2 == cmj.c && $$3.isEmpty();
         if ($$4) {
            this.x();
         } else if (!$$3.isEmpty()) {
            if (this.y()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == eid.a.c ? ((eic)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dL().c($$5, this.dl(), cmi.c($$1));
         this.ak();
      }
   }

   private void x() {
      eia $$0 = this.cG().c(4.0, 2.0, 4.0);

      for (bkj $$2 : this.dL().a(bkj.class, $$0, c)) {
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

      for (bxb $$5 : this.dL().a(bxb.class, $$0)) {
         $$5.s();
      }
   }

   private void a(List<bjg> $$0, @Nullable bjt $$1) {
      eia $$2 = this.cG().c(4.0, 2.0, 4.0);
      List<bkj> $$3 = this.dL().a(bkj.class, $$2);
      if (!$$3.isEmpty()) {
         bjt $$4 = this.G();

         for (bkj $$5 : $$3) {
            if ($$5.fy()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bjg $$9 : $$0) {
                     bje $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.v(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bjg $$12 = new bjg($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(ckj $$0, cmg $$1) {
      bjq $$2 = new bjq(this.dL(), this.dq(), this.ds(), this.dw());
      bjt $$3 = this.v();
      if ($$3 instanceof bkj) {
         $$2.a((bkj)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bjg $$4 : cmi.b($$0)) {
         $$2.a(new bjg($$4));
      }

      rt $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dL().b($$2);
   }

   private boolean y() {
      return this.q().a(ckm.ux);
   }

   private void a(ht $$0) {
      dgb $$1 = this.dL().a_($$0);
      if ($$1.a(aqs.aJ)) {
         this.dL().a($$0, false, this);
      } else if (csr.c($$1)) {
         csr.a(null, $$1, this.dL(), $$0);
      } else if (cuo.g($$1)) {
         this.dL().a(null, 1009, $$0, 0);
         cuo.a(this.v(), this.dL(), $$0, $$1);
         this.dL().b($$0, $$1.a(cuo.c, Boolean.valueOf(false)));
      }
   }
}
