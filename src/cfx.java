import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cfx extends cgk implements btb, btg {
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
   public static final ajs<Boolean> cc = ajw.a(cfx.class, aju.k);
   public static final ajs<Long> cd = ajw.a(cfx.class, aju.c);
   public final brr ce = new brr();
   public final brr cf = new brr();
   public final brr cg = new brr();
   public final brr ch = new brr();
   public final brr ci = new brr();
   private static final brz cH = brz.b(bsc.o.l(), bsc.o.m() - 1.43F).b(0.845F);
   private int cI = 0;
   private int cJ = 0;

   public cfx(bsc<? extends cfx> $$0, daz $$1) {
      super($$0, $$1);
      this.bP = new cfx.c();
      this.bO = new cfx.b();
      ccb $$2 = (ccb)this.K();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.ao.a(cd));
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(btc.k);
      }

      this.a($$1);
   }

   public static btx.a s() {
      return gO().a(bty.q, 32.0).a(bty.r, 0.09F).a(bty.m, 0.42F).a(bty.v, 1.5);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      cfy.a(this, $$0.E_());
      this.b($$0.E().Y());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bts.b<cfx> dT() {
      return cfy.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return cfy.a(this.dT().a($$0));
   }

   @Override
   public brz e(btc $$0) {
      return $$0 == btc.k ? cH.a(this.ed()) : super.e($$0);
   }

   @Override
   protected void Y() {
      this.dP().af().a("camelBrain");
      bts<?> $$0 = this.dS();
      ((bts<cfx>)$$0).a((aqn)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("camelActivityUpdate");
      cfy.a(this);
      this.dP().af().c();
      super.Y();
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
            this.dP().a(null, this.dp(), avi.dz, avj.g, 1.0F, 1.0F);
         }
      }

      if (this.dP().x_()) {
         this.gZ();
      }

      if (this.u()) {
         this.ab();
      }

      if (this.gx() && this.be()) {
         this.gC();
      }
   }

   private void gZ() {
      if (this.cJ <= 0) {
         this.cJ = this.ah.a(40) + 80;
         this.ch.a(this.ai);
      } else {
         this.cJ--;
      }

      if (this.gy()) {
         this.cg.a();
         this.ci.a();
         if (this.ha()) {
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
         this.cg.a(this.gz() && this.gD() >= 0L, this.ai);
      }
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.ar() == btc.a && !this.ci.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aU.a($$1, 0.2F);
   }

   @Override
   public void a(eum $$0) {
      if (this.u() && this.aE()) {
         this.g(this.ds().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cly $$0, eum $$1) {
      super.a($$0, $$1);
      if ($$0.bq > 0.0F && this.gx() && !this.gz()) {
         this.gB();
      }
   }

   public boolean u() {
      return this.gx() || this.gz();
   }

   @Override
   protected float e(cly $$0) {
      float $$1 = $$0.cb() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(bty.r) + $$1;
   }

   @Override
   protected eul j(bsq $$0) {
      return this.u() ? new eul(this.dH(), this.dF()) : super.j($$0);
   }

   @Override
   protected eum b(cly $$0, eum $$1) {
      return this.u() ? eum.b : super.b($$0, $$1);
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
   protected void b(float $$0, eum $$1) {
      double $$2 = (double)this.fh();
      this.h(this.bL().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(bty.r) * (double)this.aN()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(avi.dy);
      this.a(dvw.u);
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
   protected avh v() {
      return avi.dx;
   }

   @Override
   protected avh o_() {
      return avi.dA;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.dC;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      if ($$1.a(avx.bp)) {
         this.a(avi.dH, 1.0F, 1.0F);
      } else {
         this.a(avi.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.ah);
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if ($$0.fR() && !this.p_()) {
         this.b($$0);
         return bpw.a(this.dP().B);
      } else {
         bpw $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cS().size() < 2 && !this.p_()) {
               this.f($$0);
            }

            return bpw.a(this.dP().B);
         }
      }
   }

   @Override
   protected void F(float $$0) {
      if ($$0 > 6.0F && this.gx() && !this.gz() && this.gp()) {
         this.gB();
      }
   }

   public boolean gp() {
      return this.g(this.gx() ? btc.a : btc.k);
   }

   @Override
   protected boolean a(cly $$0, ctq $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.eA() < this.eR();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gE() && this.g() == 0 && this.gq();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.p_();
         if ($$4) {
            this.dP().a(ky.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dP().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aW()) {
               avh $$5 = this.gw();
               if ($$5 != null) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), $$5, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
               }
            }

            this.a(dvw.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   public boolean a(ceg $$0) {
      if ($$0 != this && $$0 instanceof cfx $$1 && this.gW() && $$1.gW()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cfx b(aqn $$0, brq $$1) {
      return bsc.o.a((daz)$$0);
   }

   @Nullable
   @Override
   protected avh gw() {
      return avi.dB;
   }

   @Override
   protected void f(bqp $$0, float $$1) {
      this.gC();
      super.f($$0, $$1);
   }

   @Override
   protected eum a(brw $$0, brz $$1, float $$2) {
      int $$3 = Math.max(this.cS().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dK() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cS().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof ceg) {
            $$5 += 0.2F;
         }
      }

      return new eum(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dF() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ed() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, brz $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gz();
      boolean $$9 = this.gx();
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

         float $$15 = ayf.a((float)this.gD() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)ayf.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)ayf.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public eum p(float $$0) {
      brz $$1 = this.a(this.ar());
      float $$2 = this.ed();
      return new eum(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(brw $$0) {
      return this.cS().size() <= 2;
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }

   public boolean gx() {
      return this.ao.a(cd) < 0L;
   }

   public boolean gy() {
      return this.gD() < 0L != this.gx();
   }

   public boolean gz() {
      long $$0 = this.gD();
      return $$0 < (long)(this.gx() ? 40 : 52);
   }

   private boolean ha() {
      return this.gx() && this.gD() < 40L && this.gD() >= 0L;
   }

   public void gA() {
      if (!this.gx()) {
         this.b(avi.dE);
         this.b(btc.k);
         this.a(dvw.u);
         this.a(-this.dP().Y());
      }
   }

   public void gB() {
      if (this.gx()) {
         this.b(avi.dF);
         this.b(btc.a);
         this.a(dvw.u);
         this.a(this.dP().Y());
      }
   }

   public void gC() {
      this.b(btc.a);
      this.a(dvw.u);
      this.b(this.dP().Y());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.ao.a(cd, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gD() {
      return this.dP().Y() - Math.abs(this.ao.a(cd));
   }

   @Override
   public avh Y_() {
      return avi.dD;
   }

   @Override
   public void a(ajs<?> $$0) {
      if (!this.an && cc.equals($$0)) {
         this.cI = this.cI == 0 ? 55 : this.cI;
      }

      super.a($$0);
   }

   @Override
   public boolean gE() {
      return true;
   }

   @Override
   public void b(cly $$0) {
      if (!this.dP().B) {
         $$0.a(this, this.cs);
      }
   }

   @Override
   protected bym E() {
      return new cfx.a(this);
   }

   class a extends bym {
      public a(cfx $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cfx.this.u()) {
            super.a();
         }
      }
   }

   class b extends byq {
      b() {
         super(cfx.this);
      }

      @Override
      public void a() {
         if (!cfx.this.cR()) {
            super.a();
         }
      }
   }

   class c extends byr {
      public c() {
         super(cfx.this);
      }

      @Override
      public void a() {
         if (this.k == byr.a.b && !cfx.this.gc() && cfx.this.gx() && !cfx.this.gz() && cfx.this.gp()) {
            cfx.this.gB();
         }

         super.a();
      }
   }
}
