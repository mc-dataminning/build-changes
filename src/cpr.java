import javax.annotation.Nullable;

@FunctionalInterface
public interface cpr {
   cpr a = ($$0, $$1, $$2) -> {
   };
   cpr b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.dz().c(-0.5));
      $$0.v($$0.dM() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   cpr c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fba $$3 = $$1.bT().d();
         $$0.h($$3);
         $$0.ar = true;
      }
   };
   cpr d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fba $$3 = $$1.dz().d();
         $$0.h($$3);
         $$0.ar = true;
      }
   };

   void deflect(cpq var1, @Nullable buk var2, azh var3);
}
