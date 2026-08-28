import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgf extends cgs implements btj, bto {
   public static final float ca = 0.45F;
   public static final int cb = 55;
   public static final int cd = 30;
   private static final float cB = 0.1F;
   private static final float cC = 1.4285F;
   private static final float cD = 22.2222F;
   private static final int cE = 5;
   private static final int cF = 40;
   private static final int cG = 52;
   private static final int cH = 80;
   private static final float cI = 1.43F;
   public static final ajp<Boolean> ce = ajt.a(cgf.class, ajr.k);
   public static final ajp<Long> cf = ajt.a(cgf.class, ajr.c);
   public final bry cg = new bry();
   public final bry ch = new bry();
   public final bry ci = new bry();
   public final bry cj = new bry();
   public final bry ck = new bry();
   private static final bsg cJ = bsg.b(bsj.o.l(), bsj.o.m() - 1.43F).b(0.845F);
   private int cK = 0;
   private int cL = 0;

   public cgf(bsj<? extends cgf> $$0, dcd $$1) {
      super($$0, $$1);
      this.bR = new cgf.c();
      this.bQ = new cgf.b();
      ccj $$2 = (ccj)this.K();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.ao.a(cf));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(btk.k);
      }

      this.a($$1);
   }

   public static buf.a s() {
      return gM().a(bug.s, 32.0).a(bug.v, 0.09F).a(bug.o, 0.42F).a(bug.B, 1.5);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0L);
   }

   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      cgg.a(this, $$0.E_());
      this.b($$0.E().Z());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bua.b<cgf> dU() {
      return cgg.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return cgg.a(this.dU().a($$0));
   }

   @Override
   public bsg e(btk $$0) {
      return $$0 == btk.k ? cJ.a(this.ea()) : super.e($$0);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("camelBrain");
      bua<?> $$0 = this.dT();
      ((bua<cgf>)$$0).a((aqk)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("camelActivityUpdate");
      cgg.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cK < 50 && (this.aE() || this.bi() || this.bR())) {
         this.w(false);
      }

      if (this.cK > 0) {
         this.cK--;
         if (this.cK == 0) {
            this.dP().a(null, this.dp(), avf.dz, avg.g, 1.0F, 1.0F);
         }
      }

      if (this.dP().x_()) {
         this.gX();
      }

      if (this.u()) {
         this.ad();
      }

      if (this.gv() && this.be()) {
         this.gA();
      }
   }

   private void gX() {
      if (this.cL <= 0) {
         this.cL = this.ah.a(40) + 80;
         this.cj.a(this.ai);
      } else {
         this.cL--;
      }

      if (this.gw()) {
         this.ci.a();
         this.ck.a();
         if (this.gY()) {
            this.cg.b(this.ai);
            this.ch.a();
         } else {
            this.cg.a();
            this.ch.b(this.ai);
         }
      } else {
         this.cg.a();
         this.ch.a();
         this.ck.a(this.y(), this.ai);
         this.ci.a(this.gx() && this.gB() >= 0L, this.ai);
      }
   }

   @Override
   protected void y(float $$0) {
      float $$1;
      if (this.ar() == btk.a && !this.ck.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aU.a($$1, 0.2F);
   }

   @Override
   public void a(evz $$0) {
      if (this.u() && this.aE()) {
         this.h(this.ds().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cmh $$0, evz $$1) {
      super.a($$0, $$1);
      if ($$0.bq > 0.0F && this.gv() && !this.gx()) {
         this.gz();
      }
   }

   public boolean u() {
      return this.gv() || this.gx();
   }

   @Override
   protected float e(cmh $$0) {
      float $$1 = $$0.cb() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(bug.v) + $$1;
   }

   @Override
   protected evy j(bsy $$0) {
      return this.u() ? new evy(this.dH(), this.dF()) : super.j($$0);
   }

   @Override
   protected evz b(cmh $$0, evz $$1) {
      return this.u() ? evz.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.u() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cK <= 0 && this.aE()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dI() {
      return true;
   }

   @Override
   protected void b(float $$0, evz $$1) {
      double $$2 = (double)this.fd();
      this.i(this.bL().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(bug.v) * (double)this.aN()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cK = 55;
      this.w(true);
      this.av = true;
   }

   public boolean y() {
      return this.ao.a(ce);
   }

   public void w(boolean $$0) {
      this.ao.a(ce, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(avf.dy);
      this.a(dxa.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cK;
   }

   @Override
   protected ave v() {
      return avf.dx;
   }

   @Override
   protected ave o_() {
      return avf.dA;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.dC;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      if ($$1.a(avu.bp)) {
         this.a(avf.dH, 1.0F, 1.0F);
      } else {
         this.a(avf.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.ah);
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ($$0.fN() && !this.p_()) {
         this.b($$0);
         return bqd.a(this.dP().B);
      } else {
         bqd $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cS().size() < 2 && !this.p_()) {
               this.f($$0);
            }

            return bqd.a(this.dP().B);
         }
      }
   }

   @Override
   protected void G(float $$0) {
      if ($$0 > 6.0F && this.gv() && !this.gx() && this.gn()) {
         this.gz();
      }
   }

   public boolean gn() {
      return this.g(this.gv() ? btk.a : btk.k);
   }

   @Override
   protected boolean a(cmh $$0, cua $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.ew() < this.eN();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gC() && this.g() == 0 && this.go();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.p_();
         if ($$4) {
            this.dP().a(lj.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dP().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aW()) {
               ave $$5 = this.gu();
               if ($$5 != null) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), $$5, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
               }
            }

            this.a(dxa.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   public boolean a(ceo $$0) {
      if ($$0 != this && $$0 instanceof cgf $$1 && this.gU() && $$1.gU()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cgf b(aqk $$0, brx $$1) {
      return bsj.o.a((dcd)$$0);
   }

   @Nullable
   @Override
   protected ave gu() {
      return avf.dB;
   }

   @Override
   protected void f(bqw $$0, float $$1) {
      this.gA();
      super.f($$0, $$1);
   }

   @Override
   protected evz a(bsd $$0, bsg $$1, float $$2) {
      int $$3 = Math.max(this.cS().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dK() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cS().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof ceo) {
            $$5 += 0.2F;
         }
      }

      return new evz(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dF() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ea() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bsg $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gx();
      boolean $$9 = this.gv();
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

         float $$15 = aye.a((float)this.gB() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)aye.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)aye.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public evz q(float $$0) {
      bsg $$1 = this.a(this.ar());
      float $$2 = this.ea();
      return new evz(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   protected boolean r(bsd $$0) {
      return this.cS().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   public boolean gv() {
      return this.ao.a(cf) < 0L;
   }

   public boolean gw() {
      return this.gB() < 0L != this.gv();
   }

   public boolean gx() {
      long $$0 = this.gB();
      return $$0 < (long)(this.gv() ? 40 : 52);
   }

   private boolean gY() {
      return this.gv() && this.gB() < 40L && this.gB() >= 0L;
   }

   public void gy() {
      if (!this.gv()) {
         this.b(avf.dE);
         this.b(btk.k);
         this.a(dxa.u);
         this.a(-this.dP().Z());
      }
   }

   public void gz() {
      if (this.gv()) {
         this.b(avf.dF);
         this.b(btk.a);
         this.a(dxa.u);
         this.a(this.dP().Z());
      }
   }

   public void gA() {
      this.b(btk.a);
      this.a(dxa.u);
      this.b(this.dP().Z());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.ao.a(cf, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gB() {
      return this.dP().Z() - Math.abs(this.ao.a(cf));
   }

   @Override
   public ave Y_() {
      return avf.dD;
   }

   @Override
   public void a(ajp<?> $$0) {
      if (!this.an && ce.equals($$0)) {
         this.cK = this.cK == 0 ? 55 : this.cK;
      }

      super.a($$0);
   }

   @Override
   public boolean gC() {
      return true;
   }

   @Override
   public void b(cmh $$0) {
      if (!this.dP().B) {
         $$0.a(this, this.cu);
      }
   }

   @Override
   protected byu E() {
      return new cgf.a(this);
   }

   class a extends byu {
      public a(final cgf $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgf.this.u()) {
            super.a();
         }
      }
   }

   class b extends byy {
      b() {
         super(cgf.this);
      }

      @Override
      public void a() {
         if (!cgf.this.cR()) {
            super.a();
         }
      }
   }

   class c extends byz {
      public c() {
         super(cgf.this);
      }

      @Override
      public void a() {
         if (this.k == byz.a.b && !cgf.this.fZ() && cgf.this.gv() && !cgf.this.gx() && cgf.this.gn()) {
            cgf.this.gz();
         }

         super.a();
      }
   }
}
