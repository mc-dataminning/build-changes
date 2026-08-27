import com.mojang.serialization.MapCodec;

public class dkq extends dde {
   public static final MapCodec<dkq> a = b(dkq::new);
   protected static final eui b = dde.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   public dkq(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected eui b_(dqh $$0, czj $$1, in $$2) {
      return euf.b();
   }

   @Override
   protected eui c(dqh $$0, czj $$1, in $$2, etu $$3) {
      return euf.b();
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      ddk.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 == is.b && $$2.a(ddg.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Override
   protected float d(dqh $$0, czj $$1, in $$2) {
      return 0.2F;
   }
}
