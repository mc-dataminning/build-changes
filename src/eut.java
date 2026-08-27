import java.util.function.Function;

public interface eut {
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

   fgt bake(Function<euv, fgt> var1);

   public interface a extends eut {
      @Override
      default fgt bake(Function<euv, fgt> $$0) {
         return fgu.a;
      }
   }
}
