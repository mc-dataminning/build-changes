import com.mojang.serialization.MapCodec;

public class dqx extends dhj {
   public static final MapCodec<dqx> a = b(dqx::new);

   @Override
   public MapCodec<dqx> a() {
      return a;
   }

   public dqx(dun.d $$0) {
      super($$0);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      eys $$4 = new eys(0.25, 0.05F, 0.25);
      if ($$3 instanceof buk $$5 && $$5.b(bsx.K)) {
         $$4 = new eys(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
