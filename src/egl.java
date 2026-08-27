import java.util.function.Function;

public interface egl {
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

   err bake(Function<egn, err> var1);

   public interface a extends egl {
      @Override
      default err bake(Function<egn, err> $$0) {
         return ers.a;
      }
   }
}
