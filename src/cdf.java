import com.mojang.serialization.Dynamic;

public class cdf extends ccj {
   private static final int bU = 20;
   private static final int bV = 1;
   private static final int bW = 20;
   private static final int bX = 3;
   private static final int bY = 5;
   private static final int bZ = 10;
   private static final float ca = 3.0F;
   public bll b = new bll();
   public bll c = new bll();
   public bll d = new bll();
   public bll e = new bll();
   public bll bT = new bll();
   private int cb = 0;

   public static bnk.a u() {
      return bmh.C().a(bnl.m, 0.6F).a(bnl.l, 30.0).a(bnl.g, 24.0).a(bnl.c, 2.0);
   }

   public cdf(blt<? extends ccj> $$0, cti $$1) {
      super($$0, $$1);
      this.a(eev.z, -1.0F);
      this.a(eev.o, -1.0F);
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      return cdg.a(this.dP().a($$0));
   }

   @Override
   public bnf<cdf> dO() {
      return (bnf<cdf>)super.dO();
   }

   @Override
   protected bnf.b<cdf> dP() {
      return bnf.a(cdg.f, cdg.e);
   }

   @Override
   public boolean c(bmf $$0) {
      return $$0.ai() != blt.l && super.c($$0);
   }

   @Override
   public void a(agj<?> $$0) {
      if (this.dM().y_() && as.equals($$0)) {
         this.gg();
         bmr $$1 = this.ap();
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

   public cdf w() {
      this.cb = 0;
      return this;
   }

   public cdf A() {
      elm $$0 = this.dk().b(0.0, 0.1F, 0.0);

      for (int $$1 = 0; $$1 < 20; $$1++) {
         this.dM().a(jx.aV, $$0.c, $$0.d, $$0.e, 0.0, 0.0, 0.0);
      }

      return this;
   }

   public void ge() {
      if (++this.cb <= 5) {
         dja $$0 = this.dM().a_(this.dm().d());
         elm $$1 = this.dp();
         elm $$2 = this.dk().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dM().a(new jp(jx.c, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      elm $$1 = this.cH().f();
      elm $$2 = new elm($$1.c, this.dk().d, $$1.e);
      dja $$3 = this.dM().a_(this.dm().d());
      if ($$3.l() != dco.a) {
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
   public arn db() {
      return arn.f;
   }

   @Override
   protected arl n_() {
      return arm.cr;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.cs;
   }

   @Override
   protected arl y() {
      return this.aC() ? arm.cl : arm.cm;
   }

   public boolean j(elm $$0) {
      elm $$1 = this.dm().b();
      return $$0.a($$1, 20.0, 10.0) && !$$0.a($$1, 8.0, 10.0);
   }

   public boolean k(elm $$0) {
      elm $$1 = this.dm().b();
      return $$0.a($$1, 8.0, 10.0) && !$$0.a($$1, 4.0, 10.0);
   }

   public boolean l(elm $$0) {
      elm $$1 = this.dm().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Z() {
      this.dM().af().a("breezeBrain");
      this.dO().a((amz)this.dM(), this);
      this.dM().af().b("breezeActivityUpdate");
      this.dM().af().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      adf.a((bmf)this);
      adf.a(this);
   }

   @Override
   public boolean a(blt<?> $$0) {
      return $$0 == blt.bv;
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
   public boolean b(bkn $$0) {
      return $$0.a(asd.b) || $$0.d() instanceof cdf || super.b($$0);
   }

   @Override
   public double df() {
      return (double)this.cI();
   }

   @Override
   public boolean a(float $$0, float $$1, bkn $$2) {
      if ($$0 > 3.0F) {
         this.a(arm.cp, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected blp.b aW() {
      return blp.b.c;
   }
}
