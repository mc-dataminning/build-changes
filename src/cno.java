import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cno extends cms {
   private static final int cb = 20;
   private static final int cc = 1;
   private static final int cd = 20;
   private static final int ce = 3;
   private static final int cf = 5;
   private static final int cg = 10;
   private static final float ch = 3.0F;
   private static final int ci = 1;
   private static final int cj = 80;
   public bux a = new bux();
   public bux b = new bux();
   public bux c = new bux();
   public bux d = new bux();
   public bux bZ = new bux();
   public bux ca = new bux();
   private int ck = 0;
   private int cl = 0;
   private static final cqm cm = ($$0, $$1, $$2) -> {
      $$1.dV().a(null, $$1, axf.cF, $$1.dm(), 1.0F, 1.0F);
      cqm.b.deflect($$0, $$1, $$2);
   };

   public static bxi.a m() {
      return bwd.C().a(bxj.v, 0.63F).a(bxj.s, 30.0).a(bxj.m, 24.0).a(bxj.c, 3.0);
   }

   public cno(bvm<? extends cms> $$0, dha $$1) {
      super($$0, $$1);
      this.a(eug.z, -1.0F);
      this.a(eug.o, -1.0F);
      this.bO = 10;
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return cnp.a(this, this.ec().a($$0));
   }

   @Override
   public bxd<cno> eb() {
      return (bxd<cno>)super.eb();
   }

   @Override
   protected bxd.b<cno> ec() {
      return bxd.a(cnp.f, cnp.e);
   }

   @Override
   public void a(alc<?> $$0) {
      if (this.dV().B_() && aq.equals($$0)) {
         this.go();
         bwn $$1 = this.aw();
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
      bwn $$0 = this.aw();
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

      if ($$0 != bwn.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.cl = this.cl == 0 ? this.ae.a(1, 80) : this.cl - 1;
      if (this.cl == 0) {
         this.x();
      }

      super.h();
   }

   public cno p() {
      this.ck = 0;
      return this;
   }

   public void t() {
      if (++this.ck <= 5) {
         dxn $$0 = !this.dw().l() ? this.dw() : this.bu();
         fbs $$1 = this.dy();
         fbs $$2 = this.dt().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dV().a(new lk(ls.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bZ()) {
         fbs $$1 = this.cR().f();
         fbs $$2 = new fbs($$1.d, this.dt().e, $$1.f);
         dxn $$3 = !this.dw().l() ? this.dw() : this.bu();
         if ($$3.o() != dqn.a) {
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
   public cqm a(cql $$0) {
      if ($$0.aq() != bvm.s && $$0.aq() != bvm.bH) {
         return this.aq().a(axy.r) ? cm : cqm.a;
      } else {
         return cqm.a;
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
   protected axe e(btv $$0) {
      return axf.cO;
   }

   @Override
   protected axe u() {
      return this.aJ() ? axf.cH : axf.cI;
   }

   public Optional<bwb> gm() {
      return this.eb().c(cff.x).map(btv::d).filter($$0 -> $$0 instanceof bwb).map($$0 -> (bwb)$$0);
   }

   public boolean k(fbs $$0) {
      fbs $$1 = this.dv().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("breezeBrain");
      this.eb().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cnp.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a((bwb)this);
      ahj.a(this);
   }

   @Override
   public boolean a(bvm<?> $$0) {
      return $$0 == bvm.bS || $$0 == bvm.aq;
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
   public boolean a(ash $$0, btv $$1) {
      return $$1.d() instanceof cno || super.a($$0, $$1);
   }

   @Override
   public double dp() {
      return (double)this.cS();
   }

   @Override
   public boolean a(float $$0, float $$1, btv $$2) {
      if ($$0 > 3.0F) {
         this.a(axf.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bvf.b bg() {
      return bvf.b.c;
   }

   @Nullable
   @Override
   public bwb O_() {
      return this.O();
   }
}
