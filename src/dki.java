import com.mojang.serialization.MapCodec;

public class dki extends dgu {
   public static final MapCodec<dki> a = b(dki::new);

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public dki(dqg.d $$0) {
      super($$0);
   }

   @Override
   public void a(dad $$0, dqh $$1, in $$2, brh $$3, float $$4) {
      if ($$3.bV()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ai().k());
      }
   }

   @Override
   public void a(czj $$0, brh $$1) {
      if ($$1.bV()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(brh $$0) {
      etp $$1 = $$0.dq();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bsa ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, brh $$3) {
      double $$4 = Math.abs($$3.dq().d);
      if ($$4 < 0.1 && !$$3.bU()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.dq().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
