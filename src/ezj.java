import java.util.function.Function;

public interface ezj {
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

   flf bake(Function<ezl, flf> var1);

   public interface a extends ezj {
      @Override
      default flf bake(Function<ezl, flf> $$0) {
         return flg.a;
      }
   }
}
