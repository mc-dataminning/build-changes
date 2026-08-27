import com.mojang.serialization.MapCodec;

public class dda extends dgh {
   public static final MapCodec<dda> a = b(dda::new);

   @Override
   public MapCodec<dda> a() {
      return a;
   }

   public dda(doy.d $$0) {
      super($$0);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         ib $$4 = $$2.d();
         doz $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ih.b)) {
            axn.a($$1, $$2, $$3, kl.G);
         }
      }
   }
}
