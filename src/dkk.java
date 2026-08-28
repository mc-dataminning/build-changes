import com.mojang.serialization.MapCodec;

public class dkk extends dmy {
   public static final MapCodec<dkk> a = b(dkk::new);

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   public dkk(dsj.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lj.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
