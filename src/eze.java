import java.util.function.Function;

public interface eze {
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

   fli bake(Function<ezg, fli> var1);

   public interface a extends eze {
      @Override
      default fli bake(Function<ezg, fli> $$0) {
         return flj.a;
      }
   }
}
