import com.mojang.serialization.MapCodec;

public class dlp extends dez {
   public static final MapCodec<dlp> a = b(dlp::new);
   public static final int b = 2;
   public static final drh c = dqx.aq;
   private static final float g = 3.0F;
   private static final eui[] h = new eui[]{dde.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dde.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   public dlp(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }

   @Override
   public eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected drh b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dac d() {
      return ctc.vi;
   }

   @Override
   public dqh b(int $$0) {
      return $$0 == 2 ? ddg.bS.n() : super.b($$0);
   }

   @Override
   public void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dad $$0) {
      return 1;
   }
}
