import javax.annotation.Nullable;

public class cdf extends cbx {
   public cdf(bly<? extends cdf> $$0, cto $$1) {
      super($$0, $$1);
      this.a(efb.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bP.a(3, new buz<>(this, cdw.class, true));
      super.B();
   }

   @Override
   protected arq y() {
      return arr.Bq;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.Bs;
   }

   @Override
   protected arq n_() {
      return arr.Br;
   }

   @Override
   arq w() {
      return arr.Bt;
   }

   @Override
   protected void a(bks $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cca $$4 && $$4.gf()) {
         $$4.gg();
         this.a((ctn)cna.uf);
      }
   }

   @Override
   protected void a(auu $$0, bjy $$1) {
      this.a(blz.a, new cmx(cna.oN));
   }

   @Override
   protected void b(auu $$0, bjy $$1) {
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      bnd $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bnq.c).a(4.0);
      this.A();
      return $$5;
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 2.1F;
   }

   @Override
   protected float l(blu $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(blu $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bmk) {
            ((bmk)$$0).b(new blh(blj.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cfn b(cmx $$0, float $$1) {
      cfn $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(blh $$0) {
      return $$0.c() == blj.t ? false : super.c($$0);
   }
}
