import javax.annotation.Nullable;

@FunctionalInterface
public interface csf {
   csf a = ($$0, $$1, $$2) -> {
   };
   csf b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.i($$0.dx().c(-0.5));
      $$0.w($$0.dK() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   csf c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fex $$3 = $$1.bR().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };
   csf d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fex $$3 = $$1.dx().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };

   void deflect(cse var1, @Nullable bwi var2, azv var3);
}
