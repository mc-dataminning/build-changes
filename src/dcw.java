import java.util.Optional;

public class dcw extends dby {
   private final boolean a;
   private final boolean b;
   private final Optional<Float> c;
   private final Optional<jn<dfh>> d;

   public dcw(boolean $$0, boolean $$1, Optional<Float> $$2, Optional<jn<dfh>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public Optional<Float> a(dbx $$0, dbl $$1, ja $$2, dsk $$3, eoh $$4) {
      if (this.d.isPresent()) {
         return $$3.a(this.d.get()) ? Optional.of(3600000.0F) : Optional.empty();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(dbx $$0, dbl $$1, ja $$2, dsk $$3, float $$4) {
      return this.a;
   }

   @Override
   public boolean a(dbx $$0, bsg $$1) {
      return this.b;
   }

   @Override
   public float a(bsg $$0) {
      boolean var10000;
      label17: {
         if ($$0 instanceof cmk $$1 && $$1.ga().b) {
            var10000 = true;
            break label17;
         }

         var10000 = false;
      }

      boolean $$2 = var10000;
      return $$2 ? 0.0F : this.c.orElseGet(() -> super.a($$0));
   }
}
