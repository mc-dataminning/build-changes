import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cml extends cgy implements bve, bvx {
   private static final alj bY = alj.b("suffocating");
   private static final bwn bZ = new bwn(bY, -0.34F, bwn.a.b);
   private static final float ca = 0.35F;
   private static final float cc = 0.55F;
   private static final akm<Integer> cd = akq.a(cml.class, ako.b);
   private static final akm<Boolean> ce = akq.a(cml.class, ako.k);
   private static final akm<Boolean> cf = akq.a(cml.class, ako.k);
   private final bvd cg = new bvd(this.al, cd, cf);
   @Nullable
   private cdn ch;

   public cml(bus<? extends cml> $$0, dfm $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(esm.j, -1.0F);
      this.a(esm.i, 0.0F);
      this.a(esm.n, 0.0F);
      this.a(esm.o, 0.0F);
   }

   public static boolean c(bus<cml> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      jh.a $$5 = $$3.k();

      do {
         $$5.c(jm.b);
      } while ($$1.b_($$5).a(axi.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akm<?> $$0) {
      if (cd.equals($$0) && this.dV().C) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(ul $$0) {
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
   public void a(cwm $$0, @Nullable awo $$1) {
      this.cg.a(true);
      if ($$1 != null) {
         this.dV().a(null, this, awn.yi, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bS.a(1, new ccy(this, 1.65));
      this.bS.a(2, new cbr(this, 1.0));
      this.ch = new cdn(this, 1.4, $$0 -> $$0.a(axl.az), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new cml.a(this, 1.0));
      this.bS.a(5, new cce(this, 1.0));
      this.bS.a(7, new cdc(this, 1.0, 60));
      this.bS.a(8, new ccn(this, cou.class, 8.0F));
      this.bS.a(8, new cda(this));
      this.bS.a(9, new ccn(this, cml.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.al.a(ce, $$0);
      bwl $$1 = this.g(bwp.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(bZ);
         } else {
            $$1.c(bY);
         }
      }
   }

   @Override
   public boolean n() {
      return this.al.a(ce);
   }

   @Override
   public boolean a(erv $$0) {
      return $$0.a(axi.b);
   }

   @Override
   protected ezy a(bul $$0, buo $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aS.b());
      float $$4 = this.aS.c();
      float $$5 = 0.12F * azm.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dfp $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bvh cX() {
      return (bvh)(this.j() && this.da() instanceof cou $$0 && $$0.b(cwq.nS) ? $$0 : super.cX());
   }

   @Override
   public ezy b(bvh $$0) {
      ezy[] $$1 = new ezy[]{
         a((double)this.dq(), (double)$$0.dq(), $$0.dL()),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 45.0F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 45.0F)
      };
      Set<jh> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cR().e;
      double $$4 = this.cR().b - 0.5;
      jh.a $$5 = new jh.a();

      for (ezy $$6 : $$1) {
         $$5.b(this.dA() + $$6.d, $$3, this.dG() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jm.a);
         }
      }

      for (jh $$8 : $$2) {
         if (!this.dV().b_($$8).a(axi.b)) {
            double $$9 = this.dV().j($$8);
            if (cqz.a($$9)) {
               ezy $$10 = ezy.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fM().iterator();

               while (var14.hasNext()) {
                  bvt $$11 = (bvt)var14.next();
                  ezt $$12 = $$0.f($$11);
                  if (cqz.a(this.dV(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ezy(this.dA(), this.cR().e, this.dG());
   }

   @Override
   protected void a(cou $$0, ezy $$1) {
      this.a($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aW = this.aY = this.dL();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected ezy b(cou $$0, ezy $$1) {
      return new ezy(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cou $$0) {
      return (float)(this.h(bwp.v) * (double)(this.n() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(this.bx() ? awn.yg : awn.yf, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.dY());
   }

   @Override
   protected void a(double $$0, boolean $$1, dvv $$2, jh $$3) {
      if (this.bx()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.v() && this.ae.a(140) == 0) {
         this.b(awn.yb);
      } else if (this.gj() && this.ae.a(60) == 0) {
         this.b(awn.yc);
      }

      if (!this.fZ()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dvv $$0 = this.dV().a_(this.dv());
            dvv $$1 = this.bt();
            $$2 = $$0.a(axc.aV) || $$1.a(axc.aV) || this.b(axi.b) > 0.0;
            if (this.dk() instanceof cml $$3 && $$3.n()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.x(!$$2 || $$4);
      }

      super.h();
      this.gm();
   }

   private boolean v() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void gm() {
      if (this.bx()) {
         fad $$0 = fad.a(this);
         if ($$0.a(dnf.d, this.dv(), true) && !this.dV().b_(this.dv().d()).a(axi.b)) {
            this.d(true);
         } else {
            this.h(this.dy().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bwo.a q() {
      return cgy.gr().a(bwp.v, 0.175F);
   }

   @Override
   protected awm t() {
      return !this.gj() && !this.v() ? awn.ya : null;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.ye;
   }

   @Override
   protected awm n_() {
      return awn.yd;
   }

   @Override
   protected boolean r(bul $$0) {
      return !this.ca() && !this.a(axi.b);
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   protected cet b(dfm $$0) {
      return new cml.b(this, $$0);
   }

   @Override
   public float a(jh $$0, dfp $$1) {
      if ($$1.a_($$0).y().a(axi.b)) {
         return 10.0F;
      } else {
         return this.bx() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cml b(arp $$0, buc $$1) {
      return bus.bp.a($$0, bur.e);
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.ay);
   }

   @Override
   protected void f(arp $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cwq.nL);
      }
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fW()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bsk.a;
      } else {
         bsk $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cwm $$4 = $$0.b($$1);
            return (bsk)($$4.a(cwq.nL) ? $$4.a($$0, this, $$1) : bsk.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.yh, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ezy cT() {
      return new ezy(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if (this.e_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azu $$4 = $$0.G_();
         if ($$4.a(30) == 0) {
            bvj $$5 = bus.bN.a($$0.a(), bur.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cmr.b(cmr.a($$4), false));
               $$5.a(but.a, new cwm(cwq.nS));
               this.a(new cwm(cwq.nL), null);
            }
         } else if ($$4.a(10) == 0) {
            buc $$6 = bus.bp.a($$0.a(), bur.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new buc.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bwa a(dgd $$0, bsi $$1, bvj $$2, @Nullable bwa $$3) {
      $$2.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
      $$2.a($$0, $$1, bur.g, $$3);
      $$2.a(this, true);
      return new buc.a(0.0F);
   }

   static class a extends ccs {
      private final cml g;

      a(cml $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public jh k() {
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
      protected boolean a(dfp $$0, jh $$1) {
         return $$0.a_($$1).a(dis.H) && $$0.a_($$1.d()).a(esk.a);
      }
   }

   static class b extends ces {
      b(cml $$0, dfm $$1) {
         super($$0, $$1);
      }

      @Override
      protected esl a(int $$0) {
         this.o = new esr();
         this.o.a(true);
         return new esl(this.o, $$0);
      }

      @Override
      protected boolean a(esm $$0) {
         return $$0 != esm.i && $$0 != esm.o && $$0 != esm.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jh $$0) {
         return this.b.a_($$0).a(dis.H) || super.a($$0);
      }
   }
}
