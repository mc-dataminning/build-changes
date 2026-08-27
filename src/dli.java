import com.mojang.serialization.MapCodec;

public class dli extends dfm implements ddh {
   public static final MapCodec<dli> c = b(dli::new);

   @Override
   public MapCodec<dli> a() {
      return c;
   }

   public dli(dqg.d $$0) {
      super($$0);
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
      a($$0, $$2, new csz(this));
   }
}
