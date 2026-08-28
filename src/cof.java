import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cof extends cnj {
   private static final int bG = 20;
   private static final int bH = 1;
   private static final int bI = 20;
   private static final int bJ = 3;
   private static final int bK = 5;
   private static final int bL = 10;
   private static final float bM = 3.0F;
   private static final int bN = 1;
   private static final int bO = 80;
   public bvj a = new bvj();
   public bvj b = new bvj();
   public bvj c = new bvj();
   public bvj d = new bvj();
   public bvj bE = new bvj();
   public bvj bF = new bvj();
   private int bP = 0;
   private int bQ = 0;
   private static final crc bR = ($$0, $$1, $$2) -> {
      $$1.dV().a(null, $$1, awk.cF, $$1.dm(), 1.0F, 1.0F);
      crc.b.deflect($$0, $$1, $$2);
   };

   public static bxw.a j() {
      return bwt.E().a(bxx.v, 0.63F).a(bxx.s, 30.0).a(bxx.m, 24.0).a(bxx.c, 3.0);
   }

   public cof(bwb<? extends cnj> $$0, dhp $$1) {
      super($$0, $$1);
      this.a(evk.z, -1.0F);
      this.a(evk.o, -1.0F);
      this.bw = 10;
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return cog.a(this, this.ec().a($$0));
   }

   @Override
   public bxr<cof> eb() {
      return (bxr<cof>)super.eb();
   }

   @Override
   protected bxr.b<cof> ec() {
      return bxr.a(cog.f, cog.e);
   }

   @Override
   public void a(akg<?> $$0) {
      if (this.dV().w_() && aq.equals($$0)) {
         this.gq();
         bxd $$1 = this.aw();
         switch ($$1) {
            case q:
               this.bE.b(this.af);
               break;
            case r:
               this.bF.b(this.af);
               break;
            case p:
               this.b.b(this.af);
         }
      }

      super.a($$0);
   }

   private void gq() {
      this.bE.a();
      this.a.a();
      this.bF.a();
      this.d.a();
   }

   @Override
   public void h() {
      bxd $$0 = this.aw();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.m().b(1 + this.dY().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.d.b(this.af);
            this.n();
      }

      this.a.b(this.af);
      if ($$0 != bxd.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.bQ = this.bQ == 0 ? this.ae.a(1, 80) : this.bQ - 1;
      if (this.bQ == 0) {
         this.q();
      }

      super.h();
   }

   public cof m() {
      this.bP = 0;
      return this;
   }

   public void n() {
      if (++this.bP <= 5) {
         dym $$0 = !this.dw().l() ? this.dw() : this.bt();
         fcu $$1 = this.dy();
         fcu $$2 = this.dt().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dV().a(new ln(lv.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bZ()) {
         fcu $$1 = this.cR().f();
         fcu $$2 = new fcu($$1.d, this.dt().e, $$1.f);
         dym $$3 = !this.dw().l() ? this.dw() : this.bt();
         if ($$3.o() != drf.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dV().a(new ln(lv.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void T() {
      if (this.f() == null || !this.aJ()) {
         this.dV().a(this, this.u(), this.dm(), 1.0F, 1.0F);
      }
   }

   @Override
   public void q() {
      float $$0 = 0.7F + 0.4F * this.ae.i();
      float $$1 = 0.8F + 0.2F * this.ae.i();
      this.dV().a(this, awk.cP, this.dm(), $$1, $$0);
   }

   @Override
   public crc a(crb $$0) {
      if ($$0.aq() != bwb.s && $$0.aq() != bwb.bG) {
         return this.aq().a(axd.r) ? bR : crc.a;
      } else {
         return crc.a;
      }
   }

   @Override
   public awl dm() {
      return awl.f;
   }

   @Override
   protected awj l_() {
      return awk.cN;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.cO;
   }

   @Override
   protected awj u() {
      return this.aJ() ? awk.cH : awk.cI;
   }

   public Optional<bwr> t() {
      return this.eb().c(cft.y).map(buh::d).filter($$0 -> $$0 instanceof bwr).map($$0 -> (bwr)$$0);
   }

   public boolean l(fcu $$0) {
      fcu $$1 = this.dv().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("breezeBrain");
      this.eb().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cog.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a((bwr)this);
      agj.a(this);
   }

   @Override
   public boolean a(bwb<?> $$0) {
      return $$0 == bwb.bR || $$0 == bwb.ap;
   }

   @Override
   public int ad() {
      return 30;
   }

   @Override
   public int ag() {
      return 25;
   }

   public double x() {
      return this.dC() + (double)(this.dr() / 2.0F) + 0.3F;
   }

   @Override
   public boolean a(arn $$0, buh $$1) {
      return $$1.d() instanceof cof || super.a($$0, $$1);
   }

   @Override
   public double dp() {
      return (double)this.cS();
   }

   @Override
   public boolean a(double $$0, float $$1, buh $$2) {
      if ($$0 > 3.0) {
         this.a(awk.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bvs.d bg() {
      return bvs.d.c;
   }

   @Nullable
   @Override
   public bwr f() {
      return this.Q();
   }
}
