import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cco extends ccj implements cca {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<biw> c = $$0 -> $$0.fe() || $$0.bM();

   public cco(bik<? extends cco> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cco(cpk $$0, biw $$1) {
      super(bik.aA, $$1, $$0);
   }

   public cco(cpk $$0, double $$1, double $$2, double $$3) {
      super(bik.aA, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cir m() {
      return ciz.uu;
   }

   @Override
   protected float p() {
      return 0.05F;
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      if (!this.dK().B) {
         ciw $$1 = this.j();
         ckt $$2 = ckv.d($$1);
         List<bht> $$3 = ckv.a($$1);
         boolean $$4 = $$2 == ckw.c && $$3.isEmpty();
         hb $$5 = $$0.b();
         gv $$6 = $$0.a();
         gv $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (hb $$8 : hb.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(ehd $$0) {
      super.a($$0);
      if (!this.dK().B) {
         ciw $$1 = this.j();
         ckt $$2 = ckv.d($$1);
         List<bht> $$3 = ckv.a($$1);
         boolean $$4 = $$2 == ckw.c && $$3.isEmpty();
         if ($$4) {
            this.q();
         } else if (!$$3.isEmpty()) {
            if (this.r()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == ehd.a.c ? ((ehc)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dK().c($$5, this.dk(), ckv.c($$1));
         this.ak();
      }
   }

   private void q() {
      eha $$0 = this.cG().c(4.0, 2.0, 4.0);

      for (biw $$2 : this.dK().a(biw.class, $$0, c)) {
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

      for (bvp $$5 : this.dK().a(bvp.class, $$0)) {
         $$5.p();
      }
   }

   private void a(List<bht> $$0, @Nullable big $$1) {
      eha $$2 = this.cG().c(4.0, 2.0, 4.0);
      List<biw> $$3 = this.dK().a(biw.class, $$2);
      if (!$$3.isEmpty()) {
         big $$4 = this.A();

         for (biw $$5 : $$3) {
            if ($$5.fw()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bht $$9 : $$0) {
                     bhr $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.v(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bht $$12 = new bht($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(ciw $$0, ckt $$1) {
      bid $$2 = new bid(this.dK(), this.dp(), this.dr(), this.dv());
      big $$3 = this.v();
      if ($$3 instanceof biw) {
         $$2.a((biw)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bht $$4 : ckv.b($$0)) {
         $$2.a(new bht($$4));
      }

      qs $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dK().b($$2);
   }

   private boolean r() {
      return this.j().a(ciz.ux);
   }

   private void a(gv $$0) {
      dey $$1 = this.dK().a_($$0);
      if ($$1.a(apj.aJ)) {
         this.dK().a($$0, false);
      } else if (crc.c($$1)) {
         crc.a(null, $$1, this.dK(), $$0);
      } else if (csx.g($$1)) {
         this.dK().a(null, 1009, $$0, 0);
         csx.a(this.v(), this.dK(), $$0, $$1);
         this.dK().b($$0, $$1.a(csx.b, Boolean.valueOf(false)));
      }
   }
}
