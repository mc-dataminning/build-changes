import java.util.function.Function;

public interface ely {
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

   exs bake(Function<ema, exs> var1);

   public interface a extends ely {
      @Override
      default exs bake(Function<ema, exs> $$0) {
         return ext.a;
      }
   }
}
