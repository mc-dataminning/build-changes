import com.mojang.serialization.MapCodec;

public class dmr extends dde {
   public static final MapCodec<dmr> a = b(dmr::new);

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   public dmr(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      $$3.a($$0, new etp(0.25, 0.05F, 0.25));
   }
}
