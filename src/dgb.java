import com.mojang.serialization.MapCodec;

public class dgb extends djj {
   public static final MapCodec<dgb> a = b(dgb::new);

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   public dgb(dsb.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         iz $$4 = $$2.d();
         dsc $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), je.b)) {
            azd.a($$1, $$2, $$3, li.H);
         }
      }
   }
}
