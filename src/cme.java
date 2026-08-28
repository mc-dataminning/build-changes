import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cme extends cgr implements bux, bvq {
   private static final ali bY = ali.b("suffocating");
   private static final bwg bZ = new bwg(bY, -0.34F, bwg.a.b);
   private static final float ca = 0.35F;
   private static final float cc = 0.55F;
   private static final akl<Integer> cd = akp.a(cme.class, akn.b);
   private static final akl<Boolean> ce = akp.a(cme.class, akn.k);
   private static final akl<Boolean> cf = akp.a(cme.class, akn.k);
   private final buw cg = new buw(this.am, cd, cf);
   @Nullable
   private cdg ch;

   public cme(bul<? extends cme> $$0, dfb $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(esb.j, -1.0F);
      this.a(esb.i, 0.0F);
      this.a(esb.n, 0.0F);
      this.a(esb.o, 0.0F);
   }

   public static boolean c(bul<cme> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      jh.a $$5 = $$3.k();

      do {
         $$5.c(jm.b);
      } while ($$1.b_($$5).a(axg.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akl<?> $$0) {
      if (cd.equals($$0) && this.dX().C) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.cg.b($$0);
   }

   @Override
   public boolean i() {
      return this.cg.d();
   }

   @Override
   public boolean f() {
      return this.bM() && !this.p_();
   }

   @Override
   public void a(cwb $$0, @Nullable awm $$1) {
      this.cg.a(true);
      if ($$1 != null) {
         this.dX().a(null, this, awl.yi, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccr(this, 1.65));
      this.bS.a(2, new cbk(this, 1.0));
      this.ch = new cdg(this, 1.4, $$0 -> $$0.a(axj.ay), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new cme.a(this, 1.0));
      this.bS.a(5, new cbx(this, 1.0));
      this.bS.a(7, new ccv(this, 1.0, 60));
      this.bS.a(8, new ccg(this, com.class, 8.0F));
      this.bS.a(8, new cct(this));
      this.bS.a(9, new ccg(this, cme.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.am.a(ce, $$0);
      bwe $$1 = this.g(bwi.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(bZ);
         } else {
            $$1.c(bY);
         }
      }
   }

   @Override
   public boolean q() {
      return this.am.a(ce);
   }

   @Override
   public boolean a(erk $$0) {
      return $$0.a(axg.b);
   }

   @Override
   protected ezn a(bue $$0, buh $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.b());
      float $$4 = this.aT.c();
      float $$5 = 0.12F * azk.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dfe $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bva cY() {
      return (bva)(this.i() && this.db() instanceof com $$0 && $$0.b(cwf.nS) ? $$0 : super.cY());
   }

   @Override
   public ezn b(bva $$0) {
      ezn[] $$1 = new ezn[]{
         a((double)this.ds(), (double)$$0.ds(), $$0.dN()),
         a((double)this.ds(), (double)$$0.ds(), $$0.dN() - 22.5F),
         a((double)this.ds(), (double)$$0.ds(), $$0.dN() + 22.5F),
         a((double)this.ds(), (double)$$0.ds(), $$0.dN() - 45.0F),
         a((double)this.ds(), (double)$$0.ds(), $$0.dN() + 45.0F)
      };
      Set<jh> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cS().e;
      double $$4 = this.cS().b - 0.5;
      jh.a $$5 = new jh.a();

      for (ezn $$6 : $$1) {
         $$5.b(this.dC() + $$6.d, $$3, this.dI() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jm.a);
         }
      }

      for (jh $$8 : $$2) {
         if (!this.dX().b_($$8).a(axg.b)) {
            double $$9 = this.dX().j($$8);
            if (cqp.a($$9)) {
               ezn $$10 = ezn.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fQ().iterator();

               while (var14.hasNext()) {
                  bvm $$11 = (bvm)var14.next();
                  ezi $$12 = $$0.f($$11);
                  if (cqp.a(this.dX(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ezn(this.dC(), this.cS().e, this.dI());
   }

   @Override
   protected void a(com $$0, ezn $$1) {
      this.a($$0.dN(), $$0.dP() * 0.5F);
      this.O = this.aX = this.aZ = this.dN();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected ezn b(com $$0, ezn $$1) {
      return new ezn(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(com $$0) {
      return (float)(this.h(bwi.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aV() {
      return this.Y + 0.6F;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(this.by() ? awl.yg : awl.yf, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.ea());
   }

   @Override
   protected void a(double $$0, boolean $$1, dvj $$2, jh $$3) {
      if (this.by()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.af.a(140) == 0) {
         this.b(awl.yb);
      } else if (this.gr() && this.af.a(60) == 0) {
         this.b(awl.yc);
      }

      if (!this.gh()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dvj $$0 = this.dX().a_(this.dx());
            dvj $$1 = this.bu();
            $$2 = $$0.a(axa.aV) || $$1.a(axa.aV) || this.b(axg.b) > 0.0;
            if (this.dl() instanceof cme $$3 && $$3.q()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.x(!$$2 || $$4);
      }

      super.l();
      this.gu();
   }

   private boolean y() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean F() {
      return true;
   }

   private void gu() {
      if (this.by()) {
         ezs $$0 = ezs.a(this);
         if ($$0.a(dmt.d, this.dx(), true) && !this.dX().b_(this.dx().d()).a(axg.b)) {
            this.d(true);
         } else {
            this.h(this.dA().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bwh.a t() {
      return cgr.gz().a(bwi.v, 0.175F);
   }

   @Override
   protected awk w() {
      return !this.gr() && !this.y() ? awl.ya : null;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.ye;
   }

   @Override
   protected awk o_() {
      return awl.yd;
   }

   @Override
   protected boolean r(bue $$0) {
      return !this.cb() && !this.a(axg.b);
   }

   @Override
   public boolean ft() {
      return true;
   }

   @Override
   public boolean bZ() {
      return false;
   }

   @Override
   protected cem b(dfb $$0) {
      return new cme.b(this, $$0);
   }

   @Override
   public float a(jh $$0, dfe $$1) {
      if ($$1.a_($$0).y().a(axg.b)) {
         return 10.0F;
      } else {
         return this.by() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cme b(arn $$0, btv $$1) {
      return bul.aZ.a($$0, buk.e);
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.ax);
   }

   @Override
   protected void eJ() {
      super.eJ();
      if (this.i()) {
         this.a(cwf.nL);
      }
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      boolean $$2 = this.l($$0.b($$1));
      if (!$$2 && this.i() && !this.cb() && !$$0.ga()) {
         if (!this.dX().C) {
            $$0.n(this);
         }

         return bsd.a;
      } else {
         bsd $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cwb $$4 = $$0.b($$1);
            return (bsd)($$4.a(cwf.nL) ? $$4.a($$0, this, $$1) : bsd.e);
         } else {
            if ($$2 && !this.bc()) {
               this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.yh, this.dn(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, (double)(0.6F * this.cT()), (double)(this.ds() * 0.4F));
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azs $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bvc $$5 = bul.bx.a($$0.E(), buk.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cmk.b(cmk.a($$4), false));
               $$5.a(bum.a, new cwb(cwf.nS));
               this.a(new cwb(cwf.nL), null);
            }
         } else if ($$4.a(10) == 0) {
            btv $$6 = bul.aZ.a($$0.E(), buk.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new btv.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bvt a(dfr $$0, bsb $$1, bvc $$2, @Nullable bvt $$3) {
      $$2.b(this.dC(), this.dE(), this.dI(), this.dN(), 0.0F);
      $$2.a($$0, $$1, buk.g, $$3);
      $$2.a(this, true);
      return new btv.a(0.0F);
   }

   static class a extends ccl {
      private final cme g;

      a(cme $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public jh k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.by() && this.a(this.g.dX(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.by() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dfe $$0, jh $$1) {
         return $$0.a_($$1).a(dig.H) && $$0.a_($$1.d()).a(erz.a);
      }
   }

   static class b extends cel {
      b(cme $$0, dfb $$1) {
         super($$0, $$1);
      }

      @Override
      protected esa a(int $$0) {
         this.o = new esg();
         this.o.a(true);
         return new esa(this.o, $$0);
      }

      @Override
      protected boolean a(esb $$0) {
         return $$0 != esb.i && $$0 != esb.o && $$0 != esb.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jh $$0) {
         return this.b.a_($$0).a(dig.H) || super.a($$0);
      }
   }
}
