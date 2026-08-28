import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class clq extends cgd implements buk, bvc {
   private static final ale bY = ale.b("suffocating");
   private static final bvs bZ = new bvs(bY, -0.34F, bvs.a.b);
   private static final float ca = 0.35F;
   private static final float cc = 0.55F;
   private static final akh<Integer> cd = akl.a(clq.class, akj.b);
   private static final akh<Boolean> ce = akl.a(clq.class, akj.k);
   private static final akh<Boolean> cf = akl.a(clq.class, akj.k);
   private final buj cg = new buj(this.am, cd, cf);
   @Nullable
   private ccs ch;

   public clq(bty<? extends clq> $$0, dej $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(erk.j, -1.0F);
      this.a(erk.i, 0.0F);
      this.a(erk.n, 0.0F);
      this.a(erk.o, 0.0F);
   }

   public static boolean c(bty<clq> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      jf.a $$5 = $$3.k();

      do {
         $$5.c(jk.b);
      } while ($$1.b_($$5).a(axb.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akh<?> $$0) {
      if (cd.equals($$0) && this.dS().B) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.cg.b($$0);
   }

   @Override
   public boolean i() {
      return this.cg.d();
   }

   @Override
   public boolean f() {
      return this.bI() && !this.p_();
   }

   @Override
   public void a(cvs $$0, @Nullable awh $$1) {
      this.cg.a(true);
      if ($$1 != null) {
         this.dS().a(null, this, awg.yk, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccd(this, 1.65));
      this.bS.a(2, new caw(this, 1.0));
      this.ch = new ccs(this, 1.4, $$0 -> $$0.a(axe.au), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new clq.a(this, 1.0));
      this.bS.a(5, new cbj(this, 1.0));
      this.bS.a(7, new cch(this, 1.0, 60));
      this.bS.a(8, new cbs(this, cnx.class, 8.0F));
      this.bS.a(8, new ccf(this));
      this.bS.a(9, new cbs(this, clq.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.am.a(ce, $$0);
      bvq $$1 = this.g(bvu.v);
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
   public boolean a(eqt $$0) {
      return $$0.a(axb.b);
   }

   @Override
   protected eyw a(btr $$0, btu $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aP.b());
      float $$4 = this.aP.c();
      float $$5 = 0.12F * azf.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dem $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bun cU() {
      return (bun)(this.i() && this.cX() instanceof cnx $$0 && $$0.b(cvw.nS) ? $$0 : super.cU());
   }

   @Override
   public eyw b(bun $$0) {
      eyw[] $$1 = new eyw[]{
         a((double)this.dn(), (double)$$0.dn(), $$0.dI()),
         a((double)this.dn(), (double)$$0.dn(), $$0.dI() - 22.5F),
         a((double)this.dn(), (double)$$0.dn(), $$0.dI() + 22.5F),
         a((double)this.dn(), (double)$$0.dn(), $$0.dI() - 45.0F),
         a((double)this.dn(), (double)$$0.dn(), $$0.dI() + 45.0F)
      };
      Set<jf> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cO().e;
      double $$4 = this.cO().b - 0.5;
      jf.a $$5 = new jf.a();

      for (eyw $$6 : $$1) {
         $$5.b(this.dx() + $$6.d, $$3, this.dD() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jk.a);
         }
      }

      for (jf $$8 : $$2) {
         if (!this.dS().b_($$8).a(axb.b)) {
            double $$9 = this.dS().j($$8);
            if (cqa.a($$9)) {
               eyw $$10 = eyw.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fK().iterator();

               while (var14.hasNext()) {
                  buz $$11 = (buz)var14.next();
                  eyr $$12 = $$0.f($$11);
                  if (cqa.a(this.dS(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new eyw(this.dx(), this.cO().e, this.dD());
   }

   @Override
   protected void a(cnx $$0, eyw $$1) {
      this.a($$0.dI(), $$0.dK() * 0.5F);
      this.O = this.aT = this.aV = this.dI();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected eyw b(cnx $$0, eyw $$1) {
      return new eyw(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cnx $$0) {
      return (float)(this.h(bvu.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aS() {
      return this.Y + 0.6F;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(this.bw() ? awg.yi : awg.yh, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.dV());
   }

   @Override
   protected void a(double $$0, boolean $$1, dus $$2, jf $$3) {
      if (this.bw()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.af.a(140) == 0) {
         this.b(awg.yd);
      } else if (this.gl() && this.af.a(60) == 0) {
         this.b(awg.ye);
      }

      if (!this.gd()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dus $$0 = this.dS().a_(this.ds());
            dus $$1 = this.bs();
            $$2 = $$0.a(awv.aV) || $$1.a(awv.aV) || this.b(axb.b) > 0.0;
            if (this.dg() instanceof clq $$3 && $$3.q()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.x(!$$2 || $$4);
      }

      super.l();
      this.go();
      this.aW();
   }

   private boolean y() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean F() {
      return true;
   }

   private void go() {
      if (this.bw()) {
         ezb $$0 = ezb.a(this);
         if ($$0.a(dmc.d, this.ds(), true) && !this.dS().b_(this.ds().d()).a(axb.b)) {
            this.d(true);
         } else {
            this.h(this.dv().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bvt.a t() {
      return cgd.gt().a(bvu.v, 0.175F);
   }

   @Override
   protected awf w() {
      return !this.gl() && !this.y() ? awg.yc : null;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.yg;
   }

   @Override
   protected awf o_() {
      return awg.yf;
   }

   @Override
   protected boolean r(btr $$0) {
      return !this.bX() && !this.a(axb.b);
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
   protected cdy b(dej $$0) {
      return new clq.b(this, $$0);
   }

   @Override
   public float a(jf $$0, dem $$1) {
      if ($$1.a_($$0).y().a(axb.b)) {
         return 10.0F;
      } else {
         return this.bw() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public clq b(arj $$0, btk $$1) {
      return bty.aZ.a($$0, btx.e);
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.at);
   }

   @Override
   protected void eE() {
      super.eE();
      if (this.i()) {
         this.a(cvw.nL);
      }
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      boolean $$2 = this.n($$0.b($$1));
      if (!$$2 && this.i() && !this.bX() && !$$0.fT()) {
         if (!this.dS().B) {
            $$0.n(this);
         }

         return brs.a;
      } else {
         brs $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cvs $$4 = $$0.b($$1);
            return (brs)($$4.a(cvw.nL) ? $$4.a($$0, this, $$1) : brs.e);
         } else {
            if ($$2 && !this.ba()) {
               this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.yj, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public eyw cQ() {
      return new eyw(0.0, (double)(0.6F * this.cP()), (double)(this.dn() * 0.4F));
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azn $$4 = $$0.D_();
         if ($$4.a(30) == 0) {
            bup $$5 = bty.bx.a($$0.E(), btx.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new clw.b(clw.a($$4), false));
               $$5.a(btz.a, new cvs(cvw.nS));
               this.a(new cvs(cvw.nL), null);
            }
         } else if ($$4.a(10) == 0) {
            btk $$6 = bty.aZ.a($$0.E(), btx.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new btk.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bvf a(dez $$0, brq $$1, bup $$2, @Nullable bvf $$3) {
      $$2.b(this.dx(), this.dz(), this.dD(), this.dI(), 0.0F);
      $$2.a($$0, $$1, btx.g, $$3);
      $$2.a(this, true);
      return new btk.a(0.0F);
   }

   static class a extends cbx {
      private final clq g;

      a(clq $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public jf k() {
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
      protected boolean a(dem $$0, jf $$1) {
         return $$0.a_($$1).a(dho.H) && $$0.a_($$1.d()).a(eri.a);
      }
   }

   static class b extends cdx {
      b(clq $$0, dej $$1) {
         super($$0, $$1);
      }

      @Override
      protected erj a(int $$0) {
         this.o = new erp();
         this.o.a(true);
         return new erj(this.o, $$0);
      }

      @Override
      protected boolean a(erk $$0) {
         return $$0 != erk.i && $$0 != erk.o && $$0 != erk.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jf $$0) {
         return this.b.a_($$0).a(dho.H) || super.a($$0);
      }
   }
}
