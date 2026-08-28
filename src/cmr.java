import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmr extends clv {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public bua b = new bua();
   public bua c = new bua();
   public bua d = new bua();
   public bua e = new bua();
   public bua bY = new bua();
   public bua bZ = new bua();
   private int cj = 0;
   private int ck = 0;
   private static final cpl cl = ($$0, $$1, $$2) -> {
      $$1.dY().a(null, $$1, awo.cF, $$1.do(), 1.0F, 1.0F);
      cpl.b.deflect($$0, $$1, $$2);
   };

   public static bwl.a q() {
      return bvg.E().a(bwm.v, 0.63F).a(bwm.s, 30.0).a(bwm.m, 24.0).a(bwm.c, 3.0);
   }

   public cmr(bup<? extends clv> $$0, dff $$1) {
      super($$0, $$1);
      this.a(esf.z, -1.0F);
      this.a(esf.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return cms.a(this, this.ef().a($$0));
   }

   @Override
   public bwg<cmr> ee() {
      return (bwg<cmr>)super.ee();
   }

   @Override
   protected bwg.b<cmr> ef() {
      return bwg.a(cms.f, cms.e);
   }

   @Override
   public void a(ako<?> $$0) {
      if (this.dY().y_() && ar.equals($$0)) {
         this.gy();
         bvq $$1 = this.ay();
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
      bvq $$0 = this.ay();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.t().b(1 + this.eb().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.e.b(this.ag);
            this.y();
      }

      if ($$0 != bvq.p && this.c.b()) {
         this.d.a(this.ag);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.af.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gv();
      }

      super.l();
   }

   public cmr t() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         dvo $$0 = !this.dz().l() ? this.dz() : this.bw();
         ezr $$1 = this.dB();
         ezr $$2 = this.dw().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dY().a(new lk(ls.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.cb()) {
         ezr $$1 = this.cT().f();
         ezr $$2 = new ezr($$1.d, this.dw().e, $$1.f);
         dvo $$3 = !this.dz().l() ? this.dz() : this.bw();
         if ($$3.o() != dop.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dY().a(new lk(ls.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void U() {
      if (this.m() == null || !this.aL()) {
         this.dY().a(this, this.w(), this.do(), 1.0F, 1.0F);
      }
   }

   public void gv() {
      float $$0 = 0.7F + 0.4F * this.af.i();
      float $$1 = 0.8F + 0.2F * this.af.i();
      this.dY().a(this, awo.cP, this.do(), $$1, $$0);
   }

   @Override
   public cpl a(cpk $$0) {
      if ($$0.ar() != bup.n && $$0.ar() != bup.bn) {
         return this.ar().a(axh.r) ? cl : cpl.a;
      } else {
         return cpl.a;
      }
   }

   @Override
   public awp do() {
      return awp.f;
   }

   @Override
   protected awn o_() {
      return awo.cN;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.cO;
   }

   @Override
   protected awn w() {
      return this.aL() ? awo.cH : awo.cI;
   }

   public Optional<bve> gw() {
      return this.ee().c(cei.x).map(bsy::d).filter($$0 -> $$0 instanceof bve).map($$0 -> (bve)$$0);
   }

   public boolean k(ezr $$0) {
      ezr $$1 = this.dy().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("breezeBrain");
      this.ee().a((arq)this.dY(), this);
      $$0.b("breezeActivityUpdate");
      cms.a(this);
      $$0.c();
      super.ac();
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a((bve)this);
      agv.a(this);
   }

   @Override
   public boolean a(bup<?> $$0) {
      return $$0 == bup.by || $$0 == bup.af;
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
      return this.dF() + (double)(this.du() / 2.0F) + 0.3F;
   }

   @Override
   public boolean b(bsy $$0) {
      return $$0.d() instanceof cmr || super.b($$0);
   }

   @Override
   public double ds() {
      return (double)this.cU();
   }

   @Override
   public boolean a(float $$0, float $$1, bsy $$2) {
      if ($$0 > 3.0F) {
         this.a(awo.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bui.b bi() {
      return bui.b.c;
   }

   @Nullable
   @Override
   public bve m() {
      return this.R();
   }
}
