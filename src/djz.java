import com.mojang.serialization.MapCodec;

public class djz extends dfb implements dfe {
   public static final MapCodec<djz> a = b(djz::new);

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(dsd.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      $$0.H_().c(lq.aC).flatMap($$0x -> $$0x.b(sg.n)).ifPresent($$3x -> ((ean)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dfe.a ap_() {
      return dfe.a.a;
   }
}
