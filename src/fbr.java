import java.util.function.Function;

public interface fbr {
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

   fnv bake(Function<fbt, fnv> var1);

   public interface a extends fbr {
      @Override
      default fnv bake(Function<fbt, fnv> $$0) {
         return fnw.a;
      }
   }
}
