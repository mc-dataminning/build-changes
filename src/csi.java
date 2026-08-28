import javax.annotation.Nullable;

@FunctionalInterface
public interface csi {
   csi a = ($$0, $$1, $$2) -> {
   };
   csi b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.i($$0.dx().c(-0.5));
      $$0.w($$0.dK() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   csi c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ffc $$3 = $$1.bR().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };
   csi d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ffc $$3 = $$1.dx().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };

   void deflect(csh var1, @Nullable bwi var2, azv var3);
}
