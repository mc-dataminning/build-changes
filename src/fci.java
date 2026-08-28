import java.util.function.Function;

public interface fci {
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

   fot bake(Function<fck, fot> var1);

   public interface a extends fci {
      @Override
      default fot bake(Function<fck, fot> $$0) {
         return fou.a;
      }
   }
}
