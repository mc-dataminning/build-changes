import com.mojang.serialization.MapCodec;

public class ddj extends dgq {
   public static final MapCodec<ddj> a = b(ddj::new);

   @Override
   public MapCodec<ddj> a() {
      return a;
   }

   public ddj(dph.d $$0) {
      super($$0);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         id $$4 = $$2.d();
         dpi $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ij.b)) {
            axp.a($$1, $$2, $$3, kn.G);
         }
      }
   }
}
