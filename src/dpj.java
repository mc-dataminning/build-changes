import com.mojang.serialization.MapCodec;

public class dpj extends drz {
   public static final MapCodec<dpj> a = b(dpj::new);

   @Override
   public MapCodec<dpj> a() {
      return a;
   }

   public dpj(dxn.d $$0) {
      super($$0);
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(ls.ab, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
