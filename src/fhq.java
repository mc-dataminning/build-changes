import java.util.function.Function;

public interface fhq {
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

   fvr bake(Function<fhs, fvr> var1);

   public interface a extends fhq {
      @Override
      default fvr bake(Function<fhs, fvr> $$0) {
         return fvs.b;
      }
   }
}
