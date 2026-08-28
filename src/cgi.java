import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgi extends cgv implements btm, btr {
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
   public static final ajp<Boolean> ce = ajt.a(cgi.class, ajr.k);
   public static final ajp<Long> cf = ajt.a(cgi.class, ajr.c);
   public final bsb cg = new bsb();
   public final bsb ch = new bsb();
   public final bsb ci = new bsb();
   public final bsb cj = new bsb();
   public final bsb ck = new bsb();
   private static final bsj cJ = bsj.b(bsm.o.l(), bsm.o.m() - 1.43F).b(0.845F);
   private int cK = 0;
   private int cL = 0;

   public cgi(bsm<? extends cgi> $$0, dcf $$1) {
      super($$0, $$1);
      this.bR = new cgi.c();
      this.bQ = new cgi.b();
      ccm $$2 = (ccm)this.K();
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
         this.b(btn.k);
      }

      this.a($$1);
   }

   public static bui.a s() {
      return gN().a(buj.s, 32.0).a(buj.v, 0.09F).a(buj.o, 0.42F).a(buj.B, 1.5);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0L);
   }

   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      cgj.a(this, $$0.E_());
      this.b($$0.E().Z());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bud.b<cgi> dV() {
      return cgj.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return cgj.a(this.dV().a($$0));
   }

   @Override
   public bsj e(btn $$0) {
      return $$0 == btn.k ? cJ.a(this.eb()) : super.e($$0);
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("camelBrain");
      bud<?> $$0 = this.dU();
      ((bud<cgi>)$$0).a((aqm)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("camelActivityUpdate");
      cgj.a(this);
      this.dQ().ag().c();
      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cK < 50 && (this.aF() || this.bj() || this.bS())) {
         this.w(false);
      }

      if (this.cK > 0) {
         this.cK--;
         if (this.cK == 0) {
            this.dQ().a(null, this.dq(), avh.dz, avi.g, 1.0F, 1.0F);
         }
      }

      if (this.dQ().x_()) {
         this.gY();
      }

      if (this.u()) {
         this.ad();
      }

      if (this.gw() && this.bf()) {
         this.gB();
      }
   }

   private void gY() {
      if (this.cL <= 0) {
         this.cL = this.ah.a(40) + 80;
         this.cj.a(this.ai);
      } else {
         this.cL--;
      }

      if (this.gx()) {
         this.ci.a();
         this.ck.a();
         if (this.gZ()) {
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
         this.ci.a(this.gy() && this.gC() >= 0L, this.ai);
      }
   }

   @Override
   protected void y(float $$0) {
      float $$1;
      if (this.as() == btn.a && !this.ck.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aU.a($$1, 0.2F);
   }

   @Override
   public void a(ewf $$0) {
      if (this.u() && this.aF()) {
         this.i(this.dt().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cmk $$0, ewf $$1) {
      super.a($$0, $$1);
      if ($$0.bq > 0.0F && this.gw() && !this.gy()) {
         this.gA();
      }
   }

   public boolean u() {
      return this.gw() || this.gy();
   }

   @Override
   protected float e(cmk $$0) {
      float $$1 = $$0.cc() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(buj.v) + $$1;
   }

   @Override
   protected ewe j(btb $$0) {
      return this.u() ? new ewe(this.dI(), this.dG()) : super.j($$0);
   }

   @Override
   protected ewf b(cmk $$0, ewf $$1) {
      return this.u() ? ewf.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.u() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cK <= 0 && this.aF()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dJ() {
      return true;
   }

   @Override
   protected void b(float $$0, ewf $$1) {
      double $$2 = (double)this.fe();
      this.j(this.bM().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(buj.v) * (double)this.aO()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(avh.dy);
      this.a(dxg.u);
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
   protected avg v() {
      return avh.dx;
   }

   @Override
   protected avg o_() {
      return avh.dA;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.dC;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      if ($$1.a(avw.bp)) {
         this.a(avh.dH, 1.0F, 1.0F);
      } else {
         this.a(avh.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.ah);
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$0.fO() && !this.p_()) {
         this.b($$0);
         return bqg.a(this.dQ().B);
      } else {
         bqg $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cT().size() < 2 && !this.p_()) {
               this.f($$0);
            }

            return bqg.a(this.dQ().B);
         }
      }
   }

   @Override
   protected void G(float $$0) {
      if ($$0 > 6.0F && this.gw() && !this.gy() && this.go()) {
         this.gA();
      }
   }

   public boolean go() {
      return this.g(this.gw() ? btn.a : btn.k);
   }

   @Override
   protected boolean a(cmk $$0, cuc $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.ex() < this.eO();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gD() && this.g() == 0 && this.gp();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.p_();
         if ($$4) {
            this.dQ().a(lj.O, this.d(1.0), this.dy() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dQ().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aX()) {
               avg $$5 = this.gv();
               if ($$5 != null) {
                  this.dQ().a(null, this.dv(), this.dx(), this.dB(), $$5, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
               }
            }

            this.a(dxg.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gu() {
      return false;
   }

   @Override
   public boolean a(cer $$0) {
      if ($$0 != this && $$0 instanceof cgi $$1 && this.gV() && $$1.gV()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cgi b(aqm $$0, bsa $$1) {
      return bsm.o.a((dcf)$$0);
   }

   @Nullable
   @Override
   protected avg gv() {
      return avh.dB;
   }

   @Override
   protected void f(bqz $$0, float $$1) {
      this.gB();
      super.f($$0, $$1);
   }

   @Override
   protected ewf a(bsg $$0, bsj $$1, float $$2) {
      int $$3 = Math.max(this.cT().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dL() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cT().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cer) {
            $$5 += 0.2F;
         }
      }

      return new ewf(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dG() * (float) (Math.PI / 180.0));
   }

   @Override
   public float eb() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bsj $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gy();
      boolean $$9 = this.gw();
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

         float $$15 = ayg.a((float)this.gC() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)ayg.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)ayg.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ewf q(float $$0) {
      bsj $$1 = this.a(this.as());
      float $$2 = this.eb();
      return new ewf(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   protected boolean r(bsg $$0) {
      return this.cT().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   public boolean gw() {
      return this.ao.a(cf) < 0L;
   }

   public boolean gx() {
      return this.gC() < 0L != this.gw();
   }

   public boolean gy() {
      long $$0 = this.gC();
      return $$0 < (long)(this.gw() ? 40 : 52);
   }

   private boolean gZ() {
      return this.gw() && this.gC() < 40L && this.gC() >= 0L;
   }

   public void gz() {
      if (!this.gw()) {
         this.b(avh.dE);
         this.b(btn.k);
         this.a(dxg.u);
         this.a(-this.dQ().Z());
      }
   }

   public void gA() {
      if (this.gw()) {
         this.b(avh.dF);
         this.b(btn.a);
         this.a(dxg.u);
         this.a(this.dQ().Z());
      }
   }

   public void gB() {
      this.b(btn.a);
      this.a(dxg.u);
      this.b(this.dQ().Z());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.ao.a(cf, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gC() {
      return this.dQ().Z() - Math.abs(this.ao.a(cf));
   }

   @Override
   public avg Y_() {
      return avh.dD;
   }

   @Override
   public void a(ajp<?> $$0) {
      if (!this.an && ce.equals($$0)) {
         this.cK = this.cK == 0 ? 55 : this.cK;
      }

      super.a($$0);
   }

   @Override
   public boolean gD() {
      return true;
   }

   @Override
   public void b(cmk $$0) {
      if (!this.dQ().B) {
         $$0.a(this, this.cu);
      }
   }

   @Override
   protected byx E() {
      return new cgi.a(this);
   }

   class a extends byx {
      public a(final cgi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgi.this.u()) {
            super.a();
         }
      }
   }

   class b extends bzb {
      b() {
         super(cgi.this);
      }

      @Override
      public void a() {
         if (!cgi.this.cS()) {
            super.a();
         }
      }
   }

   class c extends bzc {
      public c() {
         super(cgi.this);
      }

      @Override
      public void a() {
         if (this.k == bzc.a.b && !cgi.this.ga() && cgi.this.gw() && !cgi.this.gy() && cgi.this.go()) {
            cgi.this.gA();
         }

         super.a();
      }
   }
}
