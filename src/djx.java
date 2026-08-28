import com.mojang.serialization.MapCodec;

public class djx extends dez implements dfc {
   public static final MapCodec<djx> a = b(djx::new);

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   public djx(dsb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      $$0.H_().c(lq.aC).flatMap($$0x -> $$0x.b(sg.n)).ifPresent($$3x -> ((eal)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dfc.a ap_() {
      return dfc.a.a;
   }
}
