import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chm extends chz {
   public static final float bZ = 0.45F;
   public static final int ca = 55;
   public static final int cb = 30;
   private static final float cB = 0.1F;
   private static final float cC = 1.4285F;
   private static final float cD = 22.2222F;
   private static final int cE = 5;
   private static final int cF = 40;
   private static final int cG = 52;
   private static final int cH = 80;
   private static final float cI = 1.43F;
   public static final akg<Boolean> cd = akk.a(chm.class, aki.k);
   public static final akg<Long> ce = akk.a(chm.class, aki.c);
   public final btd cf = new btd();
   public final btd cg = new btd();
   public final btd ch = new btd();
   public final btd ci = new btd();
   public final btd cj = new btd();
   private static final btm cJ = btm.b(btq.o.l(), btq.o.m() - 1.43F).b(0.845F);
   private int cK = 0;
   private int cL = 0;

   public chm(btq<? extends chm> $$0, dds $$1) {
      super($$0, $$1);
      this.bQ = new chm.c();
      this.bP = new chm.b();
      cdp $$2 = (cdp)this.P();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.am.a(ce));
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bur.k);
      }

      this.a($$1);
   }

   public static bvl.a q() {
      return gQ().a(bvm.s, 32.0).a(bvm.v, 0.09F).a(bvm.o, 0.42F).a(bvm.B, 1.5);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
      $$0.a(ce, 0L);
   }

   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      chn.a(this, $$0.C_());
      this.b($$0.E().aa());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bvg.b<chm> dY() {
      return chn.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return chn.a(this.dY().a($$0));
   }

   @Override
   public btm e(bur $$0) {
      return $$0 == bur.k ? cJ.a(this.ee()) : super.e($$0);
   }

   @Override
   protected void ad() {
      this.dS().ah().a("camelBrain");
      bvg<?> $$0 = this.dX();
      ((bvg<chm>)$$0).a((arg)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("camelActivityUpdate");
      chn.a(this);
      this.dS().ah().c();
      super.ad();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cK < 50 && (this.aH() || this.bm() || this.bW())) {
         this.x(false);
      }

      if (this.cK > 0) {
         this.cK--;
         if (this.cK == 0) {
            this.dS().a(null, this.ds(), awd.dA, awe.g, 1.0F, 1.0F);
         }
      }

      if (this.dS().w_()) {
         this.hb();
      }

      if (this.t()) {
         this.ah();
      }

      if (this.gr() && this.bi()) {
         this.gD();
      }
   }

   private void hb() {
      if (this.cL <= 0) {
         this.cL = this.af.a(40) + 80;
         this.ci.a(this.ag);
      } else {
         this.cL--;
      }

      if (this.gs()) {
         this.ch.a();
         this.cj.a();
         if (this.hc()) {
            this.cf.b(this.ag);
            this.cg.a();
         } else {
            this.cf.a();
            this.cg.b(this.ag);
         }
      } else {
         this.cf.a();
         this.cg.a();
         this.cj.a(this.y(), this.ag);
         this.ch.a(this.gA() && this.gE() >= 0L, this.ag);
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.av() == bur.a && !this.cj.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F, this.o_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(eye $$0) {
      if (this.t() && this.aH()) {
         this.h(this.dv().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cnp $$0, eye $$1) {
      super.a($$0, $$1);
      if ($$0.bn > 0.0F && this.gr() && !this.gA()) {
         this.gC();
      }
   }

   public boolean t() {
      return this.gr() || this.gA();
   }

   @Override
   protected float e(cnp $$0) {
      float $$1 = $$0.cg() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bvm.v) + $$1;
   }

   @Override
   protected eyd j(buf $$0) {
      return this.t() ? new eyd(this.dK(), this.dI()) : super.j($$0);
   }

   @Override
   protected eye b(cnp $$0, eye $$1) {
      return this.t() ? eye.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cK <= 0 && this.aH()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dL() {
      return true;
   }

   @Override
   protected void b(float $$0, eye $$1) {
      double $$2 = (double)this.fg();
      this.i(this.bQ().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bvm.v) * (double)this.aR()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cK = 55;
      this.x(true);
      this.as = true;
   }

   public boolean y() {
      return this.am.a(cd);
   }

   public void x(boolean $$0) {
      this.am.a(cd, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awd.dz);
      this.a(dyx.u);
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
   protected awc w() {
      return awd.dy;
   }

   @Override
   protected awc n_() {
      return awd.dB;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.dD;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      if ($$1.a(aws.bq)) {
         this.a(awd.dI, 1.0F, 1.0F);
      } else {
         this.a(awd.dH, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.ah);
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ($$0.fR() && !this.o_()) {
         this.b($$0);
         return brk.a;
      } else {
         brk $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.p($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cW().size() < 2 && !this.o_()) {
               this.a($$0);
            }

            return brk.a;
         }
      }
   }

   @Override
   public boolean a(btj $$0, float $$1) {
      if ($$1 > 6.0F && this.gr() && !this.gA() && this.go()) {
         this.gC();
      }

      return true;
   }

   public boolean go() {
      return this.g(this.gr() ? bur.a : bur.k);
   }

   @Override
   protected boolean a(cnp $$0, cvl $$1) {
      if (!this.p($$1)) {
         return false;
      } else {
         boolean $$2 = this.eA() < this.eQ();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gF() && this.g() == 0 && this.gv();
         if ($$3) {
            this.f($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dS().a(ln.O, this.d(1.0), this.dA() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dS().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.ba()) {
               awc $$5 = this.gq();
               if ($$5 != null) {
                  this.dS().a(null, this.dx(), this.dz(), this.dD(), $$5, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
               }
            }

            this.a(dyx.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(cfv $$0) {
      if ($$0 != this && $$0 instanceof chm $$1 && this.gY() && $$1.gY()) {
         return true;
      }

      return false;
   }

   @Nullable
   public chm b(arg $$0, btc $$1) {
      return btq.o.a($$0, btp.e);
   }

   @Nullable
   @Override
   protected awc gq() {
      return awd.dC;
   }

   @Override
   protected void f(bsb $$0, float $$1) {
      this.gD();
      super.f($$0, $$1);
   }

   @Override
   protected eye a(btj $$0, btm $$1, float $$2) {
      int $$3 = Math.max(this.cW().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dN() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cW().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cfv) {
            $$5 += 0.2F;
         }
      }

      return new eye(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dI() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ee() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, btm $$2, float $$3) {
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

         float $$15 = azc.a((float)this.gE() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azc.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azc.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public eye s(float $$0) {
      btm $$1 = this.a(this.av());
      float $$2 = this.ee();
      return new eye(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ag() {
      return 30;
   }

   @Override
   protected boolean r(btj $$0) {
      return this.cW().size() <= 2;
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   public boolean gr() {
      return this.am.a(ce) < 0L;
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
         this.b(awd.dF);
         this.b(bur.k);
         this.a(dyx.u);
         this.a(-this.dS().aa());
      }
   }

   public void gC() {
      if (this.gr()) {
         this.b(awd.dG);
         this.b(bur.a);
         this.a(dyx.u);
         this.a(this.dS().aa());
      }
   }

   public void gD() {
      this.b(bur.a);
      this.a(dyx.u);
      this.b(this.dS().aa());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.am.a(ce, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gE() {
      return this.dS().aa() - Math.abs(this.am.a(ce));
   }

   @Override
   public awc ab_() {
      return awd.dE;
   }

   @Override
   public void a(akg<?> $$0) {
      if (!this.al && cd.equals($$0)) {
         this.cK = this.cK == 0 ? 55 : this.cK;
      }

      super.a($$0);
   }

   @Override
   public boolean gF() {
      return true;
   }

   @Override
   public void b(cnp $$0) {
      if (!this.dS().B) {
         $$0.a(this, this.cu);
      }
   }

   @Override
   protected caa J() {
      return new chm.a(this);
   }

   class a extends caa {
      public a(final chm $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!chm.this.t()) {
            super.a();
         }
      }
   }

   class b extends cae {
      b() {
         super(chm.this);
      }

      @Override
      public void a() {
         if (!chm.this.cV()) {
            super.a();
         }
      }
   }

   class c extends caf {
      public c() {
         super(chm.this);
      }

      @Override
      public void a() {
         if (this.k == caf.a.b && !chm.this.K_() && chm.this.gr() && !chm.this.gA() && chm.this.go()) {
            chm.this.gC();
         }

         super.a();
      }
   }
}
