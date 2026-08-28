import com.mojang.serialization.MapCodec;

public class duc extends dkm {
   public static final MapCodec<duc> a = b(duc::new);

   @Override
   public MapCodec<duc> a() {
      return a;
   }

   public duc(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      fby $$4 = new fby(0.25, 0.05F, 0.25);
      if ($$3 instanceof bwg $$5 && $$5.b(bur.K)) {
         $$4 = new fby(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
