import com.mojang.serialization.MapCodec;

public class dow extends dhj {
   public static final MapCodec<dow> a = b(dow::new);
   protected static final ezm b = dhj.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   public dow(dun.d $$0) {
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
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      dhp.b($$1, $$2.d(), $$0);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == jj.b && $$2.a(dhl.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      $$1.a($$2, this, 20);
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
