import com.mojang.serialization.MapCodec;

public class dgp extends dfy {
   public static final MapCodec<dgp> a = b(dgp::new);
   protected static final ext b = dfy.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dgp> a() {
      return a;
   }

   public dgp(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return b;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return !$$1.u($$2.e());
   }
}
