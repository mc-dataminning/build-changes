import java.util.Optional;

public class dbw extends dbz {
   private final bsh a;

   public dbw(bsh $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dby $$0, dbm $$1, ja $$2, dsl $$3, eoj $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dby $$0, dbm $$1, ja $$2, dsl $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
