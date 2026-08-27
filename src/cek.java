import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cek extends cex implements bro, brt {
   public static final cwd bY = cwd.a(csg.eW);
   public static final float bZ = 0.45F;
   public static final int cb = 55;
   public static final int cc = 30;
   private static final float cA = 0.1F;
   private static final float cB = 1.4285F;
   private static final float cC = 22.2222F;
   private static final int cD = 5;
   private static final int cE = 40;
   private static final int cF = 52;
   private static final int cG = 80;
   private static final float cH = 1.43F;
   public static final ajk<Boolean> cd = ajo.a(cek.class, ajm.k);
   public static final ajk<Long> ce = ajo.a(cek.class, ajm.c);
   public final bqg cf = new bqg();
   public final bqg cg = new bqg();
   public final bqg ch = new bqg();
   public final bqg ci = new bqg();
   public final bqg cj = new bqg();
   private static final bqo cI = bqo.b(bqr.o.k(), bqr.o.l() - 1.43F).b(0.845F);
   private int cJ = 0;
   private int cK = 0;

   public cek(bqr<? extends cek> $$0, czu $$1) {
      super($$0, $$1);
      this.bP = new cek.c();
      this.bO = new cek.b();
      cao $$2 = (cao)this.K();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.ao.a(ce));
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(brp.k);
      }

      this.a($$1);
   }

   public static bsk.a r() {
      return gO().a(bsl.q, 32.0).a(bsl.r, 0.09F).a(bsl.m, 0.42F).a(bsl.v, 1.5);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
      $$0.a(ce, 0L);
   }

   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      cel.a(this, $$0.E_());
      this.b($$0.E().Y());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bsf.b<cek> dR() {
      return cel.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return cel.a(this.dR().a($$0));
   }

   @Override
   public bqo e(brp $$0) {
      return $$0 == brp.k ? cI.a(this.eb()) : super.e($$0);
   }

   @Override
   protected void Y() {
      this.dN().af().a("camelBrain");
      bsf<?> $$0 = this.dQ();
      ((bsf<cek>)$$0).a((aqe)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("camelActivityUpdate");
      cel.a(this);
      this.dN().af().c();
      super.Y();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cJ < 50 && (this.aC() || this.bg() || this.bP())) {
         this.w(false);
      }

      if (this.cJ > 0) {
         this.cJ--;
         if (this.cJ == 0) {
            this.dN().a(null, this.dn(), auz.dz, ava.g, 1.0F, 1.0F);
         }
      }

      if (this.dN().x_()) {
         this.gZ();
      }

      if (this.u()) {
         this.ab();
      }

      if (this.gx() && this.bc()) {
         this.gC();
      }
   }

   private void gZ() {
      if (this.cK <= 0) {
         this.cK = this.ah.a(40) + 80;
         this.ci.a(this.ai);
      } else {
         this.cK--;
      }

      if (this.gy()) {
         this.ch.a();
         this.cj.a();
         if (this.ha()) {
            this.cf.b(this.ai);
            this.cg.a();
         } else {
            this.cf.a();
            this.cg.b(this.ai);
         }
      } else {
         this.cf.a();
         this.cg.a();
         this.cj.a(this.y(), this.ai);
         this.ch.a(this.gz() && this.gD() >= 0L, this.ai);
      }
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.ap() == brp.a && !this.cj.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aV.a($$1, 0.2F);
   }

   @Override
   public void a(etf $$0) {
      if (this.u() && this.aC()) {
         this.g(this.dq().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(ckl $$0, etf $$1) {
      super.a($$0, $$1);
      if ($$0.br > 0.0F && this.gx() && !this.gz()) {
         this.gB();
      }
   }

   public boolean u() {
      return this.gx() || this.gz();
   }

   @Override
   protected float e(ckl $$0) {
      float $$1 = $$0.bZ() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(bsl.r) + $$1;
   }

   @Override
   protected ete j(bre $$0) {
      return this.u() ? new ete(this.dF(), this.dD()) : super.j($$0);
   }

   @Override
   protected etf b(ckl $$0, etf $$1) {
      return this.u() ? etf.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.u() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cJ <= 0 && this.aC()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dG() {
      return true;
   }

   @Override
   protected void b(float $$0, etf $$1) {
      double $$2 = (double)this.ff();
      this.h(this.bJ().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(bsl.r) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cJ = 55;
      this.w(true);
      this.av = true;
   }

   public boolean y() {
      return this.ao.a(cd);
   }

   public void w(boolean $$0) {
      this.ao.a(cd, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(auz.dy);
      this.a(dur.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cJ;
   }

   @Override
   protected auy v() {
      return auz.dx;
   }

   @Override
   protected auy o_() {
      return auz.dA;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.dC;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      if ($$1.a(avo.bp)) {
         this.a(auz.dH, 1.0F, 1.0F);
      } else {
         this.a(auz.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(csd $$0) {
      return bY.a($$0);
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ($$0.fP() && !this.p_()) {
         this.b($$0);
         return boq.a(this.dN().B);
      } else {
         boq $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cQ().size() < 2 && !this.p_()) {
               this.f($$0);
            }

            return boq.a(this.dN().B);
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
      return this.g(this.gx() ? brp.a : brp.k);
   }

   @Override
   protected boolean a(ckl $$0, csd $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.ey() < this.eP();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gE() && this.g() == 0 && this.gq();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.p_();
         if ($$4) {
            this.dN().a(kw.M, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dN().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aU()) {
               auy $$5 = this.gw();
               if ($$5 != null) {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), $$5, this.dc(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
               }
            }

            this.a(dur.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   public boolean a(cct $$0) {
      if ($$0 != this && $$0 instanceof cek $$1 && this.gW() && $$1.gW()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cek b(aqe $$0, bqf $$1) {
      return bqr.o.a((czu)$$0);
   }

   @Nullable
   @Override
   protected auy gw() {
      return auz.dB;
   }

   @Override
   protected void f(bpj $$0, float $$1) {
      this.gC();
      super.f($$0, $$1);
   }

   @Override
   protected etf a(bql $$0, bqo $$1, float $$2) {
      int $$3 = Math.max(this.cQ().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dI() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cQ().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cct) {
            $$5 += 0.2F;
         }
      }

      return new etf(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dD() * (float) (Math.PI / 180.0));
   }

   @Override
   public float eb() {
      return this.p_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bqo $$2, float $$3) {
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

         float $$15 = axw.a((float)this.gD() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)axw.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)axw.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public etf p(float $$0) {
      bqo $$1 = this.a(this.ap());
      float $$2 = this.eb();
      return new etf(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(bql $$0) {
      return this.cQ().size() <= 2;
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }

   public boolean gx() {
      return this.ao.a(ce) < 0L;
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
         this.b(auz.dE);
         this.b(brp.k);
         this.a(dur.u);
         this.a(-this.dN().Y());
      }
   }

   public void gB() {
      if (this.gx()) {
         this.b(auz.dF);
         this.b(brp.a);
         this.a(dur.u);
         this.a(this.dN().Y());
      }
   }

   public void gC() {
      this.b(brp.a);
      this.a(dur.u);
      this.b(this.dN().Y());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.ao.a(ce, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gD() {
      return this.dN().Y() - Math.abs(this.ao.a(ce));
   }

   @Override
   public auy Y_() {
      return auz.dD;
   }

   @Override
   public void a(ajk<?> $$0) {
      if (!this.an && cd.equals($$0)) {
         this.cJ = this.cJ == 0 ? 55 : this.cJ;
      }

      super.a($$0);
   }

   @Override
   public boolean gE() {
      return true;
   }

   @Override
   public void b(ckl $$0) {
      if (!this.dN().B) {
         $$0.a(this, this.ct);
      }
   }

   @Override
   protected bwz E() {
      return new cek.a(this);
   }

   class a extends bwz {
      public a(cek $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cek.this.u()) {
            super.a();
         }
      }
   }

   class b extends bxd {
      b() {
         super(cek.this);
      }

      @Override
      public void a() {
         if (!cek.this.cP()) {
            super.a();
         }
      }
   }

   class c extends bxe {
      public c() {
         super(cek.this);
      }

      @Override
      public void a() {
         if (this.k == bxe.a.b && !cek.this.gc() && cek.this.gx() && !cek.this.gz() && cek.this.gp()) {
            cek.this.gB();
         }

         super.a();
      }
   }
}
