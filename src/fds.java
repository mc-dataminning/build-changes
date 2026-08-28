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

   frp bake(Function<fdu, frp> var1);

   public interface a extends fds {
      @Override
      default frp bake(Function<fdu, frp> $$0) {
         return frq.b;
      }
   }
}
