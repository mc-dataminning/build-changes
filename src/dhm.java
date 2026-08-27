import com.mojang.serialization.MapCodec;

public class dhm extends dbx {
   public static final MapCodec<dhm> d = b(dhm::new);

   @Override
   public MapCodec<dhm> a() {
      return d;
   }

   public dhm(dqg.d $$0) {
      super($$0, jt.e);
   }

   @Override
   protected double b(dqh $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dqh $$0) {
      return true;
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return 3;
   }
}
