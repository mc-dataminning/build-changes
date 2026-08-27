import java.util.function.Function;

public interface eom {
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

   fak bake(Function<eoo, fak> var1);

   public interface a extends eom {
      @Override
      default fak bake(Function<eoo, fak> $$0) {
         return fal.a;
      }
   }
}
