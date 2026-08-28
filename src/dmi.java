import com.mojang.serialization.MapCodec;

public class dmi extends dhj {
   public static final MapCodec<dmi> a = b(dmi::new);
   protected static final ezm b = dhj.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   public dmi(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected ezm b_(duo $$0, ddl $$1, je $$2) {
      return ezj.b();
   }

   @Override
   protected ezm c(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return ezj.b();
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   @Override
   protected float c(duo $$0, ddl $$1, je $$2) {
      return 0.2F;
   }
}
