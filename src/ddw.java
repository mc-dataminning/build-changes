import com.mojang.serialization.MapCodec;

public class ddw extends dez {
   public static final MapCodec<ddw> a = b(ddw::new);
   private static final eui[] b = new eui[]{
      dde.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public ddw(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected dac d() {
      return ctc.uf;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b[this.g($$0)];
   }
}
