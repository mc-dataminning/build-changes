import java.util.function.Function;

public interface ezf {
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

   flb bake(Function<ezh, flb> var1);

   public interface a extends ezf {
      @Override
      default flb bake(Function<ezh, flb> $$0) {
         return flc.a;
      }
   }
}
