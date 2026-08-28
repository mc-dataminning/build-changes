import java.util.function.Function;

public interface feo {
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

   fra bake(Function<feq, fra> var1);

   public interface a extends feo {
      @Override
      default fra bake(Function<feq, fra> $$0) {
         return frb.a;
      }
   }
}
