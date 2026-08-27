import com.mojang.serialization.MapCodec;

public class dcz extends dez {
   public static final MapCodec<dcz> a = b(dcz::new);
   public static final int b = 3;
   public static final drh c = dqx.as;
   private static final eui[] g = new eui[]{
      dde.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dcz> a() {
      return a;
   }

   public dcz(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected drh b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dac d() {
      return ctc.vl;
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dad $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return g[this.g($$0)];
   }
}
