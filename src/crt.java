import javax.annotation.Nullable;

@FunctionalInterface
public interface crt {
   crt a = ($$0, $$1, $$2) -> {
   };
   crt b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.i($$0.dy().c(-0.5));
      $$0.w($$0.dL() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   crt c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fei $$3 = $$1.bT().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };
   crt d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fei $$3 = $$1.dy().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };

   void deflect(crs var1, @Nullable bwd var2, azv var3);
}
