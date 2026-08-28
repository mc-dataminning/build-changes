import java.util.function.Function;

public interface fep {
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

   frb bake(Function<fer, frb> var1);

   public interface a extends fep {
      @Override
      default frb bake(Function<fer, frb> $$0) {
         return frc.a;
      }
   }
}
