import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cfv extends cgi implements bsz, bte {
   public static final float bY = 0.45F;
   public static final int bZ = 55;
   public static final int cb = 30;
   private static final float cy = 0.1F;
   private static final float cA = 1.4285F;
   private static final float cB = 22.2222F;
   private static final int cC = 5;
   private static final int cD = 40;
   private static final int cE = 52;
   private static final int cF = 80;
   private static final float cG = 1.43F;
   public static final ajr<Boolean> cc = ajv.a(cfv.class, ajt.k);
   public static final ajr<Long> cd = ajv.a(cfv.class, ajt.c);
   public final brp ce = new brp();
   public final brp cf = new brp();
   public final brp cg = new brp();
   public final brp ch = new brp();
   public final brp ci = new brp();
   private static final brx cH = brx.b(bsa.o.l(), bsa.o.m() - 1.43F).b(0.845F);
   private int cI = 0;
   private int cJ = 0;

   public cfv(bsa<? extends cfv> $$0, dax $$1) {
      super($$0, $$1);
      this.bP = new cfv.c();
      this.bO = new cfv.b();
      cbz $$2 = (cbz)this.K();
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
         this.b(bta.k);
      }

      this.a($$1);
   }

   public static btv.a s() {
      return gO().a(btw.q, 32.0).a(btw.r, 0.09F).a(btw.m, 0.42F).a(btw.v, 1.5);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      cfw.a(this, $$0.E_());
      this.b($$0.E().Y());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected btq.b<cfv> dT() {
      return cfw.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return cfw.a(this.dT().a($$0));
   }

   @Override
   public brx e(bta $$0) {
      return $$0 == bta.k ? cH.a(this.ed()) : super.e($$0);
   }

   @Override
   protected void Y() {
      this.dP().af().a("camelBrain");
      btq<?> $$0 = this.dS();
      ((btq<cfv>)$$0).a((aqm)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("camelActivityUpdate");
      cfw.a(this);
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
            this.dP().a(null, this.dp(), avh.dz, avi.g, 1.0F, 1.0F);
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
      if (this.ar() == bta.a && !this.ci.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aV.a($$1, 0.2F);
   }

   @Override
   public void a(euk $$0) {
      if (this.u() && this.aE()) {
         this.g(this.ds().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(clw $$0, euk $$1) {
      super.a($$0, $$1);
      if ($$0.br > 0.0F && this.gx() && !this.gz()) {
         this.gB();
      }
   }

   public boolean u() {
      return this.gx() || this.gz();
   }

   @Override
   protected float e(clw $$0) {
      float $$1 = $$0.cb() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(btw.r) + $$1;
   }

   @Override
   protected euj j(bso $$0) {
      return this.u() ? new euj(this.dH(), this.dF()) : super.j($$0);
   }

   @Override
   protected euk b(clw $$0, euk $$1) {
      return this.u() ? euk.b : super.b($$0, $$1);
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
   protected void b(float $$0, euk $$1) {
      double $$2 = (double)this.fh();
      this.h(this.bL().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(btw.r) * (double)this.aN()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(avh.dy);
      this.a(dvu.u);
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
   protected avg v() {
      return avh.dx;
   }

   @Override
   protected avg o_() {
      return avh.dA;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.dC;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      if ($$1.a(avw.bp)) {
         this.a(avh.dH, 1.0F, 1.0F);
      } else {
         this.a(avh.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.ah);
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if ($$0.fR() && !this.p_()) {
         this.b($$0);
         return bpu.a(this.dP().B);
      } else {
         bpu $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cS().size() < 2 && !this.p_()) {
               this.f($$0);
            }

            return bpu.a(this.dP().B);
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
      return this.g(this.gx() ? bta.a : bta.k);
   }

   @Override
   protected boolean a(clw $$0, cto $$1) {
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
               avg $$5 = this.gw();
               if ($$5 != null) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), $$5, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
               }
            }

            this.a(dvu.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   public boolean a(cee $$0) {
      if ($$0 != this && $$0 instanceof cfv $$1 && this.gW() && $$1.gW()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cfv b(aqm $$0, bro $$1) {
      return bsa.o.a((dax)$$0);
   }

   @Nullable
   @Override
   protected avg gw() {
      return avh.dB;
   }

   @Override
   protected void f(bqn $$0, float $$1) {
      this.gC();
      super.f($$0, $$1);
   }

   @Override
   protected euk a(bru $$0, brx $$1, float $$2) {
      int $$3 = Math.max(this.cS().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dK() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cS().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cee) {
            $$5 += 0.2F;
         }
      }

      return new euk(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dF() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ed() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, brx $$2, float $$3) {
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

         float $$15 = ayd.a((float)this.gD() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)ayd.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)ayd.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public euk p(float $$0) {
      brx $$1 = this.a(this.ar());
      float $$2 = this.ed();
      return new euk(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(bru $$0) {
      return this.cS().size() <= 2;
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
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
         this.b(avh.dE);
         this.b(bta.k);
         this.a(dvu.u);
         this.a(-this.dP().Y());
      }
   }

   public void gB() {
      if (this.gx()) {
         this.b(avh.dF);
         this.b(bta.a);
         this.a(dvu.u);
         this.a(this.dP().Y());
      }
   }

   public void gC() {
      this.b(bta.a);
      this.a(dvu.u);
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
   public avg Y_() {
      return avh.dD;
   }

   @Override
   public void a(ajr<?> $$0) {
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
   public void b(clw $$0) {
      if (!this.dP().B) {
         $$0.a(this, this.cs);
      }
   }

   @Override
   protected byk E() {
      return new cfv.a(this);
   }

   class a extends byk {
      public a(cfv $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cfv.this.u()) {
            super.a();
         }
      }
   }

   class b extends byo {
      b() {
         super(cfv.this);
      }

      @Override
      public void a() {
         if (!cfv.this.cR()) {
            super.a();
         }
      }
   }

   class c extends byp {
      public c() {
         super(cfv.this);
      }

      @Override
      public void a() {
         if (this.k == byp.a.b && !cfv.this.gc() && cfv.this.gx() && !cfv.this.gz() && cfv.this.gp()) {
            cfv.this.gB();
         }

         super.a();
      }
   }
}
