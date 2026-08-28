import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cio extends cjb {
   public static final float bY = 0.45F;
   public static final int bZ = 55;
   public static final int ca = 30;
   private static final float cz = 0.1F;
   private static final float cC = 1.4285F;
   private static final float cD = 22.2222F;
   private static final int cE = 5;
   private static final int cF = 40;
   private static final int cG = 52;
   private static final int cH = 80;
   private static final float cI = 1.43F;
   public static final ajx<Boolean> cc = akb.a(cio.class, ajz.k);
   public static final ajx<Long> cd = akb.a(cio.class, ajz.c);
   public final buc ce = new buc();
   public final buc cf = new buc();
   public final buc cg = new buc();
   public final buc ch = new buc();
   public final buc ci = new buc();
   private static final bun cJ = bun.b(bur.t.l(), bur.t.m() - 1.43F).b(0.845F);
   private int cK = 0;
   private int cL = 0;

   public cio(bur<? extends cio> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new cio.c();
      this.bO = new cio.b();
      cer $$2 = (cer)this.L();
      $$2.a(true);
      $$2.d(true);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(cd));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bvs.k);
      }

      this.a($$1);
   }

   public static bwn.a p() {
      return gR().a(bwo.s, 32.0).a(bwo.v, 0.09F).a(bwo.o, 0.42F).a(bwo.B, 1.5);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      cip.a(this, $$0.H_());
      this.b($$0.a().ad());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bwi.b<cio> ed() {
      return cip.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return cip.a(this.ed().a($$0));
   }

   @Override
   public bun e(bvs $$0) {
      return $$0 == bvs.k ? cJ.a(this.ej()) : super.e($$0);
   }

   @Override
   protected void a(arc $$0) {
      bos $$1 = bor.a();
      $$1.a("camelBrain");
      bwi<?> $$2 = this.ec();
      ((bwi<cio>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      cip.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.x() && this.cK < 50 && (this.aJ() || this.bn() || this.bZ())) {
         this.x(false);
      }

      if (this.cK > 0) {
         this.cK--;
         if (this.cK == 0) {
            this.dW().a(null, this.dw(), awa.dB, awb.g, 1.0F, 1.0F);
         }
      }

      if (this.dW().B_()) {
         this.hb();
      }

      if (this.t()) {
         this.ac();
      }

      if (this.gs() && this.bj()) {
         this.gE();
      }
   }

   private void hb() {
      if (this.cL <= 0) {
         this.cL = this.ae.a(40) + 80;
         this.ch.a(this.af);
      } else {
         this.cL--;
      }

      if (this.gt()) {
         this.cg.a();
         this.ci.a();
         if (this.hc()) {
            this.ce.b(this.af);
            this.cf.a();
         } else {
            this.ce.a();
            this.cf.b(this.af);
         }
      } else {
         this.ce.a();
         this.cf.a();
         this.ci.a(this.x(), this.af);
         this.cg.a(this.gB() && this.gF() >= 0L, this.af);
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.aw() == bvs.a && !this.ci.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.e_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(fba $$0) {
      if (this.t() && this.aJ()) {
         this.h(this.dz().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cox $$0, fba $$1) {
      super.a($$0, $$1);
      if ($$0.bp > 0.0F && this.gs() && !this.gB()) {
         this.gD();
      }
   }

   public boolean t() {
      return this.gs() || this.gB();
   }

   @Override
   protected float e(cox $$0) {
      float $$1 = $$0.cj() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bwo.v) + $$1;
   }

   @Override
   protected faz j(bvg $$0) {
      return this.t() ? new faz(this.dO(), this.dM()) : super.j($$0);
   }

   @Override
   protected fba b(cox $$0, fba $$1) {
      return this.t() ? fba.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.j() && this.cK <= 0 && this.aJ()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dP() {
      return true;
   }

   @Override
   protected void b(float $$0, fba $$1) {
      double $$2 = (double)this.fj();
      this.i(this.bT().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bwo.v) * (double)this.aT()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cK = 55;
      this.x(true);
      this.ar = true;
   }

   public boolean x() {
      return this.al.a(cc);
   }

   public void x(boolean $$0) {
      this.al.a(cc, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awa.dA);
      this.a(ebt.u);
      this.x(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cK;
   }

   @Override
   protected avz u() {
      return awa.dz;
   }

   @Override
   protected avz o_() {
      return awa.dC;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.dE;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      if ($$1.a(awp.br)) {
         this.a(awa.dJ, 1.0F, 1.0F);
      } else {
         this.a(awa.dI, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.ak);
   }

   @Override
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if ($$0.fY() && !this.e_()) {
         this.b($$0);
         return bsj.a;
      } else {
         bsj $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.j($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cZ().size() < 2 && !this.e_()) {
               this.a($$0);
            }

            return bsj.a;
         }
      }
   }

   @Override
   public boolean a(buk $$0, float $$1) {
      if ($$1 > 6.0F && this.gs() && !this.gB() && this.gp()) {
         this.gD();
      }

      return true;
   }

   public boolean gp() {
      return this.g(this.gs() ? bvs.a : bvs.k);
   }

   @Override
   protected boolean a(cox $$0, cwp $$1) {
      if (!this.j($$1)) {
         return false;
      } else {
         boolean $$2 = this.eE() < this.eS();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gG() && this.Y_() == 0 && this.gw();
         if ($$3) {
            this.f($$0);
         }

         boolean $$4 = this.e_();
         if ($$4) {
            this.dW().a(lt.P, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dW().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.bb()) {
               avz $$5 = this.gr();
               if ($$5 != null) {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), $$5, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(ebt.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   public boolean a(cgx $$0) {
      if ($$0 != this && $$0 instanceof cio $$1 && this.gY() && $$1.gY()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cio b(arc $$0, bub $$1) {
      return bur.t.a($$0, buq.e);
   }

   @Nullable
   @Override
   protected avz gr() {
      return awa.dD;
   }

   @Override
   protected void b(arc $$0, bta $$1, float $$2) {
      this.gE();
      super.b($$0, $$1, $$2);
   }

   @Override
   protected fba a(buk $$0, bun $$1, float $$2) {
      int $$3 = Math.max(this.cZ().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dR() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cZ().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cgx) {
            $$5 += 0.2F;
         }
      }

      return new fba(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dM() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ej() {
      return this.e_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bun $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gB();
      boolean $$9 = this.gs();
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

         float $$15 = ayz.a((float)this.gF() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)ayz.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)ayz.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public fba s(float $$0) {
      bun $$1 = this.a(this.aw());
      float $$2 = this.ej();
      return new fba(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   protected boolean r(buk $$0) {
      return this.cZ().size() <= 2;
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   public boolean gs() {
      return this.al.a(cd) < 0L;
   }

   public boolean gt() {
      return this.gF() < 0L != this.gs();
   }

   public boolean gB() {
      long $$0 = this.gF();
      return $$0 < (long)(this.gs() ? 40 : 52);
   }

   private boolean hc() {
      return this.gs() && this.gF() < 40L && this.gF() >= 0L;
   }

   public void gC() {
      if (!this.gs()) {
         this.b(awa.dG);
         this.b(bvs.k);
         this.a(ebt.u);
         this.a(-this.dW().ad());
      }
   }

   public void gD() {
      if (this.gs()) {
         this.b(awa.dH);
         this.b(bvs.a);
         this.a(ebt.u);
         this.a(this.dW().ad());
      }
   }

   public void gE() {
      this.b(bvs.a);
      this.a(ebt.u);
      this.b(this.dW().ad());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.al.a(cd, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gF() {
      return this.dW().ad() - Math.abs(this.al.a(cd));
   }

   @Override
   public avz ab_() {
      return awa.dF;
   }

   @Override
   public void a(ajx<?> $$0) {
      if (!this.ak && cc.equals($$0)) {
         this.cK = this.cK == 0 ? 55 : this.cK;
      }

      super.a($$0);
   }

   @Override
   public boolean gG() {
      return true;
   }

   @Override
   public void b(cox $$0) {
      if (!this.dW().C) {
         $$0.a(this, this.ct);
      }
   }

   @Override
   protected cbc G() {
      return new cio.a(this);
   }

   class a extends cbc {
      public a(final cio $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cio.this.t()) {
            super.a();
         }
      }
   }

   class b extends cbg {
      b() {
         super(cio.this);
      }

      @Override
      public void a() {
         if (!cio.this.cY()) {
            super.a();
         }
      }
   }

   class c extends cbh {
      public c() {
         super(cio.this);
      }

      @Override
      public void a() {
         if (this.k == cbh.a.b && !cio.this.P_() && cio.this.gs() && !cio.this.gB() && cio.this.gp()) {
            cio.this.gD();
         }

         super.a();
      }
   }
}
