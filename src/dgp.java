import java.util.Optional;

public class dgp extends dgs {
   private final bvb a;

   public dgp(bvb $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dgr $$0, dge $$1, jh $$2, dxo $$3, etq $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dgr $$0, dge $$1, jh $$2, dxo $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
