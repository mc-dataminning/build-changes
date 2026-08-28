import java.util.function.Function;

public interface ffm {
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

   ftj bake(Function<ffo, ftj> var1);

   public interface a extends ffm {
      @Override
      default ftj bake(Function<ffo, ftj> $$0) {
         return ftk.b;
      }
   }
}
