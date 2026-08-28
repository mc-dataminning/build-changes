import java.util.Optional;

public class dim extends dip {
   private final bwd a;

   public dim(bwd $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dio $$0, dib $$1, iu $$2, dzz $$3, ewg $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dio $$0, dib $$1, iu $$2, dzz $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
