import com.mojang.serialization.MapCodec;

public class dgd extends djl {
   public static final MapCodec<dgd> a = b(dgd::new);

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   public dgd(dsd.d $$0) {
      super($$0);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         iz $$4 = $$2.d();
         dse $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), je.b)) {
            azd.a($$1, $$2, $$3, li.H);
         }
      }
   }
}
