import java.util.function.Function;

public interface fan {
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

   fmw bake(Function<fap, fmw> var1);

   public interface a extends fan {
      @Override
      default fmw bake(Function<fap, fmw> $$0) {
         return fmx.a;
      }
   }
}
