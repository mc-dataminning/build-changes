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
   private static final cpo cl = ($$0, $$1, $$2) -> {
      $$1.dV().a(null, $$1, awn.cF, $$1.dm(), 1.0F, 1.0F);
      cpo.b.deflect($$0, $$1, $$2);
   };

   public static bwo.a n() {
      return bvj.C().a(bwp.v, 0.63F).a(bwp.s, 30.0).a(bwp.m, 24.0).a(bwp.c, 3.0);
   }

   public cmu(bus<? extends cly> $$0, dfm $$1) {
      super($$0, $$1);
      this.a(esm.z, -1.0F);
      this.a(esm.o, -1.0F);
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
   public void a(akm<?> $$0) {
      if (this.dV().A_() && aq.equals($$0)) {
         this.gp();
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

   private void gp() {
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
            this.q().b(1 + this.dY().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.d.b(this.af);
            this.v();
      }

      if ($$0 != bvt.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.ck = this.ck == 0 ? this.ae.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gm();
      }

      super.h();
   }

   public cmu q() {
      this.cj = 0;
      return this;
   }

   public void v() {
      if (++this.cj <= 5) {
         dvv $$0 = !this.dw().l() ? this.dw() : this.bu();
         ezy $$1 = this.dy();
         ezy $$2 = this.dt().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dV().a(new lk(ls.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bZ()) {
         ezy $$1 = this.cR().f();
         ezy $$2 = new ezy($$1.d, this.dt().e, $$1.f);
         dvv $$3 = !this.dw().l() ? this.dw() : this.bu();
         if ($$3.o() != dow.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dV().a(new lk(ls.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void R() {
      if (this.aa_() == null || !this.aJ()) {
         this.dV().a(this, this.t(), this.dm(), 1.0F, 1.0F);
      }
   }

   public void gm() {
      float $$0 = 0.7F + 0.4F * this.ae.i();
      float $$1 = 0.8F + 0.2F * this.ae.i();
      this.dV().a(this, awn.cP, this.dm(), $$1, $$0);
   }

   @Override
   public cpo a(cpn $$0) {
      if ($$0.aq() != bus.s && $$0.aq() != bus.bD) {
         return this.aq().a(axg.r) ? cl : cpo.a;
      } else {
         return cpo.a;
      }
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm n_() {
      return awn.cN;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.cO;
   }

   @Override
   protected awm t() {
      return this.aJ() ? awn.cH : awn.cI;
   }

   public Optional<bvh> gn() {
      return this.eb().c(cel.x).map(btb::d).filter($$0 -> $$0 instanceof bvh).map($$0 -> (bvh)$$0);
   }

   public boolean k(ezy $$0) {
      ezy $$1 = this.dv().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("breezeBrain");
      this.eb().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cmv.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a((bvh)this);
      agt.a(this);
   }

   @Override
   public boolean a(bus<?> $$0) {
      return $$0 == bus.bO || $$0 == bus.ao;
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   public int ac() {
      return 25;
   }

   public double go() {
      return this.dC() + (double)(this.dr() / 2.0F) + 0.3F;
   }

   @Override
   public boolean a(arp $$0, btb $$1) {
      return $$1.d() instanceof cmu || super.a($$0, $$1);
   }

   @Override
   public double dp() {
      return (double)this.cS();
   }

   @Override
   public boolean a(float $$0, float $$1, btb $$2) {
      if ($$0 > 3.0F) {
         this.a(awn.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bul.b bg() {
      return bul.b.c;
   }

   @Nullable
   @Override
   public bvh aa_() {
      return this.O();
   }
}
