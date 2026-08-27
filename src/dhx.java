import com.mojang.serialization.MapCodec;

public class dhx extends dde {
   public static final MapCodec<dhx> a = b(dhx::new);
   private static final int b = 20;

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   public dhx(dqg.d $$0) {
      super($$0);
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, brh $$3) {
      if (!$$3.bU() && $$3 instanceof bsa && !cyh.j((bsa)$$3)) {
         $$3.a($$0.ai().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
