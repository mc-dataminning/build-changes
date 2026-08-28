import java.util.function.Function;

public interface fir {
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

   fwu bake(Function<fit, fwu> var1);

   public interface a extends fir {
      @Override
      default fwu bake(Function<fit, fwu> $$0) {
         return fwv.b;
      }
   }
}
