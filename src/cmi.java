import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmi extends clm {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public btr b = new btr();
   public btr c = new btr();
   public btr d = new btr();
   public btr e = new btr();
   public btr bY = new btr();
   public btr bZ = new btr();
   private int cj = 0;
   private int ck = 0;
   private static final cpc cl = ($$0, $$1, $$2) -> {
      $$1.dX().a(null, $$1, awk.cF, $$1.dn(), 1.0F, 1.0F);
      cpc.b.deflect($$0, $$1, $$2);
   };

   public static bwc.a q() {
      return bux.E().a(bwd.v, 0.63F).a(bwd.s, 30.0).a(bwd.m, 24.0).a(bwd.c, 3.0);
   }

   public cmi(bug<? extends clm> $$0, dev $$1) {
      super($$0, $$1);
      this.a(erv.z, -1.0F);
      this.a(erv.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return cmj.a(this, this.ee().a($$0));
   }

   @Override
   public bvx<cmi> ed() {
      return (bvx<cmi>)super.ed();
   }

   @Override
   protected bvx.b<cmi> ee() {
      return bvx.a(cmj.f, cmj.e);
   }

   @Override
   public void a(akk<?> $$0) {
      if (this.dX().y_() && ar.equals($$0)) {
         this.gy();
         bvh $$1 = this.ax();
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

   private void gy() {
      this.bY.a();
      this.b.a();
      this.bZ.a();
      this.e.a();
   }

   @Override
   public void l() {
      bvh $$0 = this.ax();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.t().b(1 + this.ea().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.e.b(this.ag);
            this.y();
      }

      if ($$0 != bvh.p && this.c.b()) {
         this.d.a(this.ag);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.af.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gv();
      }

      super.l();
   }

   public cmi t() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         dvd $$0 = !this.dy().l() ? this.dy() : this.bv();
         ezh $$1 = this.dA();
         ezh $$2 = this.dv().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dX().a(new li(lq.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.ca()) {
         ezh $$1 = this.cS().f();
         ezh $$2 = new ezh($$1.d, this.dv().e, $$1.f);
         dvd $$3 = !this.dy().l() ? this.dy() : this.bv();
         if ($$3.o() != doe.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dX().a(new li(lq.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void U() {
      if (this.m() == null || !this.aJ()) {
         this.dX().a(this, this.w(), this.dn(), 1.0F, 1.0F);
      }
   }

   public void gv() {
      float $$0 = 0.7F + 0.4F * this.af.i();
      float $$1 = 0.8F + 0.2F * this.af.i();
      this.dX().a(this, awk.cP, this.dn(), $$1, $$0);
   }

   @Override
   public cpc a(cpb $$0) {
      if ($$0.aq() != bug.n && $$0.aq() != bug.bn) {
         return this.aq().a(axd.r) ? cl : cpc.a;
      } else {
         return cpc.a;
      }
   }

   @Override
   public awl dn() {
      return awl.f;
   }

   @Override
   protected awj o_() {
      return awk.cN;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.cO;
   }

   @Override
   protected awj w() {
      return this.aJ() ? awk.cH : awk.cI;
   }

   public Optional<buv> gw() {
      return this.ed().c(cdz.x).map(bsp::d).filter($$0 -> $$0 instanceof buv).map($$0 -> (buv)$$0);
   }

   public boolean k(ezh $$0) {
      ezh $$1 = this.dx().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void ac() {
      this.dX().ah().a("breezeBrain");
      this.ed().a((arm)this.dX(), this);
      this.dX().ah().b("breezeActivityUpdate");
      cmj.a(this);
      this.dX().ah().c();
      super.ac();
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a((buv)this);
      agr.a(this);
   }

   @Override
   public boolean a(bug<?> $$0) {
      return $$0 == bug.by || $$0 == bug.af;
   }

   @Override
   public int ae() {
      return 30;
   }

   @Override
   public int ah() {
      return 25;
   }

   public double gx() {
      return this.dE() + (double)(this.dt() / 2.0F) + 0.3F;
   }

   @Override
   public boolean b(bsp $$0) {
      return $$0.d() instanceof cmi || super.b($$0);
   }

   @Override
   public double dr() {
      return (double)this.cT();
   }

   @Override
   public boolean a(float $$0, float $$1, bsp $$2) {
      if ($$0 > 3.0F) {
         this.a(awk.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected btz.b bh() {
      return btz.b.c;
   }

   @Nullable
   @Override
   public buv m() {
      return this.R();
   }
}
