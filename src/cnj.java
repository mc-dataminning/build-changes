import javax.annotation.Nullable;

public class cnj extends cma {
   public cnj(bvm<? extends cnj> $$0, dha $$1) {
      super($$0, $$1);
      this.a(eug.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bU.a(3, new ces<>(this, cof.class, true));
      super.B();
   }

   @Override
   protected axe u() {
      return axf.Db;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.Dd;
   }

   @Override
   protected axe o_() {
      return axf.Dc;
   }

   @Override
   axe p() {
      return axf.De;
   }

   @Override
   protected void a(ash $$0, btv $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cme $$4 && $$4.gn()) {
         $$4.go();
         this.a($$0, cxo.vc);
      }
   }

   @Override
   protected void a(bam $$0, btc $$1) {
      this.a(bvn.a, new cxk(cxo.pn));
   }

   @Override
   protected void a(dhr $$0, bam $$1, btc $$2) {
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      bwu $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bxj.c).a(4.0);
      this.t();
      return $$4;
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bwb) {
            ((bwb)$$1).b(new buk(bum.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cpz a(cxk $$0, float $$1, @Nullable cxk $$2) {
      cpz $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(buk $$0) {
      return $$0.a(bum.t) ? false : super.b($$0);
   }
}
