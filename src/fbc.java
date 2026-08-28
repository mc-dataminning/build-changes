import java.util.function.Function;

public interface fbc {
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

   fng bake(Function<fbe, fng> var1);

   public interface a extends fbc {
      @Override
      default fng bake(Function<fbe, fng> $$0) {
         return fnh.a;
      }
   }
}
