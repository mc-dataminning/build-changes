import com.mojang.serialization.MapCodec;

public class djd extends dlr {
   public static final MapCodec<djd> a = b(djd::new);

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   public djd(drc.d $$0) {
      super($$0);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(ky.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
