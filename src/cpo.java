import javax.annotation.Nullable;

@FunctionalInterface
public interface cpo {
   cpo a = ($$0, $$1, $$2) -> {
   };
   cpo b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.dy().c(-0.5));
      $$0.v($$0.dL() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   cpo c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ezy $$3 = $$1.bT().d();
         $$0.h($$3);
         $$0.ar = true;
      }
   };
   cpo d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ezy $$3 = $$1.dy().d();
         $$0.h($$3);
         $$0.ar = true;
      }
   };

   void deflect(cpn var1, @Nullable bul var2, azu var3);
}
