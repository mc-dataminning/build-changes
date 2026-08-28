import javax.annotation.Nullable;

@FunctionalInterface
public interface cst {
   cst a = ($$0, $$1, $$2) -> {
   };
   cst b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.i($$0.dy().c(-0.5));
      $$0.w($$0.dL() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   cst c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ffq $$3 = $$1.bS().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };
   cst d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ffq $$3 = $$1.dy().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };

   void deflect(css var1, @Nullable bwt var2, azx var3);
}
