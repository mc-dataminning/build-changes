import java.util.Optional;

public class crq extends crt {
   private final bkq a;

   public crq(bkq $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(crs $$0, crg $$1, ht $$2, dhi $$3, ecs $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(crs $$0, crg $$1, ht $$2, dhi $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
