import java.util.function.Function;

public interface fij {
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

   fxh bake(Function<fil, fxh> var1);

   public interface a extends fij {
      @Override
      default fxh bake(Function<fil, fxh> $$0) {
         return fxi.b;
      }
   }
}
