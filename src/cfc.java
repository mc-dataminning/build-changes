import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfc extends cex implements ceo {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bll> c = $$0 -> $$0.fi() || $$0.bN();

   public cfc(bkz<? extends cfc> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cfc(csf $$0, bll $$1) {
      super(bkz.aA, $$1, $$0);
   }

   public cfc(csf $$0, double $$1, double $$2, double $$3) {
      super(bkz.aA, $$1, $$2, $$3, $$0);
   }

   @Override
   protected clj s() {
      return clr.vg;
   }

   @Override
   protected float x() {
      return 0.05F;
   }

   @Override
   protected void a(ejv $$0) {
      super.a($$0);
      if (!this.dN().B) {
         clo $$1 = this.q();
         cnl $$2 = cnn.d($$1);
         List<bki> $$3 = cnn.a($$1);
         boolean $$4 = $$2 == cno.c && $$3.isEmpty();
         ib $$5 = $$0.b();
         hx $$6 = $$0.a();
         hx $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (ib $$8 : ib.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(ejx $$0) {
      super.a($$0);
      if (!this.dN().B) {
         clo $$1 = this.q();
         cnl $$2 = cnn.d($$1);
         List<bki> $$3 = cnn.a($$1);
         boolean $$4 = $$2 == cno.c && $$3.isEmpty();
         if ($$4) {
            this.y();
         } else if (!$$3.isEmpty()) {
            if (this.z()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == ejx.a.c ? ((ejw)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dN().c($$5, this.dn(), cnn.c($$1));
         this.am();
      }
   }

   private void y() {
      eju $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (bll $$2 : this.dN().a(bll.class, $$0, c)) {
         double $$3 = this.f($$2);
         if ($$3 < 16.0) {
            if ($$2.fi()) {
               $$2.a(this.dO().c(this, this.w()), 1.0F);
            }

            if ($$2.bN() && $$2.bx()) {
               $$2.aF();
            }
         }
      }

      for (byd $$5 : this.dN().a(byd.class, $$0)) {
         $$5.u();
      }
   }

   private void a(List<bki> $$0, @Nullable bkv $$1) {
      eju $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<bll> $$3 = this.dN().a(bll.class, $$2);
      if (!$$3.isEmpty()) {
         bkv $$4 = this.I();

         for (bll $$5 : $$3) {
            if ($$5.fz()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bki $$9 : $$0) {
                     bkg $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.w(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bki $$12 = new bki($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(clo $$0, cnl $$1) {
      bks $$2 = new bks(this.dN(), this.ds(), this.du(), this.dy());
      bkv $$3 = this.w();
      if ($$3 instanceof bll) {
         $$2.a((bll)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bki $$4 : cnn.b($$0)) {
         $$2.a(new bki($$4));
      }

      sd $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dN().b($$2);
   }

   private boolean z() {
      return this.q().a(clr.vj);
   }

   private void a(hx $$0) {
      dhn $$1 = this.dN().a_($$0);
      if ($$1.a(ark.aJ)) {
         this.dN().a($$0, false, this);
      } else if (ctx.c($$1)) {
         ctx.a(null, $$1, this.dN(), $$0);
      } else if (cvt.g($$1)) {
         this.dN().a(null, 1009, $$0, 0);
         cvt.a(this.w(), this.dN(), $$0, $$1);
         this.dN().b($$0, $$1.a(cvt.c, Boolean.valueOf(false)));
      }
   }
}
