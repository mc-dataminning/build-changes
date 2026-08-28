import javax.annotation.Nullable;

@FunctionalInterface
public interface coj {
   coj a = ($$0, $$1, $$2) -> {
   };
   coj b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.dv().c(-0.5));
      $$0.v($$0.dI() + $$3);
      $$0.O += $$3;
      $$0.as = true;
   };
   coj c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         eye $$3 = $$1.bQ().d();
         $$0.h($$3);
         $$0.as = true;
      }
   };
   coj d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         eye $$3 = $$1.dv().d();
         $$0.h($$3);
         $$0.as = true;
      }
   };

   void deflect(coi var1, @Nullable btj var2, azk var3);
}
