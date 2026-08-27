import com.mojang.serialization.Dynamic;

public class ccv extends cbz {
   private static final int bU = 20;
   private static final int bV = 1;
   private static final int bW = 20;
   private static final int bX = 3;
   private static final int bY = 5;
   private static final int bZ = 10;
   private static final float ca = 3.0F;
   public blb b = new blb();
   public blb c = new blb();
   public blb d = new blb();
   public blb e = new blb();
   public blb bT = new blb();
   private int cb = 0;

   public static bna.a u() {
      return blx.C().a(bnb.m, 0.6F).a(bnb.l, 30.0).a(bnb.g, 24.0).a(bnb.c, 2.0);
   }

   public ccv(blj<? extends cbz> $$0, csy $$1) {
      super($$0, $$1);
      this.a(eek.z, -1.0F);
      this.a(eek.o, -1.0F);
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      return ccw.a(this.dP().a($$0));
   }

   @Override
   public bmv<ccv> dO() {
      return (bmv<ccv>)super.dO();
   }

   @Override
   protected bmv.b<ccv> dP() {
      return bmv.a(ccw.f, ccw.e);
   }

   @Override
   public boolean c(blv $$0) {
      return $$0.ai() != blj.l && super.c($$0);
   }

   @Override
   public void a(afz<?> $$0) {
      if (this.dM().y_() && as.equals($$0)) {
         this.gg();
         bmh $$1 = this.ap();
         switch ($$1) {
            case q:
               this.e.b(this.ah);
               break;
            case r:
               this.d.b(this.ah);
               break;
            case p:
               this.c.b(this.ah);
         }
      }

      super.a($$0);
   }

   private void gg() {
      this.e.a();
      this.b.a();
      this.bT.a();
      this.d.a();
      this.c.a();
   }

   @Override
   public void l() {
      switch (this.ap()) {
         case q:
         case r:
         case a:
            this.w().b(1 + this.eg().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.ge();
      }

      super.l();
   }

   public ccv w() {
      this.cb = 0;
      return this;
   }

   public ccv A() {
      elb $$0 = this.dk().b(0.0, 0.1F, 0.0);

      for (int $$1 = 0; $$1 < 20; $$1++) {
         this.dM().a(jv.aV, $$0.c, $$0.d, $$0.e, 0.0, 0.0, 0.0);
      }

      return this;
   }

   public void ge() {
      if (++this.cb <= 5) {
         dip $$0 = this.dM().a_(this.dm().d());
         elb $$1 = this.dp();
         elb $$2 = this.dk().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dM().a(new jn(jv.c, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      elb $$1 = this.cH().f();
      elb $$2 = new elb($$1.c, this.dk().d, $$1.e);
      dip $$3 = this.dM().a_(this.dm().d());
      if ($$3.l() != dce.a) {
         for (int $$4 = 0; $$4 < $$0; $$4++) {
            this.dM().a(new jn(jv.c, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void R() {
      this.dM().a(this, this.y(), this.db(), 1.0F, 1.0F);
   }

   @Override
   public ard db() {
      return ard.f;
   }

   @Override
   protected arb n_() {
      return arc.cr;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.cs;
   }

   @Override
   protected arb y() {
      return this.aC() ? arc.cl : arc.cm;
   }

   public boolean j(elb $$0) {
      elb $$1 = this.dm().b();
      return $$0.a($$1, 20.0, 10.0) && !$$0.a($$1, 8.0, 10.0);
   }

   public boolean k(elb $$0) {
      elb $$1 = this.dm().b();
      return $$0.a($$1, 8.0, 10.0) && !$$0.a($$1, 4.0, 10.0);
   }

   public boolean l(elb $$0) {
      elb $$1 = this.dm().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Z() {
      this.dM().ae().a("breezeBrain");
      this.dO().a((amp)this.dM(), this);
      this.dM().ae().b("breezeActivityUpdate");
      this.dM().ae().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a((blv)this);
      acv.a(this);
   }

   @Override
   public boolean a(blj<?> $$0) {
      return $$0 == blj.bv;
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   public int fH() {
      return 25;
   }

   public double gf() {
      return this.dv() - 0.4;
   }

   @Override
   public boolean b(bkd $$0) {
      return $$0.a(art.b) || $$0.d() instanceof ccv || super.b($$0);
   }

   @Override
   public double df() {
      return (double)this.cI();
   }

   @Override
   public boolean a(float $$0, float $$1, bkd $$2) {
      if ($$0 > 3.0F) {
         this.a(arc.cp, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected blf.b aW() {
      return blf.b.c;
   }
}
