import java.util.Optional;

public class dbm extends dbp {
   private final bss a;

   public dbm(bss $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dbo $$0, dbc $$1, iz $$2, dsa $$3, ent $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dbo $$0, dbc $$1, iz $$2, dsa $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
