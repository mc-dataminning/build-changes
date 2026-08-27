public class cwl extends cuc {
   private static final xe a = xe.c("item.minecraft.snektato.revealed");

   public cwl(cuc.a $$0) {
      super($$0);
   }

   @Override
   public int b(cuh $$0) {
      return 20;
   }

   @Override
   public cwk c(cuh $$0) {
      return cwk.b;
   }

   @Override
   public xe o(cuh $$0) {
      cxu $$1 = $$0.a(ke.af);
      return $$1 != null && $$1.a() ? a : super.o($$0);
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      $$1.c($$2);
      cuh $$3 = $$1.b($$2);
      return bqb.a($$3, $$0.C);
   }

   @Override
   public cuh a(cuh $$0, dca $$1, bso $$2) {
      $$1.a(null, $$2.dz(), $$2.dB(), $$2.dF(), avo.zg, avq.h, 1.0F, 1.0F + ($$1.A.i() - $$1.A.i()) * 0.4F);
      cin.a($$2, null);
      $$2.a(dxv.m);
      $$2.a($$1.aj().p(), 2.0F);
      $$0.b(ke.af, new cxu(true));
      return $$0;
   }
}
