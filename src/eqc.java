import java.util.function.Function;

public interface eqc {
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

   fcb bake(Function<eqe, fcb> var1);

   public interface a extends eqc {
      @Override
      default fcb bake(Function<eqe, fcb> $$0) {
         return fcc.a;
      }
   }
}
