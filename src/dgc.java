import com.mojang.serialization.MapCodec;

public class dgc extends djk {
   public static final MapCodec<dgc> a = b(dgc::new);

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   public dgc(dsc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         iz $$4 = $$2.d();
         dsd $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), je.b)) {
            azd.a($$1, $$2, $$3, li.H);
         }
      }
   }
}
