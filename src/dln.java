import com.mojang.serialization.MapCodec;

public class dln extends dmq {
   public static final MapCodec<dln> a = b(dln::new);
   private static final fdo[] b = dku.a(7, $$0 -> dku.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   public dln(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected dho d() {
      return cyc.vi;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b[this.h($$0)];
   }
}
