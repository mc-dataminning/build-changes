import java.util.function.Function;

public interface env {
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

   ezr bake(Function<enx, ezr> var1);

   public interface a extends env {
      @Override
      default ezr bake(Function<enx, ezr> $$0) {
         return ezs.a;
      }
   }
}
