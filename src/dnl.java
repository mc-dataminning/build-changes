import com.mojang.serialization.MapCodec;

public class dnl extends dqa {
   public static final MapCodec<dnl> a = b(dnl::new);

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   public dnl(dvn.d $$0) {
      super($$0);
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(ls.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
