import com.mojang.serialization.MapCodec;

public class dgk extends djs {
   public static final MapCodec<dgk> a = b(dgk::new);

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public dgk(dsk.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         ja $$4 = $$2.d();
         dsl $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), jf.b)) {
            ayk.a($$1, $$2, $$3, lj.H);
         }
      }
   }
}
