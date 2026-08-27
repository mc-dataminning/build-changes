import com.mojang.serialization.Dynamic;

public class cdk extends cco {
   private static final int bU = 20;
   private static final int bV = 1;
   private static final int bW = 20;
   private static final int bX = 3;
   private static final int bY = 5;
   private static final int bZ = 10;
   private static final float ca = 3.0F;
   public blq b = new blq();
   public blq c = new blq();
   public blq d = new blq();
   public blq e = new blq();
   public blq bT = new blq();
   private int cb = 0;

   public static bnp.a u() {
      return bmm.C().a(bnq.m, 0.6F).a(bnq.l, 30.0).a(bnq.g, 24.0).a(bnq.c, 2.0);
   }

   public cdk(bly<? extends cco> $$0, cto $$1) {
      super($$0, $$1);
      this.a(efb.z, -1.0F);
      this.a(efb.o, -1.0F);
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      return cdl.a(this.dP().a($$0));
   }

   @Override
   public bnk<cdk> dO() {
      return (bnk<cdk>)super.dO();
   }

   @Override
   protected bnk.b<cdk> dP() {
      return bnk.a(cdl.f, cdl.e);
   }

   @Override
   public boolean c(bmk $$0) {
      return $$0.ai() != bly.l && super.c($$0);
   }

   @Override
   public void a(agm<?> $$0) {
      if (this.dM().y_() && as.equals($$0)) {
         this.gg();
         bmw $$1 = this.ap();
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

   public cdk w() {
      this.cb = 0;
      return this;
   }

   public cdk A() {
      els $$0 = this.dk().b(0.0, 0.1F, 0.0);

      for (int $$1 = 0; $$1 < 20; $$1++) {
         this.dM().a(jx.aV, $$0.c, $$0.d, $$0.e, 0.0, 0.0, 0.0);
      }

      return this;
   }

   public void ge() {
      if (++this.cb <= 5) {
         djg $$0 = this.dM().a_(this.dm().d());
         els $$1 = this.dp();
         els $$2 = this.dk().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dM().a(new jp(jx.c, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      els $$1 = this.cH().f();
      els $$2 = new els($$1.c, this.dk().d, $$1.e);
      djg $$3 = this.dM().a_(this.dm().d());
      if ($$3.l() != dcu.a) {
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
   public ars db() {
      return ars.f;
   }

   @Override
   protected arq n_() {
      return arr.cr;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.cs;
   }

   @Override
   protected arq y() {
      return this.aC() ? arr.cl : arr.cm;
   }

   public boolean j(els $$0) {
      els $$1 = this.dm().b();
      return $$0.a($$1, 20.0, 10.0) && !$$0.a($$1, 8.0, 10.0);
   }

   public boolean k(els $$0) {
      els $$1 = this.dm().b();
      return $$0.a($$1, 8.0, 10.0) && !$$0.a($$1, 4.0, 10.0);
   }

   public boolean l(els $$0) {
      els $$1 = this.dm().b();
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
      adi.a((bmk)this);
      adi.a(this);
   }

   @Override
   public boolean a(bly<?> $$0) {
      return $$0 == bly.bv;
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
   public boolean b(bks $$0) {
      return $$0.a(asi.b) || $$0.d() instanceof cdk || super.b($$0);
   }

   @Override
   public double df() {
      return (double)this.cI();
   }

   @Override
   public boolean a(float $$0, float $$1, bks $$2) {
      if ($$0 > 3.0F) {
         this.a(arr.cp, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected blu.b aW() {
      return blu.b.c;
   }
}
