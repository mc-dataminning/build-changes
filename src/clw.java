import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class clw extends cla {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public bti b = new bti();
   public bti c = new bti();
   public bti d = new bti();
   public bti e = new bti();
   public bti bY = new bti();
   public bti bZ = new bti();
   private int cj = 0;
   private int ck = 0;
   private static final cop cl = ($$0, $$1, $$2) -> {
      $$1.dS().a(null, $$1, awe.cF, $$1.di(), 1.0F, 1.0F);
      cop.b.deflect($$0, $$1, $$2);
   };

   public static bvq.a q() {
      return bum.E().a(bvr.v, 0.63F).a(bvr.s, 30.0).a(bvr.m, 24.0).a(bvr.c, 3.0);
   }

   public clw(btv<? extends cla> $$0, deg $$1) {
      super($$0, $$1);
      this.a(erg.z, -1.0F);
      this.a(erg.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return clx.a(this, this.dY().a($$0));
   }

   @Override
   public bvl<clw> dX() {
      return (bvl<clw>)super.dX();
   }

   @Override
   protected bvl.b<clw> dY() {
      return bvl.a(clx.f, clx.e);
   }

   @Override
   public void a(akg<?> $$0) {
      if (this.dS().w_() && ar.equals($$0)) {
         this.gs();
         buw $$1 = this.av();
         switch ($$1) {
            case q:
               this.bY.b(this.ag);
               break;
            case r:
               this.bZ.b(this.ag);
               break;
            case p:
               this.c.b(this.ag);
         }
      }

      super.a($$0);
   }

   private void gs() {
      this.bY.a();
      this.b.a();
      this.bZ.a();
      this.e.a();
   }

   @Override
   public void l() {
      buw $$0 = this.av();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.t().b(1 + this.dV().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.e.b(this.ag);
            this.y();
      }

      if ($$0 != buw.p && this.c.b()) {
         this.d.a(this.ag);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.af.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gp();
      }

      super.l();
   }

   public clw t() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         duo $$0 = !this.dt().l() ? this.dt() : this.bt();
         eys $$1 = this.dv();
         eys $$2 = this.dq().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dS().a(new lf(ln.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bW()) {
         eys $$1 = this.cO().f();
         eys $$2 = new eys($$1.d, this.dq().e, $$1.f);
         duo $$3 = !this.dt().l() ? this.dt() : this.bt();
         if ($$3.o() != dnq.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dS().a(new lf(ln.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void U() {
      if (this.m() == null || !this.aH()) {
         this.dS().a(this, this.w(), this.di(), 1.0F, 1.0F);
      }
   }

   public void gp() {
      float $$0 = 0.7F + 0.4F * this.af.i();
      float $$1 = 0.8F + 0.2F * this.af.i();
      this.dS().a(this, awe.cP, this.di(), $$1, $$0);
   }

   @Override
   public cop a(coo $$0) {
      if ($$0.ao() != btv.n && $$0.ao() != btv.bn) {
         return this.ao().a(awx.r) ? cl : cop.a;
      } else {
         return cop.a;
      }
   }

   @Override
   public awf di() {
      return awf.f;
   }

   @Override
   protected awd n_() {
      return awe.cN;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.cO;
   }

   @Override
   protected awd w() {
      return this.aH() ? awe.cH : awe.cI;
   }

   public Optional<buk> gq() {
      return this.dX().c(cdn.x).map(bsg::d).filter($$0 -> $$0 instanceof buk).map($$0 -> (buk)$$0);
   }

   public boolean k(eys $$0) {
      eys $$1 = this.ds().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void ad() {
      this.dS().ah().a("breezeBrain");
      this.dX().a((arh)this.dS(), this);
      this.dS().ah().b("breezeActivityUpdate");
      clx.a(this);
      this.dS().ah().c();
      super.ad();
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a((buk)this);
      agn.a(this);
   }

   @Override
   public boolean a(btv<?> $$0) {
      return $$0 == btv.by || $$0 == btv.af;
   }

   @Override
   public int ag() {
      return 30;
   }

   @Override
   public int fR() {
      return 25;
   }

   public double gr() {
      return this.dz() + (double)(this.do() / 2.0F) + 0.3F;
   }

   @Override
   public boolean b(bsg $$0) {
      return $$0.d() instanceof clw || super.b($$0);
   }

   @Override
   public double dm() {
      return (double)this.cP();
   }

   @Override
   public boolean a(float $$0, float $$1, bsg $$2) {
      if ($$0 > 3.0F) {
         this.a(awe.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bto.b bf() {
      return bto.b.c;
   }

   @Nullable
   @Override
   public buk m() {
      return this.R();
   }
}
