import javax.annotation.Nullable;

@FunctionalInterface
public interface cpc {
   cpc a = ($$0, $$1, $$2) -> {
   };
   cpc b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.dA().c(-0.5));
      $$0.v($$0.dN() + $$3);
      $$0.O += $$3;
      $$0.as = true;
   };
   cpc c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ezh $$3 = $$1.bU().d();
         $$0.h($$3);
         $$0.as = true;
      }
   };
   cpc d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ezh $$3 = $$1.dA().d();
         $$0.h($$3);
         $$0.as = true;
      }
   };

   void deflect(cpb var1, @Nullable btz var2, azr var3);
}
