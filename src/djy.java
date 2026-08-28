import com.mojang.serialization.MapCodec;

public class djy extends dff {
   public static final MapCodec<djy> a = b(djy::new);
   private static final int b = 20;

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public djy(dsg.d $$0) {
      super($$0);
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsd $$3) {
      if (!$$3.bW() && $$3 instanceof bsy) {
         $$3.a($$0.aj().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      dfl.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && $$2.a(dfh.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
