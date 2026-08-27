import java.util.Optional;

public class cso extends csr {
   private final blf a;

   public cso(blf $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(csq $$0, cse $$1, hv $$2, dip $$3, edz $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(csq $$0, cse $$1, hv $$2, dip $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
