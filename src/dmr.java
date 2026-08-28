import com.mojang.serialization.MapCodec;

public class dmr extends dff {
   public static final MapCodec<dmr> a = b(dmr::new);
   protected static final ews b = dff.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   public dmr(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected ews b_(dsh $$0, dbj $$1, ja $$2) {
      return ewp.b();
   }

   @Override
   protected ews c(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return ewp.b();
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

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Override
   protected float d(dsh $$0, dbj $$1, ja $$2) {
      return 0.2F;
   }
}
