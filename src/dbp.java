import java.util.Optional;

public class dbp extends dbs {
   private final bsv a;

   public dbp(bsv $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dbr $$0, dbf $$1, iz $$2, dsd $$3, enw $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dbr $$0, dbf $$1, iz $$2, dsd $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
