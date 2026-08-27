import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzj extends bzw implements bmv, bna {
   public static final cpy bT = cpy.a(cna.eV);
   public static final float bU = 0.45F;
   public static final int bW = 55;
   public static final int bX = 30;
   private static final float cw = 0.1F;
   private static final float cx = 1.4285F;
   private static final float cy = 22.2222F;
   private static final int cz = 5;
   private static final int cA = 40;
   private static final int cB = 52;
   private static final int cC = 80;
   private static final float cD = 1.43F;
   public static final agm<Boolean> bY = agp.a(bzj.class, ago.k);
   public static final agm<Long> bZ = agp.a(bzj.class, ago.c);
   public final blq ca = new blq();
   public final blq cb = new blq();
   public final blq cc = new blq();
   public final blq cd = new blq();
   public final blq ce = new blq();
   private static final blv cE = blv.b(bly.m.k(), bly.m.l() - 1.43F);
   private int cF = 0;
   private int cG = 0;

   public bzj(bly<? extends bzj> $$0, cto $$1) {
      super($$0, $$1);
      this.t(1.5F);
      this.bL = new bzj.c();
      this.bK = new bzj.b();
      bvt $$2 = (bvt)this.N();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.an.b(bZ));
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bmw.k);
      }

      this.a($$1);
   }

   public static bnp.a u() {
      return gE().a(bnq.l, 32.0).a(bnq.m, 0.09F).a(bnq.h, 0.42F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bY, false);
      this.an.a(bZ, 0L);
   }

   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      bzk.a(this, $$0.F_());
      this.b($$0.E().X());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bnk.b<bzj> dP() {
      return bzk.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      return bzk.a(this.dP().a($$0));
   }

   @Override
   public blv a(bmw $$0) {
      return $$0 == bmw.k ? cE.a(this.dZ()) : super.a($$0);
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return $$1.b - 0.1F * this.dZ();
   }

   @Override
   protected void Z() {
      this.dM().af().a("camelBrain");
      bnk<?> $$0 = this.dO();
      ((bnk<bzj>)$$0).a((and)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("camelActivityUpdate");
      bzk.a(this);
      this.dM().af().c();
      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.A() && this.cF < 50 && (this.aC() || this.bd() || this.bO())) {
         this.w(false);
      }

      if (this.cF > 0) {
         this.cF--;
         if (this.cF == 0) {
            this.dM().a(null, this.dm(), arr.db, ars.g, 1.0F, 1.0F);
         }
      }

      if (this.dM().y_()) {
         this.gQ();
      }

      if (this.w()) {
         this.a(this, 30.0F);
      }

      if (this.gm() && this.aZ()) {
         this.gr();
      }
   }

   private void gQ() {
      if (this.cG <= 0) {
         this.cG = this.ag.a(40) + 80;
         this.cd.a(this.ah);
      } else {
         this.cG--;
      }

      if (this.gn()) {
         this.cc.a();
         this.ce.a();
         if (this.gR()) {
            this.ca.b(this.ah);
            this.cb.a();
         } else {
            this.ca.a();
            this.cb.b(this.ah);
         }
      } else {
         this.ca.a();
         this.cb.a();
         this.ce.a(this.A(), this.ah);
         this.cc.a(this.go() && this.gs() >= 0L, this.ah);
      }
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.ap() == bmw.a && !this.ce.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F);
   }

   @Override
   public void a(els $$0) {
      if (this.w() && this.aC()) {
         this.g(this.dp().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cfh $$0, els $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gm() && !this.go()) {
         this.gq();
      }
   }

   public boolean w() {
      return this.gm() || this.go();
   }

   @Override
   protected float e(cfh $$0) {
      float $$1 = $$0.bY() && this.ad_() == 0 ? 0.1F : 0.0F;
      return (float)this.b(bnq.m) + $$1;
   }

   @Override
   protected elr j(bmk $$0) {
      return this.w() ? new elr(this.dE(), this.dC()) : super.j($$0);
   }

   @Override
   protected els b(cfh $$0, els $$1) {
      return this.w() ? els.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.w() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cF <= 0 && this.aC()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dF() {
      return true;
   }

   @Override
   protected void b(float $$0, els $$1) {
      double $$2 = this.b(bnq.h) * (double)this.aK() + (double)this.fa();
      this.h(this.bF().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.b(bnq.m) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cF = 55;
      this.w(true);
      this.au = true;
   }

   public boolean A() {
      return this.an.b(bY);
   }

   public void w(boolean $$0) {
      this.an.b(bY, $$0);
   }

   @Override
   public void c(int $$0) {
      this.a(arr.da, 1.0F, this.eX());
      this.a(dnq.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int ad_() {
      return this.cF;
   }

   @Override
   protected arq y() {
      return arr.cZ;
   }

   @Override
   protected arq n_() {
      return arr.dc;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.de;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      if ($$1.a(asg.bo)) {
         this.a(arr.dj, 1.0F, 1.0F);
      } else {
         this.a(arr.di, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(cmx $$0) {
      return bT.a($$0);
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if ($$0.fI() && !this.o_()) {
         this.b($$0);
         return bka.a(this.dM().B);
      } else {
         bka $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.m($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cP().size() < 2 && !this.o_()) {
               this.f($$0);
            }

            return bka.a(this.dM().B);
         }
      }
   }

   @Override
   protected void D(float $$0) {
      if ($$0 > 6.0F && this.gm() && !this.go() && this.ge()) {
         this.gq();
      }
   }

   public boolean ge() {
      return this.f(this.gm() ? bmw.a : bmw.k);
   }

   @Override
   protected boolean a(cfh $$0, cmx $$1) {
      if (!this.m($$1)) {
         return false;
      } else {
         boolean $$2 = this.ev() < this.eM();
         if ($$2) {
            this.b(2.0F);
         }

         boolean $$3 = this.gt() && this.h() == 0 && this.gf();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dM().a(jx.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dM().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aU()) {
               arq $$5 = this.gl();
               if ($$5 != null) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), $$5, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.a(dnq.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gk() {
      return false;
   }

   @Override
   public boolean a(bxx $$0) {
      if ($$0 != this && $$0 instanceof bzj $$1 && this.gM() && $$1.gM()) {
         return true;
      }

      return false;
   }

   @Nullable
   public bzj b(and $$0, blp $$1) {
      return bly.m.a((cto)$$0);
   }

   @Nullable
   @Override
   protected arq gl() {
      return arr.dd;
   }

   @Override
   protected void f(bks $$0, float $$1) {
      this.gr();
      super.f($$0, $$1);
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      int $$3 = Math.max(this.cP().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dH() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cP().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof bxx) {
            $$5 += 0.2F;
         }
      }

      return new Vector3f(0.0F, $$6, $$5 * $$2);
   }

   @Override
   public float dZ() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, blv $$2, float $$3) {
      double $$4 = (double)($$2.b - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.go();
      boolean $$9 = this.gm();
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

         float $$15 = aun.a((float)this.gs() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)aun.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)aun.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public els p(float $$0) {
      blv $$1 = this.a(this.ap());
      float $$2 = this.dZ();
      return new els(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a * 0.56F));
   }

   private void a(blu $$0, float $$1) {
      float $$2 = $$0.cp();
      float $$3 = aun.g(this.aU - $$2);
      float $$4 = aun.a(aun.g(this.aU - $$2), -$$1, $$1);
      float $$5 = $$2 + $$3 - $$4;
      $$0.n($$5);
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   protected boolean r(blu $$0) {
      return this.cP().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   public boolean gm() {
      return this.an.b(bZ) < 0L;
   }

   public boolean gn() {
      return this.gs() < 0L != this.gm();
   }

   public boolean go() {
      long $$0 = this.gs();
      return $$0 < (long)(this.gm() ? 40 : 52);
   }

   private boolean gR() {
      return this.gm() && this.gs() < 40L && this.gs() >= 0L;
   }

   public void gp() {
      if (!this.gm()) {
         this.a(arr.dg, 1.0F, this.eX());
         this.b(bmw.k);
         this.a(dnq.u);
         this.a(-this.dM().X());
      }
   }

   public void gq() {
      if (this.gm()) {
         this.a(arr.dh, 1.0F, this.eX());
         this.b(bmw.a);
         this.a(dnq.u);
         this.a(this.dM().X());
      }
   }

   public void gr() {
      this.b(bmw.a);
      this.a(dnq.u);
      this.b(this.dM().X());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.an.b(bZ, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gs() {
      return this.dM().X() - Math.abs(this.an.b(bZ));
   }

   @Override
   public arq Z_() {
      return arr.df;
   }

   @Override
   public void a(agm<?> $$0) {
      if (!this.am && bY.equals($$0)) {
         this.cF = this.cF == 0 ? 55 : this.cF;
      }

      super.a($$0);
   }

   @Override
   public boolean gt() {
      return true;
   }

   @Override
   public void b(cfh $$0) {
      if (!this.dM().B) {
         $$0.a(this, this.cp);
      }
   }

   @Override
   protected bse H() {
      return new bzj.a(this);
   }

   class a extends bse {
      public a(bzj $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bzj.this.w()) {
            super.a();
         }
      }
   }

   class b extends bsi {
      b() {
         super(bzj.this);
      }

      @Override
      public void a() {
         if (!bzj.this.cO()) {
            super.a();
         }
      }
   }

   class c extends bsj {
      public c() {
         super(bzj.this);
      }

      @Override
      public void a() {
         if (this.k == bsj.a.b && !bzj.this.fS() && bzj.this.gm() && !bzj.this.go() && bzj.this.ge()) {
            bzj.this.gq();
         }

         super.a();
      }
   }
}
