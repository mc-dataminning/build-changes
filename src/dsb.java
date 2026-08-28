import com.mojang.serialization.MapCodec;

public class dsb extends dus {
   public static final MapCodec<dsb> a = b(dsb::new);

   @Override
   public MapCodec<dsb> a() {
      return a;
   }

   public dsb(eas.d $$0) {
      super($$0);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(ly.ac, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
