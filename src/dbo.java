import java.util.Optional;

public class dbo extends dbr {
   private final bsu a;

   public dbo(bsu $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dbq $$0, dbe $$1, iz $$2, dsc $$3, env $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dbq $$0, dbe $$1, iz $$2, dsc $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
