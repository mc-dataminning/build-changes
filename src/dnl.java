import com.mojang.serialization.MapCodec;

public class dnl extends dfy {
   public static final MapCodec<dnl> a = b(dnl::new);
   protected static final exv b = dfy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   public dnl(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exv b(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return b;
   }

   @Override
   protected exv b_(dtc $$0, dcc $$1, jd $$2) {
      return exs.b();
   }

   @Override
   protected exv c(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return exs.b();
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      dge.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == ji.b && $$2.a(dga.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   protected float d(dtc $$0, dcc $$1, jd $$2) {
      return 0.2F;
   }
}
