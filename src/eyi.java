import java.util.function.Function;

public interface eyi {
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

   fkh bake(Function<eyk, fkh> var1);

   public interface a extends eyi {
      @Override
      default fkh bake(Function<eyk, fkh> $$0) {
         return fki.a;
      }
   }
}
