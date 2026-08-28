import com.mojang.serialization.MapCodec;

public class dmm extends dpb {
   public static final MapCodec<dmm> a = b(dmm::new);

   @Override
   public MapCodec<dmm> a() {
      return a;
   }

   public dmm(dun.d $$0) {
      super($$0);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(ln.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
