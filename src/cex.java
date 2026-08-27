import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cex extends ces implements cej {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<blg> c = $$0 -> $$0.fi() || $$0.bN();

   public cex(bku<? extends cex> $$0, csa $$1) {
      super($$0, $$1);
   }

   public cex(csa $$0, blg $$1) {
      super(bku.aA, $$1, $$0);
   }

   public cex(csa $$0, double $$1, double $$2, double $$3) {
      super(bku.aA, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cle s() {
      return clm.vg;
   }

   @Override
   protected float x() {
      return 0.05F;
   }

   @Override
   protected void a(ejq $$0) {
      super.a($$0);
      if (!this.dN().B) {
         clj $$1 = this.q();
         cng $$2 = cni.d($$1);
         List<bkd> $$3 = cni.a($$1);
         boolean $$4 = $$2 == cnj.c && $$3.isEmpty();
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
   protected void a(ejs $$0) {
      super.a($$0);
      if (!this.dN().B) {
         clj $$1 = this.q();
         cng $$2 = cni.d($$1);
         List<bkd> $$3 = cni.a($$1);
         boolean $$4 = $$2 == cnj.c && $$3.isEmpty();
         if ($$4) {
            this.y();
         } else if (!$$3.isEmpty()) {
            if (this.z()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == ejs.a.c ? ((ejr)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dN().c($$5, this.dn(), cni.c($$1));
         this.am();
      }
   }

   private void y() {
      ejp $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (blg $$2 : this.dN().a(blg.class, $$0, c)) {
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

      for (bxy $$5 : this.dN().a(bxy.class, $$0)) {
         $$5.u();
      }
   }

   private void a(List<bkd> $$0, @Nullable bkq $$1) {
      ejp $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<blg> $$3 = this.dN().a(blg.class, $$2);
      if (!$$3.isEmpty()) {
         bkq $$4 = this.I();

         for (blg $$5 : $$3) {
            if ($$5.fz()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bkd $$9 : $$0) {
                     bkb $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.w(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bkd $$12 = new bkd($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(clj $$0, cng $$1) {
      bkn $$2 = new bkn(this.dN(), this.ds(), this.du(), this.dy());
      bkq $$3 = this.w();
      if ($$3 instanceof blg) {
         $$2.a((blg)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bkd $$4 : cni.b($$0)) {
         $$2.a(new bkd($$4));
      }

      rz $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dN().b($$2);
   }

   private boolean z() {
      return this.q().a(clm.vj);
   }

   private void a(ht $$0) {
      dhi $$1 = this.dN().a_($$0);
      if ($$1.a(arg.aJ)) {
         this.dN().a($$0, false, this);
      } else if (cts.c($$1)) {
         cts.a(null, $$1, this.dN(), $$0);
      } else if (cvo.g($$1)) {
         this.dN().a(null, 1009, $$0, 0);
         cvo.a(this.w(), this.dN(), $$0, $$1);
         this.dN().b($$0, $$1.a(cvo.c, Boolean.valueOf(false)));
      }
   }
}
