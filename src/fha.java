import java.util.function.Function;

public interface fha {
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

   fuy bake(Function<fhc, fuy> var1);

   public interface a extends fha {
      @Override
      default fuy bake(Function<fhc, fuy> $$0) {
         return fuz.b;
      }
   }
}
