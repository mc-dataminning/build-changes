import java.util.function.Function;

public interface fdt {
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

   frq bake(Function<fdv, frq> var1);

   public interface a extends fdt {
      @Override
      default frq bake(Function<fdv, frq> $$0) {
         return frr.b;
      }
   }
}
