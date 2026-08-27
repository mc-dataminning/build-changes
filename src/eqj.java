import java.util.function.Function;

public interface eqj {
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

   fci bake(Function<eql, fci> var1);

   public interface a extends eqj {
      @Override
      default fci bake(Function<eql, fci> $$0) {
         return fcj.a;
      }
   }
}
