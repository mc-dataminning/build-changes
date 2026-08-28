import com.mojang.serialization.MapCodec;

public class dtn extends dmq {
   public static final MapCodec<dtn> a = b(dtn::new);
   public static final int b = 1;
   public static final dzm c = dzc.at;
   private static final fdo[] g = dku.a(1, $$0 -> dku.b(6.0, 0.0, (double)(6 + $$0 * 4)));
   private static final int h = 1;

   @Override
   public MapCodec<dtn> a() {
      return a;
   }

   public dtn(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }

   @Override
   public fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return g[this.h($$0)];
   }

   @Override
   protected dzm b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dho d() {
      return cyc.wm;
   }

   @Override
   public dym b(int $$0) {
      return $$0 == 2 ? dkw.bZ.m() : super.b($$0);
   }

   @Override
   public void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dhp $$0) {
      return 1;
   }
}
