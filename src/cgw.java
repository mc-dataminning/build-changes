import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgw extends chj implements bua, buf {
   public static final float bY = 0.45F;
   public static final int bZ = 55;
   public static final int cb = 30;
   private static final float cz = 0.1F;
   private static final float cA = 1.4285F;
   private static final float cB = 22.2222F;
   private static final int cC = 5;
   private static final int cD = 40;
   private static final int cE = 52;
   private static final int cF = 80;
   private static final float cG = 1.43F;
   public static final akk<Boolean> cc = ako.a(cgw.class, akm.k);
   public static final akk<Long> cd = ako.a(cgw.class, akm.c);
   public final bsp ce = new bsp();
   public final bsp cf = new bsp();
   public final bsp cg = new bsp();
   public final bsp ch = new bsp();
   public final bsp ci = new bsp();
   private static final bsx cH = bsx.b(bta.o.l(), bta.o.m() - 1.43F).b(0.845F);
   private int cI = 0;
   private int cJ = 0;

   public cgw(bta<? extends cgw> $$0, dby $$1) {
      super($$0, $$1);
      this.bP = new cgw.c();
      this.bO = new cgw.b();
      cda $$2 = (cda)this.K();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.ao.a(cd));
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bub.k);
      }

      this.a($$1);
   }

   public static buw.a s() {
      return gP().a(bux.q, 32.0).a(bux.r, 0.09F).a(bux.m, 0.42F).a(bux.v, 1.5);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      cgx.a(this, $$0.E_());
      this.b($$0.E().Z());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bur.b<cgw> dT() {
      return cgx.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      return cgx.a(this.dT().a($$0));
   }

   @Override
   public bsx e(bub $$0) {
      return $$0 == bub.k ? cH.a(this.ed()) : super.e($$0);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("camelBrain");
      bur<?> $$0 = this.dS();
      ((bur<cgw>)$$0).a((arf)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("camelActivityUpdate");
      cgx.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cI < 50 && (this.aE() || this.bi() || this.bR())) {
         this.w(false);
      }

      if (this.cI > 0) {
         this.cI--;
         if (this.cI == 0) {
            this.dP().a(null, this.dp(), awa.dz, awb.g, 1.0F, 1.0F);
         }
      }

      if (this.dP().x_()) {
         this.ha();
      }

      if (this.u()) {
         this.ad();
      }

      if (this.gy() && this.be()) {
         this.gD();
      }
   }

   private void ha() {
      if (this.cJ <= 0) {
         this.cJ = this.ah.a(40) + 80;
         this.ch.a(this.ai);
      } else {
         this.cJ--;
      }

      if (this.gz()) {
         this.cg.a();
         this.ci.a();
         if (this.hb()) {
            this.ce.b(this.ai);
            this.cf.a();
         } else {
            this.ce.a();
            this.cf.b(this.ai);
         }
      } else {
         this.ce.a();
         this.cf.a();
         this.ci.a(this.y(), this.ai);
         this.cg.a(this.gA() && this.gE() >= 0L, this.ai);
      }
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.ar() == bub.a && !this.ci.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aU.a($$1, 0.2F);
   }

   @Override
   public void a(evr $$0) {
      if (this.u() && this.aE()) {
         this.h(this.ds().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cmx $$0, evr $$1) {
      super.a($$0, $$1);
      if ($$0.bq > 0.0F && this.gy() && !this.gA()) {
         this.gC();
      }
   }

   public boolean u() {
      return this.gy() || this.gA();
   }

   @Override
   protected float e(cmx $$0) {
      float $$1 = $$0.cb() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(bux.r) + $$1;
   }

   @Override
   protected evq j(btp $$0) {
      return this.u() ? new evq(this.dH(), this.dF()) : super.j($$0);
   }

   @Override
   protected evr b(cmx $$0, evr $$1) {
      return this.u() ? evr.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.u() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cI <= 0 && this.aE()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dI() {
      return true;
   }

   @Override
   protected void b(float $$0, evr $$1) {
      double $$2 = (double)this.fh();
      this.i(this.bL().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(bux.r) * (double)this.aN()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cI = 55;
      this.w(true);
      this.av = true;
   }

   public boolean y() {
      return this.ao.a(cc);
   }

   public void w(boolean $$0) {
      this.ao.a(cc, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awa.dy);
      this.a(dwv.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cI;
   }

   @Override
   protected avz v() {
      return awa.dx;
   }

   @Override
   protected avz o_() {
      return awa.dA;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.dC;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      if ($$1.a(awp.bp)) {
         this.a(awa.dH, 1.0F, 1.0F);
      } else {
         this.a(awa.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(cup $$0) {
      return $$0.a(awy.ah);
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if ($$0.fR() && !this.p_()) {
         this.b($$0);
         return bqu.a(this.dP().B);
      } else {
         bqu $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cS().size() < 2 && !this.p_()) {
               this.f($$0);
            }

            return bqu.a(this.dP().B);
         }
      }
   }

   @Override
   protected void F(float $$0) {
      if ($$0 > 6.0F && this.gy() && !this.gA() && this.gq()) {
         this.gC();
      }
   }

   public boolean gq() {
      return this.g(this.gy() ? bub.a : bub.k);
   }

   @Override
   protected boolean a(cmx $$0, cup $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.eA() < this.eR();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gF() && this.g() == 0 && this.gr();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.p_();
         if ($$4) {
            this.dP().a(li.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dP().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aW()) {
               avz $$5 = this.gx();
               if ($$5 != null) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), $$5, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
               }
            }

            this.a(dwv.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   public boolean a(cff $$0) {
      if ($$0 != this && $$0 instanceof cgw $$1 && this.gX() && $$1.gX()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cgw b(arf $$0, bso $$1) {
      return bta.o.a((dby)$$0);
   }

   @Nullable
   @Override
   protected avz gx() {
      return awa.dB;
   }

   @Override
   protected void f(brn $$0, float $$1) {
      this.gD();
      super.f($$0, $$1);
   }

   @Override
   protected evr a(bsu $$0, bsx $$1, float $$2) {
      int $$3 = Math.max(this.cS().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dK() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cS().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cff) {
            $$5 += 0.2F;
         }
      }

      return new evr(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dF() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ed() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bsx $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gA();
      boolean $$9 = this.gy();
      if ($$8) {
         int $$10 = $$9 ? 40 : 52;
         int $$11;
         float $$12;
         if ($$9) {
            $$11 = 28;
            $$12 = $$0 ? 0.5F : 0.1F;
         } else {
            $$11 = $$0 ? 24 : 32;
            $$12 = $$0 ? 0.6F : 0.35F;
         }

         float $$15 = ayz.a((float)this.gE() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)ayz.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)ayz.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public evr p(float $$0) {
      bsx $$1 = this.a(this.ar());
      float $$2 = this.ed();
      return new evr(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   protected boolean r(bsu $$0) {
      return this.cS().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   public boolean gy() {
      return this.ao.a(cd) < 0L;
   }

   public boolean gz() {
      return this.gE() < 0L != this.gy();
   }

   public boolean gA() {
      long $$0 = this.gE();
      return $$0 < (long)(this.gy() ? 40 : 52);
   }

   private boolean hb() {
      return this.gy() && this.gE() < 40L && this.gE() >= 0L;
   }

   public void gB() {
      if (!this.gy()) {
         this.b(awa.dE);
         this.b(bub.k);
         this.a(dwv.u);
         this.a(-this.dP().Z());
      }
   }

   public void gC() {
      if (this.gy()) {
         this.b(awa.dF);
         this.b(bub.a);
         this.a(dwv.u);
         this.a(this.dP().Z());
      }
   }

   public void gD() {
      this.b(bub.a);
      this.a(dwv.u);
      this.b(this.dP().Z());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.ao.a(cd, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gE() {
      return this.dP().Z() - Math.abs(this.ao.a(cd));
   }

   @Override
   public avz Y_() {
      return awa.dD;
   }

   @Override
   public void a(akk<?> $$0) {
      if (!this.an && cc.equals($$0)) {
         this.cI = this.cI == 0 ? 55 : this.cI;
      }

      super.a($$0);
   }

   @Override
   public boolean gF() {
      return true;
   }

   @Override
   public void b(cmx $$0) {
      if (!this.dP().B) {
         $$0.a(this, this.cs);
      }
   }

   @Override
   protected bzl E() {
      return new cgw.a(this);
   }

   class a extends bzl {
      public a(final cgw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgw.this.u()) {
            super.a();
         }
      }
   }

   class b extends bzp {
      b() {
         super(cgw.this);
      }

      @Override
      public void a() {
         if (!cgw.this.cR()) {
            super.a();
         }
      }
   }

   class c extends bzq {
      public c() {
         super(cgw.this);
      }

      @Override
      public void a() {
         if (this.k == bzq.a.b && !cgw.this.gd() && cgw.this.gy() && !cgw.this.gA() && cgw.this.gq()) {
            cgw.this.gC();
         }

         super.a();
      }
   }
}
