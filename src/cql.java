import javax.annotation.Nullable;

@FunctionalInterface
public interface cql {
   cql a = ($$0, $$1, $$2) -> {
   };
   cql b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.i($$0.dx().c(-0.5));
      $$0.w($$0.dK() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   cql c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fbx $$3 = $$1.bS().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };
   cql d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fbx $$3 = $$1.dx().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };

   void deflect(cqk var1, @Nullable bva var2, azh var3);
}
