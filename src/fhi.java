import java.util.function.Function;

public interface fhi {
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

   fvf bake(Function<fhk, fvf> var1);

   public interface a extends fhi {
      @Override
      default fvf bake(Function<fhk, fvf> $$0) {
         return fvg.b;
      }
   }
}
