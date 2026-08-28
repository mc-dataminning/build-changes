import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgv extends chi implements btz, bue {
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
   public static final akj<Boolean> cc = akn.a(cgv.class, akl.k);
   public static final akj<Long> cd = akn.a(cgv.class, akl.c);
   public final bso ce = new bso();
   public final bso cf = new bso();
   public final bso cg = new bso();
   public final bso ch = new bso();
   public final bso ci = new bso();
   private static final bsw cH = bsw.b(bsz.o.l(), bsz.o.m() - 1.43F).b(0.845F);
   private int cI = 0;
   private int cJ = 0;

   public cgv(bsz<? extends cgv> $$0, dbx $$1) {
      super($$0, $$1);
      this.bP = new cgv.c();
      this.bO = new cgv.b();
      ccz $$2 = (ccz)this.K();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.ao.a(cd));
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bua.k);
      }

      this.a($$1);
   }

   public static buv.a s() {
      return gP().a(buw.q, 32.0).a(buw.r, 0.09F).a(buw.m, 0.42F).a(buw.v, 1.5);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      cgw.a(this, $$0.E_());
      this.b($$0.E().Z());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected buq.b<cgv> dT() {
      return cgw.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cgw.a(this.dT().a($$0));
   }

   @Override
   public bsw e(bua $$0) {
      return $$0 == bua.k ? cH.a(this.ed()) : super.e($$0);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("camelBrain");
      buq<?> $$0 = this.dS();
      ((buq<cgv>)$$0).a((are)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("camelActivityUpdate");
      cgw.a(this);
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
            this.dP().a(null, this.dp(), avz.dz, awa.g, 1.0F, 1.0F);
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
      if (this.ar() == bua.a && !this.ci.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aU.a($$1, 0.2F);
   }

   @Override
   public void a(evq $$0) {
      if (this.u() && this.aE()) {
         this.h(this.ds().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cmw $$0, evq $$1) {
      super.a($$0, $$1);
      if ($$0.bq > 0.0F && this.gy() && !this.gA()) {
         this.gC();
      }
   }

   public boolean u() {
      return this.gy() || this.gA();
   }

   @Override
   protected float e(cmw $$0) {
      float $$1 = $$0.cb() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(buw.r) + $$1;
   }

   @Override
   protected evp j(bto $$0) {
      return this.u() ? new evp(this.dH(), this.dF()) : super.j($$0);
   }

   @Override
   protected evq b(cmw $$0, evq $$1) {
      return this.u() ? evq.b : super.b($$0, $$1);
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
   protected void b(float $$0, evq $$1) {
      double $$2 = (double)this.fh();
      this.i(this.bL().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(buw.r) * (double)this.aN()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(avz.dy);
      this.a(dwu.u);
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
   protected avy v() {
      return avz.dx;
   }

   @Override
   protected avy o_() {
      return avz.dA;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.dC;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      if ($$1.a(awo.bp)) {
         this.a(avz.dH, 1.0F, 1.0F);
      } else {
         this.a(avz.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.ah);
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$0.fR() && !this.p_()) {
         this.b($$0);
         return bqt.a(this.dP().B);
      } else {
         bqt $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cS().size() < 2 && !this.p_()) {
               this.f($$0);
            }

            return bqt.a(this.dP().B);
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
      return this.g(this.gy() ? bua.a : bua.k);
   }

   @Override
   protected boolean a(cmw $$0, cuo $$1) {
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
               avy $$5 = this.gx();
               if ($$5 != null) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), $$5, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
               }
            }

            this.a(dwu.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   public boolean a(cfe $$0) {
      if ($$0 != this && $$0 instanceof cgv $$1 && this.gX() && $$1.gX()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cgv b(are $$0, bsn $$1) {
      return bsz.o.a((dbx)$$0);
   }

   @Nullable
   @Override
   protected avy gx() {
      return avz.dB;
   }

   @Override
   protected void f(brm $$0, float $$1) {
      this.gD();
      super.f($$0, $$1);
   }

   @Override
   protected evq a(bst $$0, bsw $$1, float $$2) {
      int $$3 = Math.max(this.cS().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dK() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cS().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cfe) {
            $$5 += 0.2F;
         }
      }

      return new evq(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dF() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ed() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bsw $$2, float $$3) {
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

         float $$15 = ayy.a((float)this.gE() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)ayy.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)ayy.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public evq p(float $$0) {
      bsw $$1 = this.a(this.ar());
      float $$2 = this.ed();
      return new evq(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   protected boolean r(bst $$0) {
      return this.cS().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
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
         this.b(avz.dE);
         this.b(bua.k);
         this.a(dwu.u);
         this.a(-this.dP().Z());
      }
   }

   public void gC() {
      if (this.gy()) {
         this.b(avz.dF);
         this.b(bua.a);
         this.a(dwu.u);
         this.a(this.dP().Z());
      }
   }

   public void gD() {
      this.b(bua.a);
      this.a(dwu.u);
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
   public avy Y_() {
      return avz.dD;
   }

   @Override
   public void a(akj<?> $$0) {
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
   public void b(cmw $$0) {
      if (!this.dP().B) {
         $$0.a(this, this.cs);
      }
   }

   @Override
   protected bzk E() {
      return new cgv.a(this);
   }

   class a extends bzk {
      public a(final cgv $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgv.this.u()) {
            super.a();
         }
      }
   }

   class b extends bzo {
      b() {
         super(cgv.this);
      }

      @Override
      public void a() {
         if (!cgv.this.cR()) {
            super.a();
         }
      }
   }

   class c extends bzp {
      public c() {
         super(cgv.this);
      }

      @Override
      public void a() {
         if (this.k == bzp.a.b && !cgv.this.gd() && cgv.this.gy() && !cgv.this.gA() && cgv.this.gq()) {
            cgv.this.gC();
         }

         super.a();
      }
   }
}
