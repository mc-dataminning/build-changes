import com.mojang.serialization.MapCodec;

public class dpu extends dhw {
   public static final MapCodec<dpu> c = b(dpu::new);

   @Override
   public MapCodec<dpu> a() {
      return c;
   }

   public dpu(dvn.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dil.a.m();
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dvo $$0) {
      return $$0.a(axd.aU);
   }

   @Override
   protected boolean g(dvo $$0) {
      return true;
   }
}
