import java.util.function.Function;

public interface fbg {
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

   fnk bake(Function<fbi, fnk> var1);

   public interface a extends fbg {
      @Override
      default fnk bake(Function<fbi, fnk> $$0) {
         return fnl.a;
      }
   }
}
