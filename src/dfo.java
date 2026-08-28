import com.mojang.serialization.MapCodec;

public abstract class dfo extends dfy {
   protected static final int a = 2;
   protected static final exv b = dfy.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dfo(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfo> a();

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return b;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !this.a($$0, $$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return a($$1, $$2.e(), ji.b);
   }
}
