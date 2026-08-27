import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cfv extends cgi implements bsy, btd {
   public static final float ch = 0.45F;
   public static final int ci = 55;
   public static final int ck = 30;
   private static final float cH = 0.1F;
   private static final float cI = 1.4285F;
   private static final float cJ = 22.2222F;
   private static final int cK = 5;
   private static final int cL = 40;
   private static final int cM = 52;
   private static final int cN = 80;
   private static final float cO = 1.43F;
   public static final ajy<Boolean> cl = akc.a(cfv.class, aka.k);
   public static final ajy<Long> cm = akc.a(cfv.class, aka.c);
   public final brq cn = new brq();
   public final brq co = new brq();
   public final brq cp = new brq();
   public final brq cq = new brq();
   public final brq cr = new brq();
   private static final bry cQ = bry.b(bsb.q.k(), bsb.q.l() - 1.43F).b(0.845F);
   private int cR = 0;
   private int cS = 0;

   public cfv(bsb<? extends cfv> $$0, dca $$1) {
      super($$0, $$1);
      this.bY = new cfv.c();
      this.bX = new cfv.b();
      cby $$2 = (cby)this.J();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.as.a(cm));
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bsz.k);
      }

      this.a($$1);
   }

   public static btu.a r() {
      return gX().a(btv.q, 32.0).a(btv.r, 0.09F).a(btv.m, 0.42F).a(btv.v, 1.5);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cl, false);
      $$0.a(cm, 0L);
   }

   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      cfw.a(this, $$0.F_());
      this.b($$0.E().Z());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected btp.b<cfv> ea() {
      return cfw.a();
   }

   @Override
   protected void y() {
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return cfw.a(this.ea().a($$0));
   }

   @Override
   public bry e(bsz $$0) {
      return $$0 == bsz.k ? cQ.a(this.el()) : super.e($$0);
   }

   @Override
   protected void Y() {
      this.dU().ag().a("camelBrain");
      btp<?> $$0 = this.dZ();
      ((btp<cfv>)$$0).a((aqt)this.dU(), this);
      this.dU().ag().c();
      this.dU().ag().a("camelActivityUpdate");
      cfw.a(this);
      this.dU().ag().c();
      super.Y();
   }

   @Override
   public void l() {
      super.l();
      if (this.x() && this.cR < 50 && (this.aE() || this.bm() || this.bW())) {
         this.w(false);
      }

      if (this.cR > 0) {
         this.cR--;
         if (this.cR == 0) {
            this.dU().a(null, this.du(), avo.dE, avq.g, 1.0F, 1.0F);
         }
      }

      if (this.dU().x_()) {
         this.hi();
      }

      if (this.t()) {
         this.ab();
      }

      if (this.gG() && this.bi()) {
         this.gL();
      }
   }

   private void hi() {
      if (this.cS <= 0) {
         this.cS = this.al.a(40) + 80;
         this.cq.a(this.am);
      } else {
         this.cS--;
      }

      if (this.gH()) {
         this.cp.a();
         this.cr.a();
         if (this.hj()) {
            this.cn.b(this.am);
            this.co.a();
         } else {
            this.cn.a();
            this.co.b(this.am);
         }
      } else {
         this.cn.a();
         this.co.a();
         this.cr.a(this.x(), this.am);
         this.cp.a(this.gI() && this.gM() >= 0L, this.am);
      }
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.ar() == bsz.a && !this.cr.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.bf.a($$1, 0.2F);
   }

   @Override
   public void a(ewu $$0) {
      if (this.t() && this.aE()) {
         this.g(this.dx().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cly $$0, ewu $$1) {
      super.a($$0, $$1);
      if ($$0.bB > 0.0F && this.gG() && !this.gI()) {
         this.gK();
      }
   }

   public boolean t() {
      return this.gG() || this.gI();
   }

   @Override
   protected float e(cly $$0) {
      float $$1 = $$0.cg() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(btv.r) + $$1;
   }

   @Override
   protected ewt j(bso $$0) {
      return this.t() ? new ewt(this.dM(), this.dK()) : super.j($$0);
   }

   @Override
   protected ewu b(cly $$0, ewu $$1) {
      return this.t() ? ewu.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cR <= 0 && this.aE()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dN() {
      return true;
   }

   @Override
   protected void b(float $$0, ewu $$1) {
      double $$2 = (double)this.fq();
      this.h(this.bQ().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(btv.r) * (double)this.aQ()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cR = 55;
      this.w(true);
      this.az = true;
   }

   public boolean x() {
      return this.as.a(cl);
   }

   public void w(boolean $$0) {
      this.as.a(cl, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(avo.dD);
      this.a(dxv.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cR;
   }

   @Override
   protected avn u() {
      return avo.dC;
   }

   @Override
   protected avn n_() {
      return avo.dF;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.dH;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      if ($$1.a(awe.br)) {
         this.a(avo.dM, 1.0F, 1.0F);
      } else {
         this.a(avo.dL, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.ah);
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ($$0.ga() && !this.o_()) {
         this.b($$0);
         return bqa.a(this.dU().C);
      } else {
         bqa $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cX().size() < 2 && !this.o_()) {
               this.f($$0);
            }

            return bqa.a(this.dU().C);
         }
      }
   }

   @Override
   protected void F(float $$0) {
      if ($$0 > 6.0F && this.gG() && !this.gI() && this.gy()) {
         this.gK();
      }
   }

   public boolean gy() {
      return this.g(this.gG() ? bsz.a : bsz.k);
   }

   @Override
   protected boolean a(cly $$0, cuh $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.eI() < this.eZ();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gN() && this.g() == 0 && this.gz();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dU().a(lb.M, this.d(1.0), this.dC() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dU().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.ba()) {
               avn $$5 = this.gF();
               if ($$5 != null) {
                  this.dU().a(null, this.dz(), this.dB(), this.dF(), $$5, this.dj(), 1.0F, 1.0F + (this.al.i() - this.al.i()) * 0.2F);
               }
            }

            this.a(dxv.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gE() {
      return false;
   }

   @Override
   public boolean a(cee $$0) {
      if ($$0 != this && $$0 instanceof cfv $$1 && this.hf() && $$1.hf()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cfv b(aqt $$0, brp $$1) {
      return bsb.q.a((dca)$$0);
   }

   @Nullable
   @Override
   protected avn gF() {
      return avo.dG;
   }

   @Override
   protected void f(bqt $$0, float $$1) {
      this.gL();
      super.f($$0, $$1);
   }

   @Override
   protected ewu a(brv $$0, bry $$1, float $$2) {
      int $$3 = Math.max(this.cX().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dP() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cX().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cee) {
            $$5 += 0.2F;
         }
      }

      return new ewu(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dK() * (float) (Math.PI / 180.0));
   }

   @Override
   public float el() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bry $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gI();
      boolean $$9 = this.gG();
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

         float $$15 = aym.a((float)this.gM() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)aym.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)aym.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ewu p(float $$0) {
      bry $$1 = this.a(this.ar());
      float $$2 = this.el();
      return new ewu(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(brv $$0) {
      return this.cX().size() <= 2;
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   public boolean gG() {
      return this.as.a(cm) < 0L;
   }

   public boolean gH() {
      return this.gM() < 0L != this.gG();
   }

   public boolean gI() {
      long $$0 = this.gM();
      return $$0 < (long)(this.gG() ? 40 : 52);
   }

   private boolean hj() {
      return this.gG() && this.gM() < 40L && this.gM() >= 0L;
   }

   public void gJ() {
      if (!this.gG()) {
         this.b(avo.dJ);
         this.b(bsz.k);
         this.a(dxv.u);
         this.a(-this.dU().Z());
      }
   }

   public void gK() {
      if (this.gG()) {
         this.b(avo.dK);
         this.b(bsz.a);
         this.a(dxv.u);
         this.a(this.dU().Z());
      }
   }

   public void gL() {
      this.b(bsz.a);
      this.a(dxv.u);
      this.b(this.dU().Z());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.as.a(cm, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gM() {
      return this.dU().Z() - Math.abs(this.as.a(cm));
   }

   @Override
   public avn Z_() {
      return avo.dI;
   }

   @Override
   public void a(ajy<?> $$0) {
      if (!this.ar && cl.equals($$0)) {
         this.cR = this.cR == 0 ? 55 : this.cR;
      }

      super.a($$0);
   }

   @Override
   public boolean gN() {
      return true;
   }

   @Override
   public void b(cly $$0) {
      if (!this.dU().C) {
         $$0.a(this, this.cB);
      }
   }

   @Override
   protected byj E() {
      return new cfv.a(this);
   }

   class a extends byj {
      public a(cfv $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cfv.this.t()) {
            super.a();
         }
      }
   }

   class b extends byn {
      b() {
         super(cfv.this);
      }

      @Override
      public void a() {
         if (!cfv.this.cW()) {
            super.a();
         }
      }
   }

   class c extends byo {
      public c() {
         super(cfv.this);
      }

      @Override
      public void a() {
         if (this.k == byo.a.b && !cfv.this.gl() && cfv.this.gG() && !cfv.this.gI() && cfv.this.gy()) {
            cfv.this.gK();
         }

         super.a();
      }
   }
}
