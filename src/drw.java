import com.mojang.serialization.MapCodec;

public class drw extends dun {
   public static final MapCodec<drw> a = b(drw::new);

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   public drw(ean.d $$0) {
      super($$0);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(ly.ac, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
