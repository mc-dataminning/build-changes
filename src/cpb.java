import java.util.Optional;

public class cpb extends cpe {
   private final bii a;

   public cpb(bii $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cpd $$0, cor $$1, gu $$2, dez $$3, eac $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cpd $$0, cor $$1, gu $$2, dez $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
