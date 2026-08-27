import java.util.function.Function;

public interface eoc {
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

   ezy bake(Function<eoe, ezy> var1);

   public interface a extends eoc {
      @Override
      default ezy bake(Function<eoe, ezy> $$0) {
         return ezz.a;
      }
   }
}
