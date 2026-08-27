import java.util.function.Function;

public interface ejt {
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

   evk bake(Function<ejv, evk> var1);

   public interface a extends ejt {
      @Override
      default evk bake(Function<ejv, evk> $$0) {
         return evl.a;
      }
   }
}
