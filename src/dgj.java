import com.mojang.serialization.MapCodec;

public class dgj extends cwy {
   public static final MapCodec<dgj> a = b(dgj::new);

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   public dgj(djo.d $$0) {
      super($$0);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      $$3.a($$0, new emc(0.25, 0.05F, 0.25));
   }
}
