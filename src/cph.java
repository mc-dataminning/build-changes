import javax.annotation.Nullable;

@FunctionalInterface
public interface cph {
   cph a = ($$0, $$1, $$2) -> {
   };
   cph b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.dA().c(-0.5));
      $$0.v($$0.dN() + $$3);
      $$0.O += $$3;
      $$0.as = true;
   };
   cph c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ezn $$3 = $$1.bU().d();
         $$0.h($$3);
         $$0.as = true;
      }
   };
   cph d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ezn $$3 = $$1.dA().d();
         $$0.h($$3);
         $$0.as = true;
      }
   };

   void deflect(cpg var1, @Nullable bue var2, azs var3);
}
