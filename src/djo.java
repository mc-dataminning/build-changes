import java.util.Optional;

public class djo extends djr {
   private final bwt a;

   public djo(bwt $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(djq $$0, djb $$1, iv $$2, ebe $$3, exo $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(djq $$0, djb $$1, iv $$2, ebe $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
