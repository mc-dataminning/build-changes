import java.util.function.Function;

public interface fil {
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

   fxj bake(Function<fin, fxj> var1);

   public interface a extends fil {
      @Override
      default fxj bake(Function<fin, fxj> $$0) {
         return fxk.b;
      }
   }
}
