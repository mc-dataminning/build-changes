import java.util.Optional;

public class dbt extends dbw {
   private final bsd a;

   public dbt(bsd $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dbv $$0, dbj $$1, ja $$2, dsh $$3, eob $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dbv $$0, dbj $$1, ja $$2, dsh $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
