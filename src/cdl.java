import com.mojang.serialization.Dynamic;

public class cdl extends ccp {
   private static final int bU = 20;
   private static final int bV = 1;
   private static final int bW = 20;
   private static final int bX = 3;
   private static final int bY = 5;
   private static final int bZ = 10;
   private static final float ca = 3.0F;
   public blr b = new blr();
   public blr c = new blr();
   public blr d = new blr();
   public blr e = new blr();
   public blr bT = new blr();
   private int cb = 0;

   public static bnq.a u() {
      return bmn.C().a(bnr.m, 0.6F).a(bnr.l, 30.0).a(bnr.g, 24.0).a(bnr.c, 2.0);
   }

   public cdl(blz<? extends ccp> $$0, ctp $$1) {
      super($$0, $$1);
      this.a(efc.z, -1.0F);
      this.a(efc.o, -1.0F);
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      return cdm.a(this.dP().a($$0));
   }

   @Override
   public bnl<cdl> dO() {
      return (bnl<cdl>)super.dO();
   }

   @Override
   protected bnl.b<cdl> dP() {
      return bnl.a(cdm.f, cdm.e);
   }

   @Override
   public boolean c(bml $$0) {
      return $$0.ai() != blz.l && super.c($$0);
   }

   @Override
   public void a(agm<?> $$0) {
      if (this.dM().y_() && as.equals($$0)) {
         this.gg();
         bmx $$1 = this.ap();
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

   public cdl w() {
      this.cb = 0;
      return this;
   }

   public cdl A() {
      elt $$0 = this.dk().b(0.0, 0.1F, 0.0);

      for (int $$1 = 0; $$1 < 20; $$1++) {
         this.dM().a(jx.aV, $$0.c, $$0.d, $$0.e, 0.0, 0.0, 0.0);
      }

      return this;
   }

   public void ge() {
      if (++this.cb <= 5) {
         djh $$0 = this.dM().a_(this.dm().d());
         elt $$1 = this.dp();
         elt $$2 = this.dk().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dM().a(new jp(jx.c, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      elt $$1 = this.cH().f();
      elt $$2 = new elt($$1.c, this.dk().d, $$1.e);
      djh $$3 = this.dM().a_(this.dm().d());
      if ($$3.l() != dcv.a) {
         for (int $$4 = 0; $$4 < $$0; $$4++) {
            this.dM().a(new jp(jx.c, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void R() {
      this.dM().a(this, this.y(), this.db(), 1.0F, 1.0F);
   }

   @Override
   public art db() {
      return art.f;
   }

   @Override
   protected arr n_() {
      return ars.cr;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.cs;
   }

   @Override
   protected arr y() {
      return this.aC() ? ars.cl : ars.cm;
   }

   public boolean j(elt $$0) {
      elt $$1 = this.dm().b();
      return $$0.a($$1, 20.0, 10.0) && !$$0.a($$1, 8.0, 10.0);
   }

   public boolean k(elt $$0) {
      elt $$1 = this.dm().b();
      return $$0.a($$1, 8.0, 10.0) && !$$0.a($$1, 4.0, 10.0);
   }

   public boolean l(elt $$0) {
      elt $$1 = this.dm().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Z() {
      this.dM().af().a("breezeBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().b("breezeActivityUpdate");
      this.dM().af().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a((bml)this);
      adi.a(this);
   }

   @Override
   public boolean a(blz<?> $$0) {
      return $$0 == blz.bv;
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
   public boolean b(bkt $$0) {
      return $$0.a(asj.b) || $$0.d() instanceof cdl || super.b($$0);
   }

   @Override
   public double df() {
      return (double)this.cI();
   }

   @Override
   public boolean a(float $$0, float $$1, bkt $$2) {
      if ($$0 > 3.0F) {
         this.a(ars.cp, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected blv.b aW() {
      return blv.b.c;
   }
}
