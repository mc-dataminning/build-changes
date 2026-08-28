import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class clz extends cgm implements bus, bvl {
   private static final alh bY = alh.b("suffocating");
   private static final bwb bZ = new bwb(bY, -0.34F, bwb.a.b);
   private static final float ca = 0.35F;
   private static final float cc = 0.55F;
   private static final akk<Integer> cd = ako.a(clz.class, akm.b);
   private static final akk<Boolean> ce = ako.a(clz.class, akm.k);
   private static final akk<Boolean> cf = ako.a(clz.class, akm.k);
   private final bur cg = new bur(this.am, cd, cf);
   @Nullable
   private cdb ch;

   public clz(bug<? extends clz> $$0, dev $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(erv.j, -1.0F);
      this.a(erv.i, 0.0F);
      this.a(erv.n, 0.0F);
      this.a(erv.o, 0.0F);
   }

   public static boolean c(bug<clz> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      jg.a $$5 = $$3.k();

      do {
         $$5.c(jl.b);
      } while ($$1.b_($$5).a(axf.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akk<?> $$0) {
      if (cd.equals($$0) && this.dX().C) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(uj $$0) {
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
   public void a(cvx $$0, @Nullable awl $$1) {
      this.cg.a(true);
      if ($$1 != null) {
         this.dX().a(null, this, awk.yi, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccm(this, 1.65));
      this.bS.a(2, new cbf(this, 1.0));
      this.ch = new cdb(this, 1.4, $$0 -> $$0.a(axi.av), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new clz.a(this, 1.0));
      this.bS.a(5, new cbs(this, 1.0));
      this.bS.a(7, new ccq(this, 1.0, 60));
      this.bS.a(8, new ccb(this, coh.class, 8.0F));
      this.bS.a(8, new cco(this));
      this.bS.a(9, new ccb(this, clz.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.am.a(ce, $$0);
      bvz $$1 = this.g(bwd.v);
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
   public boolean a(ere $$0) {
      return $$0.a(axf.b);
   }

   @Override
   protected ezh a(btz $$0, buc $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.b());
      float $$4 = this.aQ.c();
      float $$5 = 0.12F * azj.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dey $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public buv cY() {
      return (buv)(this.i() && this.db() instanceof coh $$0 && $$0.b(cwb.nS) ? $$0 : super.cY());
   }

   @Override
   public ezh b(buv $$0) {
      ezh[] $$1 = new ezh[]{
         a((double)this.ds(), (double)$$0.ds(), $$0.dN()),
         a((double)this.ds(), (double)$$0.ds(), $$0.dN() - 22.5F),
         a((double)this.ds(), (double)$$0.ds(), $$0.dN() + 22.5F),
         a((double)this.ds(), (double)$$0.ds(), $$0.dN() - 45.0F),
         a((double)this.ds(), (double)$$0.ds(), $$0.dN() + 45.0F)
      };
      Set<jg> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cS().e;
      double $$4 = this.cS().b - 0.5;
      jg.a $$5 = new jg.a();

      for (ezh $$6 : $$1) {
         $$5.b(this.dC() + $$6.d, $$3, this.dI() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jl.a);
         }
      }

      for (jg $$8 : $$2) {
         if (!this.dX().b_($$8).a(axf.b)) {
            double $$9 = this.dX().j($$8);
            if (cqk.a($$9)) {
               ezh $$10 = ezh.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fQ().iterator();

               while (var14.hasNext()) {
                  bvh $$11 = (bvh)var14.next();
                  ezc $$12 = $$0.f($$11);
                  if (cqk.a(this.dX(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ezh(this.dC(), this.cS().e, this.dI());
   }

   @Override
   protected void a(coh $$0, ezh $$1) {
      this.a($$0.dN(), $$0.dP() * 0.5F);
      this.O = this.aU = this.aW = this.dN();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected ezh b(coh $$0, ezh $$1) {
      return new ezh(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(coh $$0) {
      return (float)(this.h(bwd.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aU() {
      return this.Y + 0.6F;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(this.by() ? awk.yg : awk.yf, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.ea());
   }

   @Override
   protected void a(double $$0, boolean $$1, dvd $$2, jg $$3) {
      if (this.by()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.af.a(140) == 0) {
         this.b(awk.yb);
      } else if (this.gs() && this.af.a(60) == 0) {
         this.b(awk.yc);
      }

      if (!this.gi()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dvd $$0 = this.dX().a_(this.dx());
            dvd $$1 = this.bu();
            $$2 = $$0.a(awz.aV) || $$1.a(awz.aV) || this.b(axf.b) > 0.0;
            if (this.dl() instanceof clz $$3 && $$3.q()) {
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
      this.aY();
   }

   private boolean y() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean F() {
      return true;
   }

   private void gv() {
      if (this.by()) {
         ezm $$0 = ezm.a(this);
         if ($$0.a(dmn.d, this.dx(), true) && !this.dX().b_(this.dx().d()).a(axf.b)) {
            this.d(true);
         } else {
            this.h(this.dA().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bwc.a t() {
      return cgm.gA().a(bwd.v, 0.175F);
   }

   @Override
   protected awj w() {
      return !this.gs() && !this.y() ? awk.ya : null;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.ye;
   }

   @Override
   protected awj o_() {
      return awk.yd;
   }

   @Override
   protected boolean r(btz $$0) {
      return !this.cb() && !this.a(axf.b);
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
   protected ceh b(dev $$0) {
      return new clz.b(this, $$0);
   }

   @Override
   public float a(jg $$0, dey $$1) {
      if ($$1.a_($$0).y().a(axf.b)) {
         return 10.0F;
      } else {
         return this.by() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public clz b(arm $$0, btq $$1) {
      return bug.aZ.a($$0, buf.e);
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.au);
   }

   @Override
   protected void eJ() {
      super.eJ();
      if (this.i()) {
         this.a(cwb.nL);
      }
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      boolean $$2 = this.l($$0.b($$1));
      if (!$$2 && this.i() && !this.cb() && !$$0.ga()) {
         if (!this.dX().C) {
            $$0.n(this);
         }

         return bry.a;
      } else {
         bry $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cvx $$4 = $$0.b($$1);
            return (bry)($$4.a(cwb.nL) ? $$4.a($$0, this, $$1) : bry.e);
         } else {
            if ($$2 && !this.bc()) {
               this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.yh, this.dn(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ezh cU() {
      return new ezh(0.0, (double)(0.6F * this.cT()), (double)(this.ds() * 0.4F));
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azr $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bux $$5 = bug.bx.a($$0.E(), buf.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cmf.b(cmf.a($$4), false));
               $$5.a(buh.a, new cvx(cwb.nS));
               this.a(new cvx(cwb.nL), null);
            }
         } else if ($$4.a(10) == 0) {
            btq $$6 = bug.aZ.a($$0.E(), buf.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new btq.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bvo a(dfl $$0, brw $$1, bux $$2, @Nullable bvo $$3) {
      $$2.b(this.dC(), this.dE(), this.dI(), this.dN(), 0.0F);
      $$2.a($$0, $$1, buf.g, $$3);
      $$2.a(this, true);
      return new btq.a(0.0F);
   }

   static class a extends ccg {
      private final clz g;

      a(clz $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public jg k() {
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
      protected boolean a(dey $$0, jg $$1) {
         return $$0.a_($$1).a(dia.H) && $$0.a_($$1.d()).a(ert.a);
      }
   }

   static class b extends ceg {
      b(clz $$0, dev $$1) {
         super($$0, $$1);
      }

      @Override
      protected eru a(int $$0) {
         this.o = new esa();
         this.o.a(true);
         return new eru(this.o, $$0);
      }

      @Override
      protected boolean a(erv $$0) {
         return $$0 != erv.i && $$0 != erv.o && $$0 != erv.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jg $$0) {
         return this.b.a_($$0).a(dia.H) || super.a($$0);
      }
   }
}
