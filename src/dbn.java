import java.util.Optional;

public class dbn extends dbq {
   private final bst a;

   public dbn(bst $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dbp $$0, dbd $$1, iz $$2, dsb $$3, enu $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dbp $$0, dbd $$1, iz $$2, dsb $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
