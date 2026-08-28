import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cka extends ckn {
   public static final float bE = 0.45F;
   public static final int bF = 55;
   public static final int bG = 30;
   private static final float cc = 0.1F;
   private static final float cd = 1.4285F;
   private static final float ce = 22.2222F;
   private static final int cf = 5;
   private static final int cg = 40;
   private static final int ch = 52;
   private static final int ci = 80;
   private static final float cj = 1.43F;
   public static final akg<Boolean> bI = akk.a(cka.class, aki.k);
   public static final akg<Long> bJ = akk.a(cka.class, aki.c);
   public final bvj bK = new bvj();
   public final bvj bL = new bvj();
   public final bvj bM = new bvj();
   public final bvj bN = new bvj();
   public final bvj bO = new bvj();
   private static final bvv ck = bvv.b(bwb.t.l(), bwb.t.m() - 1.43F).b(0.845F);
   private int cl = 0;
   private int co = 0;

   public cka(bwb<? extends cka> $$0, dhp $$1) {
      super($$0, $$1);
      this.by = new cka.c();
      this.bx = new cka.b();
      cga $$2 = (cga)this.O();
      $$2.a(true);
      $$2.d(true);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(bJ));
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bxd.k);
      }

      this.a($$1);
   }

   public static bxw.a q() {
      return gR().a(bxx.s, 32.0).a(bxx.v, 0.09F).a(bxx.o, 0.42F).a(bxx.B, 1.5);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bI, false);
      $$0.a(bJ, 0L);
   }

   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      ckb.a(this, $$0.C_());
      this.b($$0.a().ae());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bxr.b<cka> ec() {
      return ckb.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return ckb.a(this.ec().a($$0));
   }

   @Override
   public bvv e(bxd $$0) {
      return $$0 == bxd.k ? ck.a(this.ej()) : super.e($$0);
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("camelBrain");
      bxr<?> $$2 = this.eb();
      ((bxr<cka>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      ckb.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.x() && this.cl < 50 && (this.aJ() || this.bm() || this.bZ())) {
         this.w(false);
      }

      if (this.cl > 0) {
         this.cl--;
         if (this.cl == 0) {
            this.dV().a(null, this.dv(), awk.dB, awl.g, 1.0F, 1.0F);
         }
      }

      if (this.dV().w_()) {
         this.ha();
      }

      if (this.t()) {
         this.af();
      }

      if (this.gt() && this.bj()) {
         this.gF();
      }
   }

   private void ha() {
      if (this.co <= 0) {
         this.co = this.ae.a(40) + 80;
         this.bN.a(this.af);
      } else {
         this.co--;
      }

      if (this.gu()) {
         this.bM.a();
         this.bO.a();
         if (this.hb()) {
            this.bK.b(this.af);
            this.bL.a();
         } else {
            this.bK.a();
            this.bL.b(this.af);
         }
      } else {
         this.bK.a();
         this.bL.a();
         this.bO.a(this.x(), this.af);
         this.bM.a(this.gC() && this.gG() >= 0L, this.af);
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.aw() == bxd.a && !this.bO.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aS.a($$1, 0.2F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(fcu $$0) {
      if (this.t() && this.aJ()) {
         this.i(this.dy().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cqi $$0, fcu $$1) {
      super.a($$0, $$1);
      if ($$0.bh > 0.0F && this.gt() && !this.gC()) {
         this.gE();
      }
   }

   public boolean t() {
      return this.gt() || this.gC();
   }

   @Override
   protected float c(cqi $$0) {
      float $$1 = $$0.cj() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bxx.v) + $$1;
   }

   @Override
   protected fct j(bwr $$0) {
      return this.t() ? new fct(this.dN(), this.dL()) : super.j($$0);
   }

   @Override
   protected fcu b(cqi $$0, fcu $$1) {
      return this.t() ? fcu.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.ak() && this.cl <= 0 && this.aJ()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   @Override
   protected void b(float $$0, fcu $$1) {
      double $$2 = (double)this.fg();
      this.j(this.bT().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bxx.v) * (double)this.aT()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cl = 55;
      this.w(true);
      this.ar = true;
   }

   public boolean x() {
      return this.al.a(bI);
   }

   public void w(boolean $$0) {
      this.al.a(bI, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awk.dA);
      this.a(edm.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cl;
   }

   @Override
   protected awj u() {
      return awk.dz;
   }

   @Override
   protected awj l_() {
      return awk.dC;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.dE;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      if ($$1.a(awz.br)) {
         this.a(awk.dJ, 1.0F, 1.0F);
      } else {
         this.a(awk.dI, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.ak);
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ($$0.fX() && !this.n_()) {
         this.b($$0);
         return btq.a;
      } else {
         btq $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.k($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cY().size() < 2 && !this.n_()) {
               this.a($$0);
            }

            return btq.a;
         }
      }
   }

   @Override
   public boolean a(bvs $$0, float $$1) {
      if ($$1 > 6.0F && this.gt() && !this.gC() && this.gq()) {
         this.gE();
      }

      return true;
   }

   public boolean gq() {
      return this.g(this.gt() ? bxd.a : bxd.k);
   }

   @Override
   protected boolean a(cqi $$0, cxy $$1) {
      if (!this.k($$1)) {
         return false;
      } else {
         boolean $$2 = this.eF() < this.eT();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gH() && this.g() == 0 && this.gx();
         if ($$3) {
            this.e($$0);
         }

         boolean $$4 = this.n_();
         if ($$4) {
            this.dV().a(lv.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dV().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.bb()) {
               awj $$5 = this.gs();
               if ($$5 != null) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), $$5, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(edm.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   public boolean a(cig $$0) {
      if ($$0 != this && $$0 instanceof cka $$1 && this.gY() && $$1.gY()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cka b(arn $$0, bvi $$1) {
      return bwb.t.a($$0, bwa.e);
   }

   @Nullable
   @Override
   protected awj gs() {
      return awk.dD;
   }

   @Override
   protected void b(arn $$0, buh $$1, float $$2) {
      this.gF();
      super.b($$0, $$1, $$2);
   }

   @Override
   protected fcu a(bvs $$0, bvv $$1, float $$2) {
      int $$3 = Math.max(this.cY().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dQ() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cY().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cig) {
            $$5 += 0.2F;
         }
      }

      return new fcu(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ej() {
      return this.n_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bvv $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gC();
      boolean $$9 = this.gt();
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

         float $$15 = azk.a((float)this.gG() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azk.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azk.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public fcu t(float $$0) {
      bvv $$1 = this.a(this.aw());
      float $$2 = this.ej();
      return new fcu(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ad() {
      return 30;
   }

   @Override
   protected boolean r(bvs $$0) {
      return this.cY().size() <= 2;
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   public boolean gt() {
      return this.al.a(bJ) < 0L;
   }

   public boolean gu() {
      return this.gG() < 0L != this.gt();
   }

   public boolean gC() {
      long $$0 = this.gG();
      return $$0 < (long)(this.gt() ? 40 : 52);
   }

   private boolean hb() {
      return this.gt() && this.gG() < 40L && this.gG() >= 0L;
   }

   public void gD() {
      if (!this.gt()) {
         this.b(awk.dG);
         this.b(bxd.k);
         this.a(edm.u);
         this.a(-this.dV().ae());
      }
   }

   public void gE() {
      if (this.gt()) {
         this.b(awk.dH);
         this.b(bxd.a);
         this.a(edm.u);
         this.a(this.dV().ae());
      }
   }

   public void gF() {
      this.b(bxd.a);
      this.a(edm.u);
      this.b(this.dV().ae());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.al.a(bJ, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gG() {
      return this.dV().ae() - Math.abs(this.al.a(bJ));
   }

   @Override
   protected js<awj> a(bwc $$0, cxy $$1, dgc $$2) {
      return (js<awj>)($$0 == bwc.h ? awk.dF : super.a($$0, $$1, $$2));
   }

   @Override
   public void a(akg<?> $$0) {
      if (!this.ak && bI.equals($$0)) {
         this.cl = this.cl == 0 ? 55 : this.cl;
      }

      super.a($$0);
   }

   @Override
   public boolean gH() {
      return true;
   }

   @Override
   public void b(cqi $$0) {
      if (!this.dV().C) {
         $$0.a(this, this.bW);
      }
   }

   @Override
   protected ccl I() {
      return new cka.a(this);
   }

   class a extends ccl {
      public a(final cka $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cka.this.t()) {
            super.a();
         }
      }
   }

   class b extends ccp {
      b() {
         super(cka.this);
      }

      @Override
      public void a() {
         if (!cka.this.cX()) {
            super.a();
         }
      }
   }

   class c extends ccq {
      public c() {
         super(cka.this);
      }

      @Override
      public void a() {
         if (this.k == ccq.a.b && !cka.this.O_() && cka.this.gt() && !cka.this.gC() && cka.this.gq()) {
            cka.this.gE();
         }

         super.a();
      }
   }
}
