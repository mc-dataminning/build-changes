import javax.annotation.Nullable;

@FunctionalInterface
public interface cop {
   cop a = ($$0, $$1, $$2) -> {
   };
   cop b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.dv().c(-0.5));
      $$0.v($$0.dI() + $$3);
      $$0.O += $$3;
      $$0.as = true;
   };
   cop c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         eys $$3 = $$1.bQ().d();
         $$0.h($$3);
         $$0.as = true;
      }
   };
   cop d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         eys $$3 = $$1.dv().d();
         $$0.h($$3);
         $$0.as = true;
      }
   };

   void deflect(coo var1, @Nullable bto var2, azl var3);
}
