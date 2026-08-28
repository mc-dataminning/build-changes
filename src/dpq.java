import com.mojang.serialization.MapCodec;

public class dpq extends dsf {
   public static final MapCodec<dpq> a = b(dpq::new);

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   public dpq(dxt.d $$0) {
      super($$0);
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(ls.aa, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
