import javax.annotation.Nullable;

@FunctionalInterface
public interface cnq {
   cnq a = ($$0, $$1, $$2) -> {
   };
   cnq b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.ds().a(-0.5));
      $$0.r($$0.dF() + $$3);
      $$0.O += $$3;
      $$0.U = true;
   };
   cnq c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         evr $$3 = $$1.bL().d();
         $$0.h($$3);
         $$0.U = true;
      }
   };
   cnq d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         evr $$3 = $$1.ds().d();
         $$0.h($$3);
         $$0.U = true;
      }
   };

   void deflect(cnp var1, @Nullable bsu var2, azh var3);
}
