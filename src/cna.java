import javax.annotation.Nullable;

@FunctionalInterface
public interface cna {
   cna a = ($$0, $$1, $$2) -> {
   };
   cna b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.ds().a(-0.5));
      $$0.s($$0.dF() + $$3);
      $$0.O += $$3;
      $$0.U = true;
   };
   cna c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         evz $$3 = $$1.bL().d();
         $$0.h($$3);
         $$0.U = true;
      }
   };
   cna d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         evz $$3 = $$1.ds().d();
         $$0.h($$3);
         $$0.U = true;
      }
   };

   void deflect(cmz var1, @Nullable bsd var2, aym var3);
}
