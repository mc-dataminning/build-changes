import java.util.Optional;

public class dig extends dij {
   private final bwa a;

   public dig(bwa $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dii $$0, dhv $$1, iu $$2, dzo $$3, evv $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dii $$0, dhv $$1, iu $$2, dzo $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
