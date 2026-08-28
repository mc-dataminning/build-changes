import java.util.function.Function;

public interface exy {
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

   fjx bake(Function<eya, fjx> var1);

   public interface a extends exy {
      @Override
      default fjx bake(Function<eya, fjx> $$0) {
         return fjy.a;
      }
   }
}
