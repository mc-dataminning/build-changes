import java.util.function.Function;

public interface enf {
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

   eza bake(Function<enh, eza> var1);

   public interface a extends enf {
      @Override
      default eza bake(Function<enh, eza> $$0) {
         return ezb.a;
      }
   }
}
