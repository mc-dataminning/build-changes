import java.util.function.Function;

public interface fgo {
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

   fum bake(Function<fgq, fum> var1);

   public interface a extends fgo {
      @Override
      default fum bake(Function<fgq, fum> $$0) {
         return fun.b;
      }
   }
}
