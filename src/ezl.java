import java.util.function.Function;

public interface ezl {
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

   flh bake(Function<ezn, flh> var1);

   public interface a extends ezl {
      @Override
      default flh bake(Function<ezn, flh> $$0) {
         return fli.a;
      }
   }
}
