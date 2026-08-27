import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccp extends cck implements ccb {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<biy> c = $$0 -> $$0.fe() || $$0.bM();

   public ccp(bim<? extends ccp> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public ccp(cpl $$0, biy $$1) {
      super(bim.aA, $$1, $$0);
   }

   public ccp(cpl $$0, double $$1, double $$2, double $$3) {
      super(bim.aA, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cis m() {
      return cja.uu;
   }

   @Override
   protected float p() {
      return 0.05F;
   }

   @Override
   protected void a(egz $$0) {
      super.a($$0);
      if (!this.dK().B) {
         cix $$1 = this.j();
         cku $$2 = ckw.d($$1);
         List<bhv> $$3 = ckw.a($$1);
         boolean $$4 = $$2 == ckx.c && $$3.isEmpty();
         ha $$5 = $$0.b();
         gu $$6 = $$0.a();
         gu $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (ha $$8 : ha.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      if (!this.dK().B) {
         cix $$1 = this.j();
         cku $$2 = ckw.d($$1);
         List<bhv> $$3 = ckw.a($$1);
         boolean $$4 = $$2 == ckx.c && $$3.isEmpty();
         if ($$4) {
            this.q();
         } else if (!$$3.isEmpty()) {
            if (this.r()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == ehb.a.c ? ((eha)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dK().c($$5, this.dk(), ckw.c($$1));
         this.ak();
      }
   }

   private void q() {
      egy $$0 = this.cG().c(4.0, 2.0, 4.0);

      for (biy $$2 : this.dK().a(biy.class, $$0, c)) {
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

      for (bvq $$5 : this.dK().a(bvq.class, $$0)) {
         $$5.p();
      }
   }

   private void a(List<bhv> $$0, @Nullable bii $$1) {
      egy $$2 = this.cG().c(4.0, 2.0, 4.0);
      List<biy> $$3 = this.dK().a(biy.class, $$2);
      if (!$$3.isEmpty()) {
         bii $$4 = this.A();

         for (biy $$5 : $$3) {
            if ($$5.fw()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bhv $$9 : $$0) {
                     bht $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.v(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bhv $$12 = new bhv($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cix $$0, cku $$1) {
      bif $$2 = new bif(this.dK(), this.dp(), this.dr(), this.dv());
      bii $$3 = this.v();
      if ($$3 instanceof biy) {
         $$2.a((biy)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bhv $$4 : ckw.b($$0)) {
         $$2.a(new bhv($$4));
      }

      qr $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dK().b($$2);
   }

   private boolean r() {
      return this.j().a(cja.ux);
   }

   private void a(gu $$0) {
      dez $$1 = this.dK().a_($$0);
      if ($$1.a(apl.aJ)) {
         this.dK().a($$0, false, this);
      } else if (crd.c($$1)) {
         crd.a(null, $$1, this.dK(), $$0);
      } else if (csy.g($$1)) {
         this.dK().a(null, 1009, $$0, 0);
         csy.a(this.v(), this.dK(), $$0, $$1);
         this.dK().b($$0, $$1.a(csy.b, Boolean.valueOf(false)));
      }
   }
}
