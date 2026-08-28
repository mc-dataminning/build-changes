import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cml extends cgy implements bve, bvx {
   private static final akv bY = akv.b("suffocating");
   private static final bwn bZ = new bwn(bY, -0.34F, bwn.a.b);
   private static final float ca = 0.35F;
   private static final float cc = 0.55F;
   private static final ajy<Integer> cd = akc.a(cml.class, aka.b);
   private static final ajy<Boolean> ce = akc.a(cml.class, aka.k);
   private static final ajy<Boolean> cf = akc.a(cml.class, aka.k);
   private final bvd cg = new bvd(this.al, cd, cf);
   @Nullable
   private cdn ch;

   public cml(bus<? extends cml> $$0, dgi $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(etq.j, -1.0F);
      this.a(etq.i, 0.0F);
      this.a(etq.n, 0.0F);
      this.a(etq.o, 0.0F);
   }

   public static boolean c(bus<cml> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
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
   public void a(cwp $$0, @Nullable awb $$1) {
      this.cg.a(true);
      if ($$1 != null) {
         this.dV().a(null, this, awa.yS, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void E() {
      this.bS.a(1, new ccy(this, 1.65));
      this.bS.a(2, new cbr(this, 1.0));
      this.ch = new cdn(this, 1.4, $$0 -> $$0.a(awy.ay), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new cml.a(this, 1.0));
      this.bS.a(5, new cce(this, 1.0));
      this.bS.a(7, new cdc(this, 1.0, 60));
      this.bS.a(8, new ccn(this, cox.class, 8.0F));
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

   public boolean p() {
      return this.al.a(ce);
   }

   @Override
   public boolean a(esz $$0) {
      return $$0.a(awv.b);
   }

   @Override
   protected fba a(bul $$0, buo $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.b());
      float $$4 = this.aT.c();
      float $$5 = 0.12F * ayz.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dgl $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bvh cW() {
      return (bvh)(this.j() && this.cZ() instanceof cox $$0 && $$0.b(cwt.ou) ? $$0 : super.cW());
   }

   @Override
   public fba b(bvh $$0) {
      fba[] $$1 = new fba[]{
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

      for (fba $$6 : $$1) {
         $$5.b(this.dA() + $$6.d, $$3, this.dG() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jn.a);
         }
      }

      for (ji $$8 : $$2) {
         if (!this.dV().b_($$8).a(awv.b)) {
            double $$9 = this.dV().j($$8);
            if (crc.a($$9)) {
               fba $$10 = fba.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fO().iterator();

               while (var14.hasNext()) {
                  bvt $$11 = (bvt)var14.next();
                  fav $$12 = $$0.f($$11);
                  if (crc.a(this.dV(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fba(this.dA(), this.cR().e, this.dG());
   }

   @Override
   protected void a(cox $$0, fba $$1) {
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aX = this.aZ = this.dL();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected fba b(cox $$0, fba $$1) {
      return new fba(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cox $$0) {
      return (float)(this.h(bwp.v) * (double)(this.p() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(this.bx() ? awa.yQ : awa.yP, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.dY());
   }

   @Override
   protected void a(double $$0, boolean $$1, dwx $$2, ji $$3) {
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
            dwx $$0 = this.dV().a_(this.dv());
            dwx $$1 = this.bt();
            $$2 = $$0.a(awp.aW) || $$1.a(awp.aW) || this.b(awv.b) > 0.0;
            if (this.dk() instanceof cml $$3 && $$3.p()) {
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
         fbf $$0 = fbf.a(this);
         if ($$0.a(doe.d, this.dv(), true) && !this.dV().b_(this.dv().d()).a(awv.b)) {
            this.d(true);
         } else {
            this.i(this.dy().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bwo.a t() {
      return cgy.gx().a(bwp.v, 0.175F);
   }

   @Override
   protected avz u() {
      return !this.gp() && !this.x() ? awa.yK : null;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.yO;
   }

   @Override
   protected avz o_() {
      return awa.yN;
   }

   @Override
   protected boolean r(bul $$0) {
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
   protected cet b(dgi $$0) {
      return new cml.b(this, $$0);
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      if ($$1.a_($$0).y().a(awv.b)) {
         return 10.0F;
      } else {
         return this.bx() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cml b(ard $$0, buc $$1) {
      return bus.bs.a($$0, bur.e);
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.ax);
   }

   @Override
   protected void f(ard $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cwt.on);
      }
   }

   @Override
   public bsk b(cox $$0, bsj $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fY()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bsk.a;
      } else {
         bsk $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cwp $$4 = $$0.b($$1);
            return (bsk)($$4.a(cwt.on) ? $$4.a($$0, this, $$1) : bsk.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.yR, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fba cT() {
      return new fba(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if (this.e_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azh $$4 = $$0.H_();
         if ($$4.a(30) == 0) {
            bvj $$5 = bus.bQ.a($$0.a(), bur.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cmr.b(cmr.a($$4), false));
               $$5.a(but.a, new cwp(cwt.ou));
               this.a(new cwp(cwt.on), null);
            }
         } else if ($$4.a(10) == 0) {
            buc $$6 = bus.bs.a($$0.a(), bur.g);
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

   private bwa a(dgz $$0, bsi $$1, bvj $$2, @Nullable bwa $$3) {
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
      protected boolean a(dgl $$0, ji $$1) {
         return $$0.a_($$1).a(djo.K) && $$0.a_($$1.d()).a(eto.a);
      }
   }

   static class b extends ces {
      b(cml $$0, dgi $$1) {
         super($$0, $$1);
      }

      @Override
      protected etp a(int $$0) {
         this.o = new etv();
         return new etp(this.o, $$0);
      }

      @Override
      protected boolean a(etq $$0) {
         return $$0 != etq.i && $$0 != etq.o && $$0 != etq.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ji $$0) {
         return this.b.a_($$0).a(djo.K) || super.a($$0);
      }
   }
}
