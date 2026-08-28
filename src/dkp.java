import com.mojang.serialization.MapCodec;

public class dkp extends dmq {
   public static final MapCodec<dkp> a = b(dkp::new);
   public static final int b = 3;
   public static final dzm c = dzc.av;
   private static final fdo[] g = dku.a(3, $$0 -> dku.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   public dkp(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected dzm b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dho d() {
      return cyc.wp;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dhp $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return g[this.h($$0)];
   }
}
