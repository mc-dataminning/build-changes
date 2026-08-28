import java.util.function.Function;

public interface fhv {
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

   fvw bake(Function<fhx, fvw> var1);

   public interface a extends fhv {
      @Override
      default fvw bake(Function<fhx, fvw> $$0) {
         return fvx.b;
      }
   }
}
