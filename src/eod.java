import java.util.function.Function;

public interface eod {
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

   ezz bake(Function<eof, ezz> var1);

   public interface a extends eod {
      @Override
      default ezz bake(Function<eof, ezz> $$0) {
         return faa.a;
      }
   }
}
