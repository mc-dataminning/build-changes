import java.util.function.Function;

public interface elm {
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

   exf bake(Function<elo, exf> var1);

   public interface a extends elm {
      @Override
      default exf bake(Function<elo, exf> $$0) {
         return exg.a;
      }
   }
}
