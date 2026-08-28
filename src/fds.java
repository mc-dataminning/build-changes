import java.util.function.Function;

public interface fds {
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

   fro bake(Function<fdu, fro> var1);

   public interface a extends fds {
      @Override
      default fro bake(Function<fdu, fro> $$0) {
         return frp.b;
      }
   }
}
