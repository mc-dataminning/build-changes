import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cln extends cga implements buh, buz {
   private static final alc bY = alc.b("suffocating");
   private static final bvp bZ = new bvp(bY, -0.34F, bvp.a.b);
   private static final float ca = 0.35F;
   private static final float cc = 0.55F;
   private static final akg<Integer> cd = akk.a(cln.class, aki.b);
   private static final akg<Boolean> ce = akk.a(cln.class, aki.k);
   private static final akg<Boolean> cf = akk.a(cln.class, aki.k);
   private final bug cg = new bug(this.am, cd, cf);
   @Nullable
   private ccp ch;

   public cln(btv<? extends cln> $$0, deg $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(erg.j, -1.0F);
      this.a(erg.i, 0.0F);
      this.a(erg.n, 0.0F);
      this.a(erg.o, 0.0F);
   }

   public static boolean c(btv<cln> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      je.a $$5 = $$3.k();

      do {
         $$5.c(jj.b);
      } while ($$1.b_($$5).a(awz.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akg<?> $$0) {
      if (cd.equals($$0) && this.dS().B) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.cg.b($$0);
   }

   @Override
   public boolean i() {
      return this.cg.d();
   }

   @Override
   public boolean f() {
      return this.bI() && !this.o_();
   }

   @Override
   public void a(cvp $$0, @Nullable awf $$1) {
      this.cg.a(true);
      if ($$1 != null) {
         this.dS().a(null, this, awe.yk, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void D() {
      this.bS.a(1, new cca(this, 1.65));
      this.bS.a(2, new cat(this, 1.0));
      this.ch = new ccp(this, 1.4, $$0 -> $$0.a(axc.au), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new cln.a(this, 1.0));
      this.bS.a(5, new cbg(this, 1.0));
      this.bS.a(7, new cce(this, 1.0, 60));
      this.bS.a(8, new cbp(this, cnu.class, 8.0F));
      this.bS.a(8, new ccc(this));
      this.bS.a(9, new cbp(this, cln.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.am.a(ce, $$0);
      bvn $$1 = this.g(bvr.v);
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
   public boolean a(eqp $$0) {
      return $$0.a(awz.b);
   }

   @Override
   protected eys a(bto $$0, btr $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aP.b());
      float $$4 = this.aP.c();
      float $$5 = 0.12F * azd.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dej $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public buk cU() {
      return (buk)(this.i() && this.cX() instanceof cnu $$0 && $$0.b(cvt.nS) ? $$0 : super.cU());
   }

   @Override
   public eys b(buk $$0) {
      eys[] $$1 = new eys[]{
         a((double)this.dn(), (double)$$0.dn(), $$0.dI()),
         a((double)this.dn(), (double)$$0.dn(), $$0.dI() - 22.5F),
         a((double)this.dn(), (double)$$0.dn(), $$0.dI() + 22.5F),
         a((double)this.dn(), (double)$$0.dn(), $$0.dI() - 45.0F),
         a((double)this.dn(), (double)$$0.dn(), $$0.dI() + 45.0F)
      };
      Set<je> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cO().e;
      double $$4 = this.cO().b - 0.5;
      je.a $$5 = new je.a();

      for (eys $$6 : $$1) {
         $$5.b(this.dx() + $$6.d, $$3, this.dD() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jj.a);
         }
      }

      for (je $$8 : $$2) {
         if (!this.dS().b_($$8).a(awz.b)) {
            double $$9 = this.dS().j($$8);
            if (cpx.a($$9)) {
               eys $$10 = eys.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fJ().iterator();

               while (var14.hasNext()) {
                  buw $$11 = (buw)var14.next();
                  eyn $$12 = $$0.f($$11);
                  if (cpx.a(this.dS(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new eys(this.dx(), this.cO().e, this.dD());
   }

   @Override
   protected void a(cnu $$0, eys $$1) {
      this.a($$0.dI(), $$0.dK() * 0.5F);
      this.O = this.aT = this.aV = this.dI();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected eys b(cnu $$0, eys $$1) {
      return new eys(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cnu $$0) {
      return (float)(this.h(bvr.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aS() {
      return this.Y + 0.6F;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(this.bw() ? awe.yi : awe.yh, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.dV());
   }

   @Override
   protected void a(double $$0, boolean $$1, duo $$2, je $$3) {
      if (this.bw()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.af.a(140) == 0) {
         this.b(awe.yd);
      } else if (this.gm() && this.af.a(60) == 0) {
         this.b(awe.ye);
      }

      if (!this.ge()) {
         boolean $$2;
         boolean var10000;
         label36: {
            duo $$0 = this.dS().a_(this.ds());
            duo $$1 = this.bs();
            $$2 = $$0.a(awt.aV) || $$1.a(awt.aV) || this.b(awz.b) > 0.0;
            if (this.dg() instanceof cln $$3 && $$3.q()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.x(!$$2 || $$4);
      }

      super.l();
      this.gp();
      this.aW();
   }

   private boolean y() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean F() {
      return true;
   }

   private void gp() {
      if (this.bw()) {
         eyx $$0 = eyx.a(this);
         if ($$0.a(dlz.d, this.ds(), true) && !this.dS().b_(this.ds().d()).a(awz.b)) {
            this.d(true);
         } else {
            this.h(this.dv().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bvq.a t() {
      return cga.gu().a(bvr.v, 0.175F);
   }

   @Override
   protected awd w() {
      return !this.gm() && !this.y() ? awe.yc : null;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.yg;
   }

   @Override
   protected awd n_() {
      return awe.yf;
   }

   @Override
   protected boolean r(bto $$0) {
      return !this.bX() && !this.a(awz.b);
   }

   @Override
   public boolean fo() {
      return true;
   }

   @Override
   public boolean bV() {
      return false;
   }

   @Override
   protected cdv b(deg $$0) {
      return new cln.b(this, $$0);
   }

   @Override
   public float a(je $$0, dej $$1) {
      if ($$1.a_($$0).y().a(awz.b)) {
         return 10.0F;
      } else {
         return this.bw() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cln b(arh $$0, bth $$1) {
      return btv.aZ.a($$0, btu.e);
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.at);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(cvt.nL);
      }
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      boolean $$2 = this.n($$0.b($$1));
      if (!$$2 && this.i() && !this.bX() && !$$0.fS()) {
         if (!this.dS().B) {
            $$0.n(this);
         }

         return brp.a;
      } else {
         brp $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cvp $$4 = $$0.b($$1);
            return (brp)($$4.a(cvt.nL) ? $$4.a($$0, this, $$1) : brp.e);
         } else {
            if ($$2 && !this.ba()) {
               this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.yj, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public eys cQ() {
      return new eys(0.0, (double)(0.6F * this.cP()), (double)(this.dn() * 0.4F));
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azl $$4 = $$0.C_();
         if ($$4.a(30) == 0) {
            bum $$5 = btv.bx.a($$0.E(), btu.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new clt.b(clt.a($$4), false));
               $$5.a(btw.a, new cvp(cvt.nS));
               this.a(new cvp(cvt.nL), null);
            }
         } else if ($$4.a(10) == 0) {
            bth $$6 = btv.aZ.a($$0.E(), btu.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bth.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bvc a(dew $$0, brn $$1, bum $$2, @Nullable bvc $$3) {
      $$2.b(this.dx(), this.dz(), this.dD(), this.dI(), 0.0F);
      $$2.a($$0, $$1, btu.g, $$3);
      $$2.a(this, true);
      return new bth.a(0.0F);
   }

   static class a extends cbu {
      private final cln g;

      a(cln $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public je k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bw() && this.a(this.g.dS(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bw() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dej $$0, je $$1) {
         return $$0.a_($$1).a(dhl.H) && $$0.a_($$1.d()).a(ere.a);
      }
   }

   static class b extends cdu {
      b(cln $$0, deg $$1) {
         super($$0, $$1);
      }

      @Override
      protected erf a(int $$0) {
         this.o = new erl();
         this.o.a(true);
         return new erf(this.o, $$0);
      }

      @Override
      protected boolean a(erg $$0) {
         return $$0 != erg.i && $$0 != erg.o && $$0 != erg.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(je $$0) {
         return this.b.a_($$0).a(dhl.H) || super.a($$0);
      }
   }
}
