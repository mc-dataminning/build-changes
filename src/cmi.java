import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cmi extends cgv implements bvb, bvu {
   private static final all bY = all.b("suffocating");
   private static final bwk bZ = new bwk(bY, -0.34F, bwk.a.b);
   private static final float ca = 0.35F;
   private static final float cc = 0.55F;
   private static final ako<Integer> cd = aks.a(cmi.class, akq.b);
   private static final ako<Boolean> ce = aks.a(cmi.class, akq.k);
   private static final ako<Boolean> cf = aks.a(cmi.class, akq.k);
   private final bva cg = new bva(this.am, cd, cf);
   @Nullable
   private cdk ch;

   public cmi(bup<? extends cmi> $$0, dff $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(esf.j, -1.0F);
      this.a(esf.i, 0.0F);
      this.a(esf.n, 0.0F);
      this.a(esf.o, 0.0F);
   }

   public static boolean c(bup<cmi> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      jh.a $$5 = $$3.k();

      do {
         $$5.c(jm.b);
      } while ($$1.b_($$5).a(axj.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(ako<?> $$0) {
      if (cd.equals($$0) && this.dY().C) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.cg.b($$0);
   }

   @Override
   public boolean i() {
      return this.cg.d();
   }

   @Override
   public boolean f() {
      return this.bN() && !this.p_();
   }

   @Override
   public void a(cwf $$0, @Nullable awp $$1) {
      this.cg.a(true);
      if ($$1 != null) {
         this.dY().a(null, this, awo.yi, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccv(this, 1.65));
      this.bS.a(2, new cbo(this, 1.0));
      this.ch = new cdk(this, 1.4, $$0 -> $$0.a(axm.az), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new cmi.a(this, 1.0));
      this.bS.a(5, new ccb(this, 1.0));
      this.bS.a(7, new ccz(this, 1.0, 60));
      this.bS.a(8, new cck(this, cor.class, 8.0F));
      this.bS.a(8, new ccx(this));
      this.bS.a(9, new cck(this, cmi.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.am.a(ce, $$0);
      bwi $$1 = this.g(bwm.v);
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
   public boolean a(ero $$0) {
      return $$0.a(axj.b);
   }

   @Override
   protected ezr a(bui $$0, bul $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.b());
      float $$4 = this.aT.c();
      float $$5 = 0.12F * azn.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dfi $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bve cZ() {
      return (bve)(this.i() && this.dc() instanceof cor $$0 && $$0.b(cwj.nS) ? $$0 : super.cZ());
   }

   @Override
   public ezr b(bve $$0) {
      ezr[] $$1 = new ezr[]{
         a((double)this.dt(), (double)$$0.dt(), $$0.dO()),
         a((double)this.dt(), (double)$$0.dt(), $$0.dO() - 22.5F),
         a((double)this.dt(), (double)$$0.dt(), $$0.dO() + 22.5F),
         a((double)this.dt(), (double)$$0.dt(), $$0.dO() - 45.0F),
         a((double)this.dt(), (double)$$0.dt(), $$0.dO() + 45.0F)
      };
      Set<jh> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cT().e;
      double $$4 = this.cT().b - 0.5;
      jh.a $$5 = new jh.a();

      for (ezr $$6 : $$1) {
         $$5.b(this.dD() + $$6.d, $$3, this.dJ() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jm.a);
         }
      }

      for (jh $$8 : $$2) {
         if (!this.dY().b_($$8).a(axj.b)) {
            double $$9 = this.dY().j($$8);
            if (cqt.a($$9)) {
               ezr $$10 = ezr.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fR().iterator();

               while (var14.hasNext()) {
                  bvq $$11 = (bvq)var14.next();
                  ezm $$12 = $$0.f($$11);
                  if (cqt.a(this.dY(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ezr(this.dD(), this.cT().e, this.dJ());
   }

   @Override
   protected void a(cor $$0, ezr $$1) {
      this.a($$0.dO(), $$0.dQ() * 0.5F);
      this.O = this.aX = this.aZ = this.dO();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected ezr b(cor $$0, ezr $$1) {
      return new ezr(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cor $$0) {
      return (float)(this.h(bwm.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aW() {
      return this.Y + 0.6F;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(this.bz() ? awo.yg : awo.yf, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.eb());
   }

   @Override
   protected void a(double $$0, boolean $$1, dvo $$2, jh $$3) {
      if (this.bz()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.af.a(140) == 0) {
         this.b(awo.yb);
      } else if (this.gs() && this.af.a(60) == 0) {
         this.b(awo.yc);
      }

      if (!this.gi()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dvo $$0 = this.dY().a_(this.dy());
            dvo $$1 = this.bv();
            $$2 = $$0.a(axd.aV) || $$1.a(axd.aV) || this.b(axj.b) > 0.0;
            if (this.dm() instanceof cmi $$3 && $$3.q()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.x(!$$2 || $$4);
      }

      super.l();
      this.gv();
   }

   private boolean y() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean F() {
      return true;
   }

   private void gv() {
      if (this.bz()) {
         ezw $$0 = ezw.a(this);
         if ($$0.a(dmy.d, this.dy(), true) && !this.dY().b_(this.dy().d()).a(axj.b)) {
            this.d(true);
         } else {
            this.h(this.dB().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bwl.a t() {
      return cgv.gA().a(bwm.v, 0.175F);
   }

   @Override
   protected awn w() {
      return !this.gs() && !this.y() ? awo.ya : null;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.ye;
   }

   @Override
   protected awn o_() {
      return awo.yd;
   }

   @Override
   protected boolean r(bui $$0) {
      return !this.cc() && !this.a(axj.b);
   }

   @Override
   public boolean fu() {
      return true;
   }

   @Override
   public boolean ca() {
      return false;
   }

   @Override
   protected ceq b(dff $$0) {
      return new cmi.b(this, $$0);
   }

   @Override
   public float a(jh $$0, dfi $$1) {
      if ($$1.a_($$0).y().a(axj.b)) {
         return 10.0F;
      } else {
         return this.bz() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cmi b(arq $$0, btz $$1) {
      return bup.aZ.a($$0, buo.e);
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.ay);
   }

   @Override
   protected void eK() {
      super.eK();
      if (this.i()) {
         this.a(cwj.nL);
      }
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      boolean $$2 = this.l($$0.b($$1));
      if (!$$2 && this.i() && !this.cc() && !$$0.gb()) {
         if (!this.dY().C) {
            $$0.n(this);
         }

         return bsh.a;
      } else {
         bsh $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cwf $$4 = $$0.b($$1);
            return (bsh)($$4.a(cwj.nL) ? $$4.a($$0, this, $$1) : bsh.e);
         } else {
            if ($$2 && !this.bd()) {
               this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.yh, this.do(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, (double)(0.6F * this.cU()), (double)(this.dt() * 0.4F));
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azv $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bvg $$5 = bup.bx.a($$0.E(), buo.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cmo.b(cmo.a($$4), false));
               $$5.a(buq.a, new cwf(cwj.nS));
               this.a(new cwf(cwj.nL), null);
            }
         } else if ($$4.a(10) == 0) {
            btz $$6 = bup.aZ.a($$0.E(), buo.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new btz.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bvx a(dfw $$0, bsf $$1, bvg $$2, @Nullable bvx $$3) {
      $$2.b(this.dD(), this.dF(), this.dJ(), this.dO(), 0.0F);
      $$2.a($$0, $$1, buo.g, $$3);
      $$2.a(this, true);
      return new btz.a(0.0F);
   }

   static class a extends ccp {
      private final cmi g;

      a(cmi $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public jh k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bz() && this.a(this.g.dY(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bz() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dfi $$0, jh $$1) {
         return $$0.a_($$1).a(dil.H) && $$0.a_($$1.d()).a(esd.a);
      }
   }

   static class b extends cep {
      b(cmi $$0, dff $$1) {
         super($$0, $$1);
      }

      @Override
      protected ese a(int $$0) {
         this.o = new esk();
         this.o.a(true);
         return new ese(this.o, $$0);
      }

      @Override
      protected boolean a(esf $$0) {
         return $$0 != esf.i && $$0 != esf.o && $$0 != esf.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jh $$0) {
         return this.b.a_($$0).a(dil.H) || super.a($$0);
      }
   }
}
