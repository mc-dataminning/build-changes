import java.util.function.Function;

public interface eob {
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

   ezx bake(Function<eod, ezx> var1);

   public interface a extends eob {
      @Override
      default ezx bake(Function<eod, ezx> $$0) {
         return ezy.a;
      }
   }
}
