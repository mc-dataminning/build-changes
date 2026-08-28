import java.util.function.Function;

public interface eya {
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

   fjz bake(Function<eyc, fjz> var1);

   public interface a extends eya {
      @Override
      default fjz bake(Function<eyc, fjz> $$0) {
         return fka.a;
      }
   }
}
