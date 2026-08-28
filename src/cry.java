import javax.annotation.Nullable;

@FunctionalInterface
public interface cry {
   cry a = ($$0, $$1, $$2) -> {
   };
   cry b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.i($$0.dy().c(-0.5));
      $$0.w($$0.dL() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   cry c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         feq $$3 = $$1.bT().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };
   cry d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         feq $$3 = $$1.dy().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };

   void deflect(crx var1, @Nullable bwf var2, azv var3);
}
