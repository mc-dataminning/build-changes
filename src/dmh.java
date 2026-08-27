import com.mojang.serialization.MapCodec;

public class dmh extends ddn {
   public static final MapCodec<dmh> a = b(dmh::new);
   protected static final eui b = dde.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   protected dmh(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aqh && $$3 instanceof cne) {
         $$1.a(new in($$2), true, $$3);
      }
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      ema $$3 = $$1.b_($$2);
      ema $$4 = $$1.b_($$2.c());
      return ($$3.a() == emb.c || $$0.b() instanceof dhc) && $$4.a() == emb.a;
   }
}
