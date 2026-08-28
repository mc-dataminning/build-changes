import javax.annotation.Nullable;

@FunctionalInterface
public interface cnp {
   cnp a = ($$0, $$1, $$2) -> {
   };
   cnp b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.ds().a(-0.5));
      $$0.r($$0.dF() + $$3);
      $$0.O += $$3;
      $$0.U = true;
   };
   cnp c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         evq $$3 = $$1.bL();
         $$0.h($$3.a($$0.ds().f()));
         $$0.U = true;
      }
   };
   cnp d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         evq $$3 = $$1.ds().d();
         $$0.h($$3.a($$0.ds().f()));
         $$0.U = true;
      }
   };

   void deflect(cno var1, @Nullable bst var2, azg var3);
}
