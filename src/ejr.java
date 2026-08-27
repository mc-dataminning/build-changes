import java.util.function.Function;

public interface ejr {
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

   evi bake(Function<ejt, evi> var1);

   public interface a extends ejr {
      @Override
      default evi bake(Function<ejt, evi> $$0) {
         return evj.a;
      }
   }
}
