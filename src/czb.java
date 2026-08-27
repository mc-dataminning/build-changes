import com.mojang.serialization.MapCodec;

public class czb extends dbp {
   public static final MapCodec<czb> a = b(czb::new);

   @Override
   public MapCodec<czb> a() {
      return a;
   }

   public czb(dga.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(js.U, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
