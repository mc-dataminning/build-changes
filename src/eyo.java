import java.util.function.Function;

public interface eyo {
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

   fkn bake(Function<eyq, fkn> var1);

   public interface a extends eyo {
      @Override
      default fkn bake(Function<eyq, fkn> $$0) {
         return fko.a;
      }
   }
}
