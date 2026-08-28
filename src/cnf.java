import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cnf extends chp implements bvv, bwo {
   private static final aku bF = aku.b("suffocating");
   private static final bxe bG = new bxe(bF, -0.34F, bxe.a.b);
   private static final float bH = 0.35F;
   private static final float bJ = 0.55F;
   private static final ajx<Integer> bK = akb.a(cnf.class, ajz.b);
   private static final ajx<Boolean> bL = akb.a(cnf.class, ajz.k);
   private static final ajx<Boolean> bM = akb.a(cnf.class, ajz.k);
   private final bvu bN = new bvu(this.al, bK, bM);
   @Nullable
   private cee bO;

   public cnf(bvi<? extends cnf> $$0, dgz $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eun.j, -1.0F);
      this.a(eun.i, 0.0F);
      this.a(eun.n, 0.0F);
      this.a(eun.o, 0.0F);
   }

   public static boolean c(bvi<cnf> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      ji.a $$5 = $$3.k();

      do {
         $$5.c(jn.b);
      } while ($$1.b_($$5).a(awv.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(ajx<?> $$0) {
      if (bK.equals($$0) && this.dU().C) {
         this.bN.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bK, 0);
      $$0.a(bL, false);
      $$0.a(bM, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.bN.a($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.bN.b($$0);
   }

   @Override
   public boolean j() {
      return this.bN.d();
   }

   @Override
   public boolean e() {
      return this.bJ() && !this.n_();
   }

   @Override
   public void a(cxh $$0, @Nullable awb $$1) {
      this.bN.a(true);
      if ($$1 != null) {
         this.dU().a(null, this, awa.zc, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void D() {
      this.bC.a(1, new cdp(this, 1.65));
      this.bC.a(2, new cci(this, 1.0));
      this.bO = new cee(this, 1.4, $$0 -> $$0.a(awy.ay), false);
      this.bC.a(3, this.bO);
      this.bC.a(4, new cnf.a(this, 1.0));
      this.bC.a(5, new ccv(this, 1.0));
      this.bC.a(7, new cdt(this, 1.0, 60));
      this.bC.a(8, new cde(this, cpr.class, 8.0F));
      this.bC.a(8, new cdr(this));
      this.bC.a(9, new cde(this, cnf.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.al.a(bL, $$0);
      bxc $$1 = this.g(bxg.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(bG);
         } else {
            $$1.c(bF);
         }
      }
   }

   public boolean q() {
      return this.al.a(bL);
   }

   @Override
   public boolean a(etw $$0) {
      return $$0.a(awv.b);
   }

   @Override
   protected fbx a(bva $$0, bvd $$1, float $$2) {
      if (!this.dU().w_()) {
         return super.a($$0, $$1, $$2);
      } else {
         float $$3 = Math.min(0.25F, this.aT.b());
         float $$4 = this.aT.c();
         float $$5 = 0.12F * ayz.b($$4 * 1.5F) * 2.0F * $$3;
         return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
      }
   }

   @Override
   public boolean a(dhc $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bvy cV() {
      return (bvy)(this.j() && this.cY() instanceof cpr $$0 && $$0.b(cxl.ow) ? $$0 : super.cV());
   }

   @Override
   public fbx b(bvy $$0) {
      fbx[] $$1 = new fbx[]{
         a((double)this.dp(), (double)$$0.dp(), $$0.dK()),
         a((double)this.dp(), (double)$$0.dp(), $$0.dK() - 22.5F),
         a((double)this.dp(), (double)$$0.dp(), $$0.dK() + 22.5F),
         a((double)this.dp(), (double)$$0.dp(), $$0.dK() - 45.0F),
         a((double)this.dp(), (double)$$0.dp(), $$0.dK() + 45.0F)
      };
      Set<ji> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cQ().e;
      double $$4 = this.cQ().b - 0.5;
      ji.a $$5 = new ji.a();

      for (fbx $$6 : $$1) {
         $$5.b(this.dz() + $$6.d, $$3, this.dF() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jn.a);
         }
      }

      for (ji $$8 : $$2) {
         if (!this.dU().b_($$8).a(awv.b)) {
            double $$9 = this.dU().j($$8);
            if (crw.a($$9)) {
               fbx $$10 = fbx.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fQ().iterator();

               while (var14.hasNext()) {
                  bwk $$11 = (bwk)var14.next();
                  fbs $$12 = $$0.f($$11);
                  if (crw.a(this.dU(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fbx(this.dz(), this.cQ().e, this.dF());
   }

   @Override
   protected void a(cpr $$0, fbx $$1) {
      this.b($$0.dK(), $$0.dM() * 0.5F);
      this.N = this.aV = this.aX = this.dK();
      this.bN.b();
      super.a($$0, $$1);
   }

   @Override
   protected fbx b(cpr $$0, fbx $$1) {
      return new fbx(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(cpr $$0) {
      return (float)(this.h(bxg.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.bN.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(this.bv() ? awa.za : awa.yZ, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.bN.a(this.dX());
   }

   @Override
   protected void a(double $$0, boolean $$1, dxq $$2, ji $$3) {
      if (this.bv()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(awa.yV);
      } else if (this.gp() && this.ae.a(60) == 0) {
         this.b(awa.yW);
      }

      if (!this.gh()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dxq $$0 = this.dU().a_(this.du());
            dxq $$1 = this.br();
            $$2 = $$0.a(awp.aW) || $$1.a(awp.aW) || this.b(awv.b) > 0.0;
            if (this.dj() instanceof cnf $$3 && $$3.q()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.h();
      this.gs();
   }

   private boolean x() {
      return this.bO != null && this.bO.i();
   }

   @Override
   protected boolean F() {
      return true;
   }

   private void gs() {
      if (this.bv()) {
         fcc $$0 = fcc.a(this);
         if ($$0.a(doy.d, this.du(), true) && !this.dU().b_(this.du().d()).a(awv.b)) {
            this.d(true);
         } else {
            this.i(this.dx().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bxf.a t() {
      return chp.gx().a(bxg.v, 0.175F);
   }

   @Override
   protected avz u() {
      return !this.gp() && !this.x() ? awa.yU : null;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.yY;
   }

   @Override
   protected avz l_() {
      return awa.yX;
   }

   @Override
   protected boolean r(bva $$0) {
      return !this.bZ() && !this.a(awv.b);
   }

   @Override
   public boolean ft() {
      return true;
   }

   @Override
   public boolean bX() {
      return false;
   }

   @Override
   protected cfk b(dgz $$0) {
      return new cnf.b(this, $$0);
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      if ($$1.a_($$0).y().a(awv.b)) {
         return 10.0F;
      } else {
         return this.bv() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cnf b(ard $$0, buq $$1) {
      return bvi.bs.a($$0, bvh.e);
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.ax);
   }

   @Override
   protected void f(ard $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cxl.op);
      }
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.bZ() && !$$0.ga()) {
         if (!this.dU().C) {
            $$0.n(this);
         }

         return bsy.a;
      } else {
         bsy $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cxh $$4 = $$0.b($$1);
            return (bsy)($$4.a(cxl.op) ? $$4.a($$0, this, $$1) : bsy.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.zb, this.dl(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, (double)(0.6F * this.cR()), (double)(this.dp() * 0.4F));
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      if (this.n_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azh $$4 = $$0.C_();
         if ($$4.a(30) == 0) {
            bwa $$5 = bvi.bQ.a($$0.a(), bvh.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cnl.b(cnl.a($$4), false));
               $$5.a(bvj.a, new cxh(cxl.ow));
               this.a(new cxh(cxl.op), null);
            }
         } else if ($$4.a(10) == 0) {
            buq $$6 = bvi.bs.a($$0.a(), bvh.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new buq.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bwr a(dhq $$0, bsw $$1, bwa $$2, @Nullable bwr $$3) {
      $$2.b(this.dz(), this.dB(), this.dF(), this.dK(), 0.0F);
      $$2.a($$0, $$1, bvh.g, $$3);
      $$2.a(this, true);
      return new buq.a(0.0F);
   }

   static class a extends cdj {
      private final cnf g;

      a(cnf $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public ji k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bv() && this.a(this.g.dU(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bv() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dhc $$0, ji $$1) {
         return $$0.a_($$1).a(dkg.K) && $$0.a_($$1.d()).a(eul.a);
      }
   }

   static class b extends cfj {
      b(cnf $$0, dgz $$1) {
         super($$0, $$1);
      }

      @Override
      protected eum a(int $$0) {
         this.o = new eus();
         return new eum(this.o, $$0);
      }

      @Override
      protected boolean a(eun $$0) {
         return $$0 != eun.i && $$0 != eun.o && $$0 != eun.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ji $$0) {
         return this.b.a_($$0).a(dkg.K) || super.a($$0);
      }
   }
}
