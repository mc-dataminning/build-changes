import java.util.Optional;

public class dbj extends dbm {
   private final bsp a;

   public dbj(bsp $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dbl $$0, daz $$1, iz $$2, drx $$3, enq $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dbl $$0, daz $$1, iz $$2, drx $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
