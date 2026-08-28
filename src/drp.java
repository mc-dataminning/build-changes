import com.mojang.serialization.MapCodec;

public class drp extends dug {
   public static final MapCodec<drp> a = b(drp::new);

   @Override
   public MapCodec<drp> a() {
      return a;
   }

   public drp(eag.d $$0) {
      super($$0);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lx.ac, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
