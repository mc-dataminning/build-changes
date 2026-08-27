import com.mojang.serialization.MapCodec;

public class czu extends ddb {
   public static final MapCodec<czu> a = b(czu::new);

   @Override
   public MapCodec<czu> a() {
      return a;
   }

   public czu(dli.d $$0) {
      super($$0);
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         hz $$4 = $$2.d();
         dlj $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ie.b)) {
            awl.a($$1, $$2, $$3, jz.F);
         }
      }
   }
}
