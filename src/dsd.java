import com.mojang.serialization.MapCodec;

public class dsd extends diq {
   public static final MapCodec<dsd> a = b(dsd::new);

   @Override
   public MapCodec<dsd> a() {
      return a;
   }

   public dsd(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      ezy $$4 = new ezy(0.25, 0.05F, 0.25);
      if ($$3 instanceof bvh $$5 && $$5.b(bts.K)) {
         $$4 = new ezy(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
