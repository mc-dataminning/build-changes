import com.mojang.serialization.MapCodec;

public class dqs extends dmq {
   public static final MapCodec<dqs> a = b(dqs::new);
   private static final fdo[] b = dku.a(7, $$0 -> dku.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dqs> a() {
      return a;
   }

   public dqs(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected dho d() {
      return cyc.vj;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b[this.h($$0)];
   }
}
