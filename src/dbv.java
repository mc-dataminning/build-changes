import java.util.Optional;

public class dbv extends dby {
   private final bsg a;

   public dbv(bsg $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dbx $$0, dbl $$1, ja $$2, dsk $$3, eoh $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dbx $$0, dbl $$1, ja $$2, dsk $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
