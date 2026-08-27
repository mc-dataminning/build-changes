import com.mojang.serialization.MapCodec;

public class dac extends cvf implements cvi {
   public static final MapCodec<dac> a = b(dac::new);

   @Override
   public MapCodec<dac> a() {
      return a;
   }

   public dac(dhm.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      $$0.I_().c(kd.au).flatMap($$0x -> $$0x.b(px.n)).ifPresent($$3x -> ((dpn)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2.c()));
   }
}
