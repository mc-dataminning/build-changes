import java.util.Optional;

public class dey extends ddz {
   private final boolean a;
   private final boolean b;
   private final Optional<Float> c;
   private final Optional<jr<dhj>> d;

   public dey(boolean $$0, boolean $$1, Optional<Float> $$2, Optional<jr<dhj>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public Optional<Float> a(ddy $$0, ddl $$1, je $$2, duo $$3, eqp $$4) {
      if (this.d.isPresent()) {
         return $$3.a(this.d.get()) ? Optional.of(3600000.0F) : Optional.empty();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(ddy $$0, ddl $$1, je $$2, duo $$3, float $$4) {
      return this.a;
   }

   @Override
   public boolean a(ddy $$0, bto $$1) {
      return this.b;
   }

   @Override
   public float a(bto $$0) {
      boolean var10000;
      label17: {
         if ($$0 instanceof cnu $$1 && $$1.gd().b) {
            var10000 = true;
            break label17;
         }

         var10000 = false;
      }

      boolean $$2 = var10000;
      return $$2 ? 0.0F : this.c.orElseGet(() -> super.a($$0));
   }
}
