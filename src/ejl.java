import java.util.function.Function;

public interface ejl {
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

   evd bake(Function<ejn, evd> var1);

   public interface a extends ejl {
      @Override
      default evd bake(Function<ejn, evd> $$0) {
         return eve.a;
      }
   }
}
