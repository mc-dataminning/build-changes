import javax.annotation.Nullable;

@FunctionalInterface
public interface cnr {
   cnr a = ($$0, $$1, $$2) -> {
   };
   cnr b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.ds().a(-0.5));
      $$0.r($$0.dF() + $$3);
      $$0.O += $$3;
      $$0.U = true;
   };
   cnr c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         evs $$3 = $$1.bL().d();
         $$0.h($$3);
         $$0.U = true;
      }
   };
   cnr d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         evs $$3 = $$1.ds().d();
         $$0.h($$3);
         $$0.U = true;
      }
   };

   void deflect(cnq var1, @Nullable bsv var2, azh var3);
}
