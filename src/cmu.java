import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmu extends cly {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public bud a = new bud();
   public bud b = new bud();
   public bud c = new bud();
   public bud d = new bud();
   public bud bY = new bud();
   public bud bZ = new bud();
   private int cj = 0;
   private int ck = 0;
   private static final cpr cl = ($$0, $$1, $$2) -> {
      $$1.dV().a(null, $$1, awa.cF, $$1.dm(), 1.0F, 1.0F);
      cpr.b.deflect($$0, $$1, $$2);
   };

   public static bwo.a m() {
      return bvj.F().a(bwp.v, 0.63F).a(bwp.s, 30.0).a(bwp.m, 24.0).a(bwp.c, 3.0);
   }

   public cmu(bus<? extends cly> $$0, dgi $$1) {
      super($$0, $$1);
      this.a(etq.z, -1.0F);
      this.a(etq.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cmv.a(this, this.ec().a($$0));
   }

   @Override
   public bwj<cmu> eb() {
      return (bwj<cmu>)super.eb();
   }

   @Override
   protected bwj.b<cmu> ec() {
      return bwj.a(cmv.f, cmv.e);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (this.dV().B_() && aq.equals($$0)) {
         this.gu();
         bvt $$1 = this.aw();
         switch ($$1) {
            case q:
               this.bY.b(this.af);
               break;
            case r:
               this.bZ.b(this.af);
               break;
            case p:
               this.b.b(this.af);
         }
      }

      super.a($$0);
   }

   private void gu() {
      this.bY.a();
      this.a.a();
      this.bZ.a();
      this.d.a();
   }

   @Override
   public void h() {
      bvt $$0 = this.aw();
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

      this.a.b(this.af);
      if ($$0 != bvt.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.ck = this.ck == 0 ? this.ae.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.x();
      }

      super.h();
   }

   public cmu p() {
      this.cj = 0;
      return this;
   }

   public void t() {
      if (++this.cj <= 5) {
         dwx $$0 = !this.dw().l() ? this.dw() : this.bu();
         fba $$1 = this.dy();
         fba $$2 = this.dt().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dV().a(new ll(lt.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bZ()) {
         fba $$1 = this.cR().f();
         fba $$2 = new fba($$1.d, this.dt().e, $$1.f);
         dwx $$3 = !this.dw().l() ? this.dw() : this.bu();
         if ($$3.o() != dpx.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dV().a(new ll(lt.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void U() {
      if (this.O_() == null || !this.aJ()) {
         this.dV().a(this, this.u(), this.dm(), 1.0F, 1.0F);
      }
   }

   public void x() {
      float $$0 = 0.7F + 0.4F * this.ae.i();
      float $$1 = 0.8F + 0.2F * this.ae.i();
      this.dV().a(this, awa.cP, this.dm(), $$1, $$0);
   }

   @Override
   public cpr a(cpq $$0) {
      if ($$0.aq() != bus.s && $$0.aq() != bus.bG) {
         return this.aq().a(awt.r) ? cl : cpr.a;
      } else {
         return cpr.a;
      }
   }

   @Override
   public awb dm() {
      return awb.f;
   }

   @Override
   protected avz o_() {
      return awa.cN;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.cO;
   }

   @Override
   protected avz u() {
      return this.aJ() ? awa.cH : awa.cI;
   }

   public Optional<bvh> gs() {
      return this.eb().c(cel.x).map(btb::d).filter($$0 -> $$0 instanceof bvh).map($$0 -> (bvh)$$0);
   }

   public boolean l(fba $$0) {
      fba $$1 = this.dv().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(ard $$0) {
      bot $$1 = bos.a();
      $$1.a("breezeBrain");
      this.eb().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cmv.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a((bvh)this);
      agd.a(this);
   }

   @Override
   public boolean a(bus<?> $$0) {
      return $$0 == bus.bR || $$0 == bus.ap;
   }

   @Override
   public int af() {
      return 30;
   }

   @Override
   public int ai() {
      return 25;
   }

   public double gt() {
      return this.dC() + (double)(this.dr() / 2.0F) + 0.3F;
   }

   @Override
   public boolean a(ard $$0, btb $$1) {
      return $$1.d() instanceof cmu || super.a($$0, $$1);
   }

   @Override
   public double dp() {
      return (double)this.cS();
   }

   @Override
   public boolean a(float $$0, float $$1, btb $$2) {
      if ($$0 > 3.0F) {
         this.a(awa.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bul.c bg() {
      return bul.c.c;
   }

   @Nullable
   @Override
   public bvh O_() {
      return this.R();
   }
}
