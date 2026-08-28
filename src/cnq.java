import javax.annotation.Nullable;

@FunctionalInterface
public interface cnq {
   cnq a = ($$0, $$1, $$2) -> {
   };
   cnq b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.i($$0.dr().a(-0.5));
      $$0.t($$0.dE() + $$3);
      $$0.O += $$3;
      $$0.av = true;
   };
   cnq c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         exc $$3 = $$1.bM().d();
         $$0.i($$3);
         $$0.av = true;
      }
   };
   cnq d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         exc $$3 = $$1.dr().d();
         $$0.i($$3);
         $$0.av = true;
      }
   };

   void deflect(cnp var1, @Nullable bsr var2, ayw var3);
}
