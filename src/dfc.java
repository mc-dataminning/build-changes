import java.util.Optional;

public class dfc extends dff {
   private final bul a;

   public dfc(bul $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dfe $$0, der $$1, jh $$2, dvv $$3, erv $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dfe $$0, der $$1, jh $$2, dvv $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
