import javax.annotation.Nullable;

@FunctionalInterface
public interface cne {
   cne a = ($$0, $$1, $$2) -> {
   };
   cne b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.j($$0.du().a(-0.5));
      $$0.s($$0.dH() + $$3);
      $$0.O += $$3;
      $$0.av = true;
   };
   cne c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ewh $$3 = $$1.bN().d();
         $$0.j($$3);
         $$0.av = true;
      }
   };
   cne d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ewh $$3 = $$1.du().d();
         $$0.j($$3);
         $$0.av = true;
      }
   };

   void deflect(cnd var1, @Nullable bsh var2, ayo var3);
}
