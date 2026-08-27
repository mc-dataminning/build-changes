import java.util.function.Function;

public interface erf {
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

   fde bake(Function<erh, fde> var1);

   public interface a extends erf {
      @Override
      default fde bake(Function<erh, fde> $$0) {
         return fdf.a;
      }
   }
}
