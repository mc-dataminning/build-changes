import java.util.Optional;

public class dbq extends dbt {
   private final bsw a;

   public dbq(bsw $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dbs $$0, dbg $$1, iz $$2, dse $$3, enx $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dbs $$0, dbg $$1, iz $$2, dse $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
