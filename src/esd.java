import java.util.function.Function;

public interface esd {
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

   fed bake(Function<esf, fed> var1);

   public interface a extends esd {
      @Override
      default fed bake(Function<esf, fed> $$0) {
         return fee.a;
      }
   }
}
