import java.util.function.Function;

public interface exv {
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

   fju bake(Function<exx, fju> var1);

   public interface a extends exv {
      @Override
      default fju bake(Function<exx, fju> $$0) {
         return fjv.a;
      }
   }
}
