import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cmm extends cgz implements bvf, bvy {
   private static final akv bY = akv.b("suffocating");
   private static final bwo bZ = new bwo(bY, -0.34F, bwo.a.b);
   private static final float ca = 0.35F;
   private static final float cc = 0.55F;
   private static final ajy<Integer> cd = akc.a(cmm.class, aka.b);
   private static final ajy<Boolean> ce = akc.a(cmm.class, aka.k);
   private static final ajy<Boolean> cf = akc.a(cmm.class, aka.k);
   private final bve cg = new bve(this.al, cd, cf);
   @Nullable
   private cdo ch;

   public cmm(but<? extends cmm> $$0, dgj $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(etr.j, -1.0F);
      this.a(etr.i, 0.0F);
      this.a(etr.n, 0.0F);
      this.a(etr.o, 0.0F);
   }

   public static boolean c(but<cmm> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      ji.a $$5 = $$3.k();

      do {
         $$5.c(jn.b);
      } while ($$1.b_($$5).a(awv.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(ajy<?> $$0) {
      if (cd.equals($$0) && this.dV().C) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.cg.b($$0);
   }

   @Override
   public boolean j() {
      return this.cg.d();
   }

   @Override
   public boolean f() {
      return this.bL() && !this.e_();
   }

   @Override
   public void a(cwq $$0, @Nullable awb $$1) {
      this.cg.a(true);
      if ($$1 != null) {
         this.dV().a(null, this, awa.yS, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void E() {
      this.bS.a(1, new ccz(this, 1.65));
      this.bS.a(2, new cbs(this, 1.0));
      this.ch = new cdo(this, 1.4, $$0 -> $$0.a(awy.ay), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new cmm.a(this, 1.0));
      this.bS.a(5, new ccf(this, 1.0));
      this.bS.a(7, new cdd(this, 1.0, 60));
      this.bS.a(8, new cco(this, coy.class, 8.0F));
      this.bS.a(8, new cdb(this));
      this.bS.a(9, new cco(this, cmm.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.al.a(ce, $$0);
      bwm $$1 = this.g(bwq.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(bZ);
         } else {
            $$1.c(bY);
         }
      }
   }

   public boolean p() {
      return this.al.a(ce);
   }

   @Override
   public boolean a(eta $$0) {
      return $$0.a(awv.b);
   }

   @Override
   protected fbb a(bum $$0, bup $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.b());
      float $$4 = this.aT.c();
      float $$5 = 0.12F * ayz.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dgm $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bvi cW() {
      return (bvi)(this.j() && this.cZ() instanceof coy $$0 && $$0.b(cwu.ou) ? $$0 : super.cW());
   }

   @Override
   public fbb b(bvi $$0) {
      fbb[] $$1 = new fbb[]{
         a((double)this.dq(), (double)$$0.dq(), $$0.dL()),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 45.0F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 45.0F)
      };
      Set<ji> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cR().e;
      double $$4 = this.cR().b - 0.5;
      ji.a $$5 = new ji.a();

      for (fbb $$6 : $$1) {
         $$5.b(this.dA() + $$6.d, $$3, this.dG() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jn.a);
         }
      }

      for (ji $$8 : $$2) {
         if (!this.dV().b_($$8).a(awv.b)) {
            double $$9 = this.dV().j($$8);
            if (crd.a($$9)) {
               fbb $$10 = fbb.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fO().iterator();

               while (var14.hasNext()) {
                  bvu $$11 = (bvu)var14.next();
                  faw $$12 = $$0.f($$11);
                  if (crd.a(this.dV(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fbb(this.dA(), this.cR().e, this.dG());
   }

   @Override
   protected void a(coy $$0, fbb $$1) {
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aX = this.aZ = this.dL();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected fbb b(coy $$0, fbb $$1) {
      return new fbb(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(coy $$0) {
      return (float)(this.h(bwq.v) * (double)(this.p() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(this.bx() ? awa.yQ : awa.yP, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.dY());
   }

   @Override
   protected void a(double $$0, boolean $$1, dwy $$2, ji $$3) {
      if (this.bx()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(awa.yL);
      } else if (this.gp() && this.ae.a(60) == 0) {
         this.b(awa.yM);
      }

      if (!this.gf()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dwy $$0 = this.dV().a_(this.dv());
            dwy $$1 = this.bt();
            $$2 = $$0.a(awp.aW) || $$1.a(awp.aW) || this.b(awv.b) > 0.0;
            if (this.dk() instanceof cmm $$3 && $$3.p()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.x(!$$2 || $$4);
      }

      super.h();
      this.gs();
   }

   private boolean x() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean G() {
      return true;
   }

   private void gs() {
      if (this.bx()) {
         fbg $$0 = fbg.a(this);
         if ($$0.a(dof.d, this.dv(), true) && !this.dV().b_(this.dv().d()).a(awv.b)) {
            this.d(true);
         } else {
            this.i(this.dy().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bwp.a t() {
      return cgz.gx().a(bwq.v, 0.175F);
   }

   @Override
   protected avz u() {
      return !this.gp() && !this.x() ? awa.yK : null;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.yO;
   }

   @Override
   protected avz o_() {
      return awa.yN;
   }

   @Override
   protected boolean r(bum $$0) {
      return !this.ca() && !this.a(awv.b);
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   protected ceu b(dgj $$0) {
      return new cmm.b(this, $$0);
   }

   @Override
   public float a(ji $$0, dgm $$1) {
      if ($$1.a_($$0).y().a(awv.b)) {
         return 10.0F;
      } else {
         return this.bx() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cmm b(ard $$0, bud $$1) {
      return but.bs.a($$0, bus.e);
   }

   @Override
   public boolean j(cwq $$0) {
      return $$0.a(awy.ax);
   }

   @Override
   protected void f(ard $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cwu.on);
      }
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fY()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bsl.a;
      } else {
         bsl $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cwq $$4 = $$0.b($$1);
            return (bsl)($$4.a(cwu.on) ? $$4.a($$0, this, $$1) : bsl.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.yR, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fbb cT() {
      return new fbb(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      if (this.e_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azh $$4 = $$0.H_();
         if ($$4.a(30) == 0) {
            bvk $$5 = but.bQ.a($$0.a(), bus.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cms.b(cms.a($$4), false));
               $$5.a(buu.a, new cwq(cwu.ou));
               this.a(new cwq(cwu.on), null);
            }
         } else if ($$4.a(10) == 0) {
            bud $$6 = but.bs.a($$0.a(), bus.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bud.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bwb a(dha $$0, bsj $$1, bvk $$2, @Nullable bwb $$3) {
      $$2.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
      $$2.a($$0, $$1, bus.g, $$3);
      $$2.a(this, true);
      return new bud.a(0.0F);
   }

   static class a extends cct {
      private final cmm g;

      a(cmm $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public ji k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bx() && this.a(this.g.dV(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bx() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dgm $$0, ji $$1) {
         return $$0.a_($$1).a(djp.K) && $$0.a_($$1.d()).a(etp.a);
      }
   }

   static class b extends cet {
      b(cmm $$0, dgj $$1) {
         super($$0, $$1);
      }

      @Override
      protected etq a(int $$0) {
         this.o = new etw();
         return new etq(this.o, $$0);
      }

      @Override
      protected boolean a(etr $$0) {
         return $$0 != etr.i && $$0 != etr.o && $$0 != etr.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ji $$0) {
         return this.b.a_($$0).a(djp.K) || super.a($$0);
      }
   }
}
