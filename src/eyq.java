import java.util.function.Function;

public interface eyq {
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

   fkp bake(Function<eys, fkp> var1);

   public interface a extends eyq {
      @Override
      default fkp bake(Function<eys, fkp> $$0) {
         return fkq.a;
      }
   }
}
