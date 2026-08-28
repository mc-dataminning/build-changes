import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgj extends cgw implements btn, bts {
   public static final float ca = 0.45F;
   public static final int cb = 55;
   public static final int cd = 30;
   private static final float cA = 0.1F;
   private static final float cC = 1.4285F;
   private static final float cD = 22.2222F;
   private static final int cE = 5;
   private static final int cF = 40;
   private static final int cG = 52;
   private static final int cH = 80;
   private static final float cI = 1.43F;
   public static final ajp<Boolean> ce = ajt.a(cgj.class, ajr.k);
   public static final ajp<Long> cf = ajt.a(cgj.class, ajr.c);
   public final bsc cg = new bsc();
   public final bsc ch = new bsc();
   public final bsc ci = new bsc();
   public final bsc cj = new bsc();
   public final bsc ck = new bsc();
   private static final bsk cJ = bsk.b(bsn.o.l(), bsn.o.m() - 1.43F).b(0.845F);
   private int cK = 0;
   private int cL = 0;

   public cgj(bsn<? extends cgj> $$0, dcg $$1) {
      super($$0, $$1);
      this.bR = new cgj.c();
      this.bQ = new cgj.b();
      ccn $$2 = (ccn)this.J();
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
         this.b(bto.k);
      }

      this.a($$1);
   }

   public static buj.a s() {
      return gM().a(buk.s, 32.0).a(buk.v, 0.09F).a(buk.o, 0.42F).a(buk.B, 1.5);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0L);
   }

   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      cgk.a(this, $$0.E_());
      this.b($$0.E().Z());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bue.b<cgj> dW() {
      return cgk.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return cgk.a(this.dW().a($$0));
   }

   @Override
   public bsk e(bto $$0) {
      return $$0 == bto.k ? cJ.a(this.ec()) : super.e($$0);
   }

   @Override
   protected void Z() {
      this.dR().ag().a("camelBrain");
      bue<?> $$0 = this.dV();
      ((bue<cgj>)$$0).a((aqm)this.dR(), this);
      this.dR().ag().c();
      this.dR().ag().a("camelActivityUpdate");
      cgk.a(this);
      this.dR().ag().c();
      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.x() && this.cK < 50 && (this.aG() || this.bk() || this.bT())) {
         this.w(false);
      }

      if (this.cK > 0) {
         this.cK--;
         if (this.cK == 0) {
            this.dR().a(null, this.dr(), avh.dz, avi.g, 1.0F, 1.0F);
         }
      }

      if (this.dR().x_()) {
         this.gX();
      }

      if (this.t()) {
         this.ac();
      }

      if (this.gv() && this.bg()) {
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
         this.ck.a(this.x(), this.ai);
         this.ci.a(this.gx() && this.gB() >= 0L, this.ai);
      }
   }

   @Override
   protected void y(float $$0) {
      float $$1;
      if (this.at() == bto.a && !this.ck.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aV.a($$1, 0.2F);
   }

   @Override
   public void a(ewh $$0) {
      if (this.t() && this.aG()) {
         this.j(this.du().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cml $$0, ewh $$1) {
      super.a($$0, $$1);
      if ($$0.br > 0.0F && this.gv() && !this.gx()) {
         this.gz();
      }
   }

   public boolean t() {
      return this.gv() || this.gx();
   }

   @Override
   protected float e(cml $$0) {
      float $$1 = $$0.cd() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(buk.v) + $$1;
   }

   @Override
   protected ewg j(btc $$0) {
      return this.t() ? new ewg(this.dJ(), this.dH()) : super.j($$0);
   }

   @Override
   protected ewh b(cml $$0, ewh $$1) {
      return this.t() ? ewh.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cK <= 0 && this.aG()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dK() {
      return true;
   }

   @Override
   protected void b(float $$0, ewh $$1) {
      double $$2 = (double)this.ff();
      this.k(this.bN().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(buk.v) * (double)this.aP()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cK = 55;
      this.w(true);
      this.av = true;
   }

   public boolean x() {
      return this.ao.a(ce);
   }

   public void w(boolean $$0) {
      this.ao.a(ce, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(avh.dy);
      this.a(dxh.u);
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
   protected avg n_() {
      return avh.dA;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.dC;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      if ($$1.a(avw.bp)) {
         this.a(avh.dH, 1.0F, 1.0F);
      } else {
         this.a(avh.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.ah);
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$0.fP() && !this.o_()) {
         this.b($$0);
         return bqh.a(this.dR().B);
      } else {
         bqh $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cU().size() < 2 && !this.o_()) {
               this.f($$0);
            }

            return bqh.a(this.dR().B);
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
      return this.g(this.gv() ? bto.a : bto.k);
   }

   @Override
   protected boolean a(cml $$0, cud $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.ey() < this.eP();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gC() && this.g() == 0 && this.go();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dR().a(lj.O, this.d(1.0), this.dz() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dR().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aY()) {
               avg $$5 = this.gu();
               if ($$5 != null) {
                  this.dR().a(null, this.dw(), this.dy(), this.dC(), $$5, this.dg(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
               }
            }

            this.a(dxh.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   public boolean a(ces $$0) {
      if ($$0 != this && $$0 instanceof cgj $$1 && this.gU() && $$1.gU()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cgj b(aqm $$0, bsb $$1) {
      return bsn.o.a((dcg)$$0);
   }

   @Nullable
   @Override
   protected avg gu() {
      return avh.dB;
   }

   @Override
   protected void f(bra $$0, float $$1) {
      this.gA();
      super.f($$0, $$1);
   }

   @Override
   protected ewh a(bsh $$0, bsk $$1, float $$2) {
      int $$3 = Math.max(this.cU().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dM() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cU().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof ces) {
            $$5 += 0.2F;
         }
      }

      return new ewh(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dH() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ec() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bsk $$2, float $$3) {
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

         float $$15 = ayg.a((float)this.gB() + $$1, 0.0F, (float)$$10);
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
   public ewh q(float $$0) {
      bsk $$1 = this.a(this.at());
      float $$2 = this.ec();
      return new ewh(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   protected boolean r(bsh $$0) {
      return this.cU().size() <= 2;
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
         this.b(avh.dE);
         this.b(bto.k);
         this.a(dxh.u);
         this.a(-this.dR().Z());
      }
   }

   public void gz() {
      if (this.gv()) {
         this.b(avh.dF);
         this.b(bto.a);
         this.a(dxh.u);
         this.a(this.dR().Z());
      }
   }

   public void gA() {
      this.b(bto.a);
      this.a(dxh.u);
      this.b(this.dR().Z());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.ao.a(cf, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gB() {
      return this.dR().Z() - Math.abs(this.ao.a(cf));
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
   public boolean gC() {
      return true;
   }

   @Override
   public void b(cml $$0) {
      if (!this.dR().B) {
         $$0.a(this, this.cu);
      }
   }

   @Override
   protected byy E() {
      return new cgj.a(this);
   }

   class a extends byy {
      public a(final cgj $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgj.this.t()) {
            super.a();
         }
      }
   }

   class b extends bzc {
      b() {
         super(cgj.this);
      }

      @Override
      public void a() {
         if (!cgj.this.cT()) {
            super.a();
         }
      }
   }

   class c extends bzd {
      public c() {
         super(cgj.this);
      }

      @Override
      public void a() {
         if (this.k == bzd.a.b && !cgj.this.fZ() && cgj.this.gv() && !cgj.this.gx() && cgj.this.gn()) {
            cgj.this.gz();
         }

         super.a();
      }
   }
}
