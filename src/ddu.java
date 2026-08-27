import com.mojang.serialization.MapCodec;

public class ddu extends dgi {
   public static final MapCodec<ddu> a = b(ddu::new);

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public ddu(dli.d $$0) {
      super($$0);
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(jz.W, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
