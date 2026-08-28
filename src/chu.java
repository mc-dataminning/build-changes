import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chu extends cih {
   public static final float bY = 0.45F;
   public static final int bZ = 55;
   public static final int ca = 30;
   private static final float cA = 0.1F;
   private static final float cB = 1.4285F;
   private static final float cC = 22.2222F;
   private static final int cD = 5;
   private static final int cE = 40;
   private static final int cF = 52;
   private static final int cG = 80;
   private static final float cH = 1.43F;
   public static final akh<Boolean> cc = akl.a(chu.class, akj.k);
   public static final akh<Long> cd = akl.a(chu.class, akj.c);
   public final btl ce = new btl();
   public final btl cf = new btl();
   public final btl cg = new btl();
   public final btl ch = new btl();
   public final btl ci = new btl();
   private static final btu cI = btu.b(bty.o.l(), bty.o.m() - 1.43F).b(0.845F);
   private int cJ = 0;
   private int cK = 0;

   public chu(bty<? extends chu> $$0, dej $$1) {
      super($$0, $$1);
      this.bP = new chu.c();
      this.bO = new chu.b();
      cdx $$2 = (cdx)this.P();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.am.a(cd));
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(buz.k);
      }

      this.a($$1);
   }

   public static bvt.a q() {
      return gQ().a(bvu.s, 32.0).a(bvu.v, 0.09F).a(bvu.o, 0.42F).a(bvu.B, 1.5);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      chv.a(this, $$0.D_());
      this.b($$0.E().aa());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bvo.b<chu> dZ() {
      return chv.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return chv.a(this.dZ().a($$0));
   }

   @Override
   public btu e(buz $$0) {
      return $$0 == buz.k ? cI.a(this.ef()) : super.e($$0);
   }

   @Override
   protected void ac() {
      this.dS().ah().a("camelBrain");
      bvo<?> $$0 = this.dY();
      ((bvo<chu>)$$0).a((arj)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("camelActivityUpdate");
      chv.a(this);
      this.dS().ah().c();
      super.ac();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cJ < 50 && (this.aH() || this.bm() || this.bW())) {
         this.x(false);
      }

      if (this.cJ > 0) {
         this.cJ--;
         if (this.cJ == 0) {
            this.dS().a(null, this.ds(), awg.dA, awh.g, 1.0F, 1.0F);
         }
      }

      if (this.dS().x_()) {
         this.hb();
      }

      if (this.t()) {
         this.ag();
      }

      if (this.gr() && this.bi()) {
         this.gD();
      }
   }

   private void hb() {
      if (this.cK <= 0) {
         this.cK = this.af.a(40) + 80;
         this.ch.a(this.ag);
      } else {
         this.cK--;
      }

      if (this.gs()) {
         this.cg.a();
         this.ci.a();
         if (this.hc()) {
            this.ce.b(this.ag);
            this.cf.a();
         } else {
            this.ce.a();
            this.cf.b(this.ag);
         }
      } else {
         this.ce.a();
         this.cf.a();
         this.ci.a(this.y(), this.ag);
         this.cg.a(this.gA() && this.gE() >= 0L, this.ag);
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.av() == buz.a && !this.ci.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aP.a($$1, 0.2F, this.p_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(eyw $$0) {
      if (this.t() && this.aH()) {
         this.h(this.dv().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cnx $$0, eyw $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gr() && !this.gA()) {
         this.gC();
      }
   }

   public boolean t() {
      return this.gr() || this.gA();
   }

   @Override
   protected float e(cnx $$0) {
      float $$1 = $$0.cg() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bvu.v) + $$1;
   }

   @Override
   protected eyv j(bun $$0) {
      return this.t() ? new eyv(this.dK(), this.dI()) : super.j($$0);
   }

   @Override
   protected eyw b(cnx $$0, eyw $$1) {
      return this.t() ? eyw.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cJ <= 0 && this.aH()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dL() {
      return true;
   }

   @Override
   protected void b(float $$0, eyw $$1) {
      double $$2 = (double)this.fg();
      this.i(this.bQ().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bvu.v) * (double)this.aR()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cJ = 55;
      this.x(true);
      this.as = true;
   }

   public boolean y() {
      return this.am.a(cc);
   }

   public void x(boolean $$0) {
      this.am.a(cc, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awg.dz);
      this.a(dzp.u);
      this.x(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cJ;
   }

   @Override
   protected awf w() {
      return awg.dy;
   }

   @Override
   protected awf o_() {
      return awg.dB;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.dD;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      if ($$1.a(awv.bq)) {
         this.a(awg.dI, 1.0F, 1.0F);
      } else {
         this.a(awg.dH, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.ah);
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$0.fT() && !this.p_()) {
         this.b($$0);
         return brs.a;
      } else {
         brs $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.n($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cW().size() < 2 && !this.p_()) {
               this.a($$0);
            }

            return brs.a;
         }
      }
   }

   @Override
   public boolean a(btr $$0, float $$1) {
      if ($$1 > 6.0F && this.gr() && !this.gA() && this.go()) {
         this.gC();
      }

      return true;
   }

   public boolean go() {
      return this.g(this.gr() ? buz.a : buz.k);
   }

   @Override
   protected boolean a(cnx $$0, cvs $$1) {
      if (!this.n($$1)) {
         return false;
      } else {
         boolean $$2 = this.eB() < this.eQ();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gF() && this.g() == 0 && this.gv();
         if ($$3) {
            this.f($$0);
         }

         boolean $$4 = this.p_();
         if ($$4) {
            this.dS().a(lo.O, this.d(1.0), this.dA() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dS().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.ba()) {
               awf $$5 = this.gq();
               if ($$5 != null) {
                  this.dS().a(null, this.dx(), this.dz(), this.dD(), $$5, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
               }
            }

            this.a(dzp.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(cgd $$0) {
      if ($$0 != this && $$0 instanceof chu $$1 && this.gY() && $$1.gY()) {
         return true;
      }

      return false;
   }

   @Nullable
   public chu b(arj $$0, btk $$1) {
      return bty.o.a($$0, btx.e);
   }

   @Nullable
   @Override
   protected awf gq() {
      return awg.dC;
   }

   @Override
   protected void f(bsj $$0, float $$1) {
      this.gD();
      super.f($$0, $$1);
   }

   @Override
   protected eyw a(btr $$0, btu $$1, float $$2) {
      int $$3 = Math.max(this.cW().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dN() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cW().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cgd) {
            $$5 += 0.2F;
         }
      }

      return new eyw(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dI() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ef() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, btu $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gA();
      boolean $$9 = this.gr();
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

         float $$15 = azf.a((float)this.gE() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azf.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azf.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public eyw s(float $$0) {
      btu $$1 = this.a(this.av());
      float $$2 = this.ef();
      return new eyw(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ae() {
      return 30;
   }

   @Override
   protected boolean r(btr $$0) {
      return this.cW().size() <= 2;
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   public boolean gr() {
      return this.am.a(cd) < 0L;
   }

   public boolean gs() {
      return this.gE() < 0L != this.gr();
   }

   public boolean gA() {
      long $$0 = this.gE();
      return $$0 < (long)(this.gr() ? 40 : 52);
   }

   private boolean hc() {
      return this.gr() && this.gE() < 40L && this.gE() >= 0L;
   }

   public void gB() {
      if (!this.gr()) {
         this.b(awg.dF);
         this.b(buz.k);
         this.a(dzp.u);
         this.a(-this.dS().aa());
      }
   }

   public void gC() {
      if (this.gr()) {
         this.b(awg.dG);
         this.b(buz.a);
         this.a(dzp.u);
         this.a(this.dS().aa());
      }
   }

   public void gD() {
      this.b(buz.a);
      this.a(dzp.u);
      this.b(this.dS().aa());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.am.a(cd, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gE() {
      return this.dS().aa() - Math.abs(this.am.a(cd));
   }

   @Override
   public awf ac_() {
      return awg.dE;
   }

   @Override
   public void a(akh<?> $$0) {
      if (!this.al && cc.equals($$0)) {
         this.cJ = this.cJ == 0 ? 55 : this.cJ;
      }

      super.a($$0);
   }

   @Override
   public boolean gF() {
      return true;
   }

   @Override
   public void b(cnx $$0) {
      if (!this.dS().B) {
         $$0.a(this, this.ct);
      }
   }

   @Override
   protected cai J() {
      return new chu.a(this);
   }

   class a extends cai {
      public a(final chu $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!chu.this.t()) {
            super.a();
         }
      }
   }

   class b extends cam {
      b() {
         super(chu.this);
      }

      @Override
      public void a() {
         if (!chu.this.cV()) {
            super.a();
         }
      }
   }

   class c extends can {
      public c() {
         super(chu.this);
      }

      @Override
      public void a() {
         if (this.k == can.a.b && !chu.this.L_() && chu.this.gr() && !chu.this.gA() && chu.this.go()) {
            chu.this.gC();
         }

         super.a();
      }
   }
}
