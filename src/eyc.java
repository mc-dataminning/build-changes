import java.util.function.Function;

public interface eyc {
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

   fkb bake(Function<eye, fkb> var1);

   public interface a extends eyc {
      @Override
      default fkb bake(Function<eye, fkb> $$0) {
         return fkc.a;
      }
   }
}
