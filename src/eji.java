import java.util.function.Function;

public interface eji {
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

   euy bake(Function<ejk, euy> var1);

   public interface a extends eji {
      @Override
      default euy bake(Function<ejk, euy> $$0) {
         return euz.a;
      }
   }
}
