import com.mojang.serialization.MapCodec;

public class dih extends dkv {
   public static final MapCodec<dih> a = b(dih::new);

   @Override
   public MapCodec<dih> a() {
      return a;
   }

   public dih(dqg.d $$0) {
      super($$0);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(kx.W, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
