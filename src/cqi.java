import javax.annotation.Nullable;

@FunctionalInterface
public interface cqi {
   cqi a = ($$0, $$1, $$2) -> {
   };
   cqi b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.dz().c(-0.5));
      $$0.v($$0.dM() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   cqi c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fbr $$3 = $$1.bT().d();
         $$0.h($$3);
         $$0.ar = true;
      }
   };
   cqi d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fbr $$3 = $$1.dz().d();
         $$0.h($$3);
         $$0.ar = true;
      }
   };

   void deflect(cqh var1, @Nullable bvb var2, bac var3);
}
