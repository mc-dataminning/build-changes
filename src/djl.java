import com.mojang.serialization.MapCodec;

public class djl extends dms {
   public static final MapCodec<djl> a = b(djl::new);

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   public djl(dvn.d $$0) {
      super($$0);
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         jh $$4 = $$2.e();
         dvo $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jm.b)) {
            azr.a($$1, $$2, $$3, ls.H);
         }
      }
   }
}
