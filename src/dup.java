import com.mojang.serialization.MapCodec;

public class dup extends dku {
   public static final MapCodec<dup> a = b(dup::new);

   @Override
   public MapCodec<dup> a() {
      return a;
   }

   public dup(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      fcu $$4 = new fcu(0.25, 0.05F, 0.25);
      if ($$3 instanceof bwr $$5 && $$5.b(buy.K)) {
         $$4 = new fcu(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
