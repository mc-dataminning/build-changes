import com.mojang.serialization.MapCodec;

public class czv extends dcj {
   public static final MapCodec<czv> a = b(czv::new);

   @Override
   public MapCodec<czv> a() {
      return a;
   }

   public czv(dgv.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(js.U, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
