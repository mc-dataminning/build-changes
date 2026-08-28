import java.util.function.Function;

public interface fej {
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

   fqv bake(Function<fel, fqv> var1);

   public interface a extends fej {
      @Override
      default fqv bake(Function<fel, fqv> $$0) {
         return fqw.a;
      }
   }
}
