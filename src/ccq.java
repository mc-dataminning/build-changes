import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccq extends ccl implements ccc {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<biy> c = $$0 -> $$0.fe() || $$0.bM();

   public ccq(bim<? extends ccq> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public ccq(cpm $$0, biy $$1) {
      super(bim.aA, $$1, $$0);
   }

   public ccq(cpm $$0, double $$1, double $$2, double $$3) {
      super(bim.aA, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cit m() {
      return cjb.uu;
   }

   @Override
   protected float p() {
      return 0.05F;
   }

   @Override
   protected void a(eha $$0) {
      super.a($$0);
      if (!this.dK().B) {
         ciy $$1 = this.j();
         ckv $$2 = ckx.d($$1);
         List<bhv> $$3 = ckx.a($$1);
         boolean $$4 = $$2 == cky.c && $$3.isEmpty();
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
   protected void a(ehc $$0) {
      super.a($$0);
      if (!this.dK().B) {
         ciy $$1 = this.j();
         ckv $$2 = ckx.d($$1);
         List<bhv> $$3 = ckx.a($$1);
         boolean $$4 = $$2 == cky.c && $$3.isEmpty();
         if ($$4) {
            this.q();
         } else if (!$$3.isEmpty()) {
            if (this.r()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == ehc.a.c ? ((ehb)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dK().c($$5, this.dk(), ckx.c($$1));
         this.ak();
      }
   }

   private void q() {
      egz $$0 = this.cG().c(4.0, 2.0, 4.0);

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

      for (bvr $$5 : this.dK().a(bvr.class, $$0)) {
         $$5.p();
      }
   }

   private void a(List<bhv> $$0, @Nullable bii $$1) {
      egz $$2 = this.cG().c(4.0, 2.0, 4.0);
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

   private void a(ciy $$0, ckv $$1) {
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

      for (bhv $$4 : ckx.b($$0)) {
         $$2.a(new bhv($$4));
      }

      qr $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dK().b($$2);
   }

   private boolean r() {
      return this.j().a(cjb.ux);
   }

   private void a(gu $$0) {
      dfa $$1 = this.dK().a_($$0);
      if ($$1.a(apl.aJ)) {
         this.dK().a($$0, false, this);
      } else if (cre.c($$1)) {
         cre.a(null, $$1, this.dK(), $$0);
      } else if (csz.g($$1)) {
         this.dK().a(null, 1009, $$0, 0);
         csz.a(this.v(), this.dK(), $$0, $$1);
         this.dK().b($$0, $$1.a(csz.b, Boolean.valueOf(false)));
      }
   }
}
