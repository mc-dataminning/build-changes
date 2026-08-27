import java.util.function.Function;

public interface evz {
   float getAdvance();

   default float a(boolean $$0) {
      return this.getAdvance() + ($$0 ? this.a() : 0.0F);
   }

   default float a() {
      return 1.0F;
   }

   default float b() {
      return 1.0F;
   }

   fhz bake(Function<ewb, fhz> var1);

   public interface a extends evz {
      @Override
      default fhz bake(Function<ewb, fhz> $$0) {
         return fia.a;
      }
   }
}
