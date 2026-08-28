import javax.annotation.Nullable;

public class exm implements exn {
   private final div b;

   public exm(div $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ja $$0, dzz $$1, iu $$2, iu $$3, int $$4, int $$5) {
      exn.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(iu $$0, dma $$1, @Nullable exo $$2) {
      dzz $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dzz $$0, iu $$1, dma $$2, @Nullable exo $$3, boolean $$4) {
      exn.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
