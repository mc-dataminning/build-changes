import com.mojang.serialization.MapCodec;

public class dgj extends djr {
   public static final MapCodec<dgj> a = b(dgj::new);

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   public dgj(dsj.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         ja $$4 = $$2.d();
         dsk $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), jf.b)) {
            ayk.a($$1, $$2, $$3, lj.H);
         }
      }
   }
}
