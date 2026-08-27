import com.mojang.serialization.MapCodec;

public class dlj extends ddn implements ddh {
   public static final MapCodec<dlj> a = b(dlj::new);
   protected static final float b = 6.0F;
   protected static final eui c = dde.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   protected dlj(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return true;
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      dfm $$4 = (dfm)($$3.a(ddg.bu) ? ddg.iI : ddg.iH);
      if ($$4.n().a($$0, $$2) && $$0.u($$2.c())) {
         dfm.a($$0, $$4.n(), $$2, 2);
      }
   }
}
