import java.util.function.Function;

public interface eww {
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

   fiv bake(Function<ewy, fiv> var1);

   public interface a extends eww {
      @Override
      default fiv bake(Function<ewy, fiv> $$0) {
         return fiw.a;
      }
   }
}
