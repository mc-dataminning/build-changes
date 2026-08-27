import java.util.function.Function;

public interface ewu {
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

   fiu bake(Function<eww, fiu> var1);

   public interface a extends ewu {
      @Override
      default fiu bake(Function<eww, fiu> $$0) {
         return fiv.a;
      }
   }
}
