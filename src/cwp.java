import java.util.Optional;

public class cwp extends cws {
   private final bow a;

   public cwp(bow $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cwr $$0, cwf $$1, ib $$2, dmz $$3, ein $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cwr $$0, cwf $$1, ib $$2, dmz $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
