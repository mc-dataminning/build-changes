import javax.annotation.Nullable;

@FunctionalInterface
public interface cps {
   cps a = ($$0, $$1, $$2) -> {
   };
   cps b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.i($$0.dy().c(-0.5));
      $$0.v($$0.dL() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   cps c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fbb $$3 = $$1.bT().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };
   cps d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fbb $$3 = $$1.dy().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };

   void deflect(cpr var1, @Nullable bum var2, azh var3);
}
