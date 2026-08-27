import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccs extends ccn implements cce {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bjb> c = $$0 -> $$0.fe() || $$0.bM();

   public ccs(bip<? extends ccs> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public ccs(cpq $$0, bjb $$1) {
      super(bip.aA, $$1, $$0);
   }

   public ccs(cpq $$0, double $$1, double $$2, double $$3) {
      super(bip.aA, $$1, $$2, $$3, $$0);
   }

   @Override
   protected civ m() {
      return cjd.uu;
   }

   @Override
   protected float p() {
      return 0.05F;
   }

   @Override
   protected void a(ehe $$0) {
      super.a($$0);
      if (!this.dK().B) {
         cja $$1 = this.j();
         ckx $$2 = ckz.d($$1);
         List<bhy> $$3 = ckz.a($$1);
         boolean $$4 = $$2 == cla.c && $$3.isEmpty();
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
   protected void a(ehg $$0) {
      super.a($$0);
      if (!this.dK().B) {
         cja $$1 = this.j();
         ckx $$2 = ckz.d($$1);
         List<bhy> $$3 = ckz.a($$1);
         boolean $$4 = $$2 == cla.c && $$3.isEmpty();
         if ($$4) {
            this.q();
         } else if (!$$3.isEmpty()) {
            if (this.r()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == ehg.a.c ? ((ehf)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dK().c($$5, this.dk(), ckz.c($$1));
         this.ak();
      }
   }

   private void q() {
      ehd $$0 = this.cG().c(4.0, 2.0, 4.0);

      for (bjb $$2 : this.dK().a(bjb.class, $$0, c)) {
         double $$3 = this.f($$2);
         if ($$3 < 16.0) {
            if ($$2.fe()) {
               $$2.a(this.dL().c(this, this.v()), 1.0F);
            }

            if ($$2.bM() && $$2.bv()) {
               $$2.aD();
            }
         }
      }

      for (bvt $$5 : this.dK().a(bvt.class, $$0)) {
         $$5.p();
      }
   }

   private void a(List<bhy> $$0, @Nullable bil $$1) {
      ehd $$2 = this.cG().c(4.0, 2.0, 4.0);
      List<bjb> $$3 = this.dK().a(bjb.class, $$2);
      if (!$$3.isEmpty()) {
         bil $$4 = this.A();

         for (bjb $$5 : $$3) {
            if ($$5.fw()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bhy $$9 : $$0) {
                     bhw $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.v(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bhy $$12 = new bhy($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cja $$0, ckx $$1) {
      bii $$2 = new bii(this.dK(), this.dp(), this.dr(), this.dv());
      bil $$3 = this.v();
      if ($$3 instanceof bjb) {
         $$2.a((bjb)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bhy $$4 : ckz.b($$0)) {
         $$2.a(new bhy($$4));
      }

      qu $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dK().b($$2);
   }

   private boolean r() {
      return this.j().a(cjd.ux);
   }

   private void a(gw $$0) {
      dfe $$1 = this.dK().a_($$0);
      if ($$1.a(apo.aJ)) {
         this.dK().a($$0, false, this);
      } else if (cri.c($$1)) {
         cri.a(null, $$1, this.dK(), $$0);
      } else if (ctd.g($$1)) {
         this.dK().a(null, 1009, $$0, 0);
         ctd.a(this.v(), this.dK(), $$0, $$1);
         this.dK().b($$0, $$1.a(ctd.b, Boolean.valueOf(false)));
      }
   }
}
