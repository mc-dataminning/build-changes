import javax.annotation.Nullable;

@FunctionalInterface
public interface cnd {
   cnd a = ($$0, $$1, $$2) -> {
   };
   cnd b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.i($$0.dt().a(-0.5));
      $$0.s($$0.dG() + $$3);
      $$0.O += $$3;
      $$0.av = true;
   };
   cnd c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ewf $$3 = $$1.bM().d();
         $$0.i($$3);
         $$0.av = true;
      }
   };
   cnd d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ewf $$3 = $$1.dt().d();
         $$0.i($$3);
         $$0.av = true;
      }
   };

   void deflect(cnc var1, @Nullable bsg var2, ayo var3);
}
