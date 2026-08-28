import com.mojang.serialization.MapCodec;

public class dtu extends dke {
   public static final MapCodec<dtu> a = b(dtu::new);

   @Override
   public MapCodec<dtu> a() {
      return a;
   }

   public dtu(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      fbs $$4 = new fbs(0.25, 0.05F, 0.25);
      if ($$3 instanceof bwb $$5 && $$5.b(bum.K)) {
         $$4 = new fbs(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
