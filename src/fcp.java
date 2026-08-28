import java.util.function.Function;

public interface fcp {
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

   fpa bake(Function<fcr, fpa> var1);

   public interface a extends fcp {
      @Override
      default fpa bake(Function<fcr, fpa> $$0) {
         return fpb.a;
      }
   }
}
