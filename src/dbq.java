import java.util.Optional;

public class dbq extends dbt {
   private final brv a;

   public dbq(brv $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dbs $$0, dbg $$1, ir $$2, dtc $$3, epe $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dbs $$0, dbg $$1, ir $$2, dtc $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
