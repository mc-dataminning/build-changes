import java.util.Optional;

public class cvd extends cvg {
   private final bno a;

   public cvd(bno $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cvf $$0, cut $$1, hz $$2, dlf $$3, egp $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cvf $$0, cut $$1, hz $$2, dlf $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
