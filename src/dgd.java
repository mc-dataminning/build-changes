import com.mojang.serialization.MapCodec;

public class dgd extends cys {
   public static final MapCodec<dgd> a = b(dgd::new);
   protected static final eos b = cys.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   public dgd(dli.d $$0) {
      super($$0);
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   protected eos b_(dlj $$0, cux $$1, hz $$2) {
      return eop.b();
   }

   @Override
   protected eos c(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return eop.b();
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      cyy.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$1 == ie.b && $$2.a(cyu.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   @Override
   protected float d(dlj $$0, cux $$1, hz $$2) {
      return 0.2F;
   }
}
