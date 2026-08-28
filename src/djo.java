import java.util.Optional;

public class djo extends dip {
   private final boolean a;
   private final boolean b;
   private final Optional<Float> c;
   private final Optional<ji<dma>> d;

   public djo(boolean $$0, boolean $$1, Optional<Float> $$2, Optional<ji<dma>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public Optional<Float> a(dio $$0, dib $$1, iu $$2, dzz $$3, ewg $$4) {
      if (this.d.isPresent()) {
         return $$3.a(this.d.get()) ? Optional.of(3600000.0F) : Optional.empty();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(dio $$0, dib $$1, iu $$2, dzz $$3, float $$4) {
      return this.a;
   }

   @Override
   public boolean a(dio $$0, bwd $$1) {
      return this.b;
   }

   @Override
   public float a(bwd $$0) {
      boolean var10000;
      label17: {
         if ($$0 instanceof cqy $$1 && $$1.gj().b) {
            var10000 = true;
            break label17;
         }

         var10000 = false;
      }

      boolean $$2 = var10000;
      return $$2 ? 0.0F : this.c.orElseGet(() -> super.a($$0));
   }
}
