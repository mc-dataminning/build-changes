import com.mojang.serialization.MapCodec;

public class dkl extends dmz {
   public static final MapCodec<dkl> a = b(dkl::new);

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   public dkl(dsk.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lj.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
