import java.util.Optional;

public class cvh extends cvk {
   private final bnq a;

   public cvh(bnq $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cvj $$0, cux $$1, hz $$2, dlj $$3, egw $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cvj $$0, cux $$1, hz $$2, dlj $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
