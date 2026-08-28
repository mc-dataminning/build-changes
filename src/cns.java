import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cns extends cmw {
   private static final int cb = 20;
   private static final int cc = 1;
   private static final int cd = 20;
   private static final int ce = 3;
   private static final int cf = 5;
   private static final int cg = 10;
   private static final float ch = 3.0F;
   private static final int ci = 1;
   private static final int cj = 80;
   public bvb a = new bvb();
   public bvb b = new bvb();
   public bvb c = new bvb();
   public bvb d = new bvb();
   public bvb bZ = new bvb();
   public bvb ca = new bvb();
   private int ck = 0;
   private int cl = 0;
   private static final cqq cm = ($$0, $$1, $$2) -> {
      $$1.dV().a(null, $$1, axf.cF, $$1.dm(), 1.0F, 1.0F);
      cqq.b.deflect($$0, $$1, $$2);
   };

   public static bxm.a m() {
      return bwh.C().a(bxn.v, 0.63F).a(bxn.s, 30.0).a(bxn.m, 24.0).a(bxn.c, 3.0);
   }

   public cns(bvq<? extends cmw> $$0, dhh $$1) {
      super($$0, $$1);
      this.a(eun.z, -1.0F);
      this.a(eun.o, -1.0F);
      this.bO = 10;
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return cnt.a(this, this.ec().a($$0));
   }

   @Override
   public bxh<cns> eb() {
      return (bxh<cns>)super.eb();
   }

   @Override
   protected bxh.b<cns> ec() {
      return bxh.a(cnt.f, cnt.e);
   }

   @Override
   public void a(alc<?> $$0) {
      if (this.dV().B_() && aq.equals($$0)) {
         this.go();
         bwr $$1 = this.aw();
         switch ($$1) {
            case q:
               this.bZ.b(this.af);
               break;
            case r:
               this.ca.b(this.af);
               break;
            case p:
               this.b.b(this.af);
         }
      }

      super.a($$0);
   }

   private void go() {
      this.bZ.a();
      this.a.a();
      this.ca.a();
      this.d.a();
   }

   @Override
   public void h() {
      bwr $$0 = this.aw();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.p().b(1 + this.dY().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.d.b(this.af);
            this.t();
      }

      if ($$0 != bwr.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.cl = this.cl == 0 ? this.ae.a(1, 80) : this.cl - 1;
      if (this.cl == 0) {
         this.x();
      }

      super.h();
   }

   public cns p() {
      this.ck = 0;
      return this;
   }

   public void t() {
      if (++this.ck <= 5) {
         dxu $$0 = !this.dw().l() ? this.dw() : this.bu();
         fbx $$1 = this.dy();
         fbx $$2 = this.dt().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dV().a(new lk(ls.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bZ()) {
         fbx $$1 = this.cR().f();
         fbx $$2 = new fbx($$1.d, this.dt().e, $$1.f);
         dxu $$3 = !this.dw().l() ? this.dw() : this.bu();
         if ($$3.o() != dqu.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dV().a(new lk(ls.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void R() {
      if (this.O_() == null || !this.aJ()) {
         this.dV().a(this, this.u(), this.dm(), 1.0F, 1.0F);
      }
   }

   public void x() {
      float $$0 = 0.7F + 0.4F * this.ae.i();
      float $$1 = 0.8F + 0.2F * this.ae.i();
      this.dV().a(this, axf.cP, this.dm(), $$1, $$0);
   }

   @Override
   public cqq a(cqp $$0) {
      if ($$0.aq() != bvq.s && $$0.aq() != bvq.bH) {
         return this.aq().a(axy.r) ? cm : cqq.a;
      } else {
         return cqq.a;
      }
   }

   @Override
   public axg dm() {
      return axg.f;
   }

   @Override
   protected axe o_() {
      return axf.cN;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.cO;
   }

   @Override
   protected axe u() {
      return this.aJ() ? axf.cH : axf.cI;
   }

   public Optional<bwf> gm() {
      return this.eb().c(cfj.x).map(btz::d).filter($$0 -> $$0 instanceof bwf).map($$0 -> (bwf)$$0);
   }

   public boolean k(fbx $$0) {
      fbx $$1 = this.dv().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(ash $$0) {
      bps $$1 = bpr.a();
      $$1.a("breezeBrain");
      this.eb().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cnt.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a((bwf)this);
      ahj.a(this);
   }

   @Override
   public boolean a(bvq<?> $$0) {
      return $$0 == bvq.bS || $$0 == bvq.aq;
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   public int ac() {
      return 25;
   }

   public double gn() {
      return this.dC() + (double)(this.dr() / 2.0F) + 0.3F;
   }

   @Override
   public boolean a(ash $$0, btz $$1) {
      return $$1.d() instanceof cns || super.a($$0, $$1);
   }

   @Override
   public double dp() {
      return (double)this.cS();
   }

   @Override
   public boolean a(float $$0, float $$1, btz $$2) {
      if ($$0 > 3.0F) {
         this.a(axf.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bvj.b bg() {
      return bvj.b.c;
   }

   @Nullable
   @Override
   public bwf O_() {
      return this.O();
   }
}
