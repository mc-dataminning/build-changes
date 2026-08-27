import java.util.function.Function;

public interface evp {
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

   fhp bake(Function<evr, fhp> var1);

   public interface a extends evp {
      @Override
      default fhp bake(Function<evr, fhp> $$0) {
         return fhq.a;
      }
   }
}
