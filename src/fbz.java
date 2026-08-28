import java.util.function.Function;

public interface fbz {
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

   fod bake(Function<fcb, fod> var1);

   public interface a extends fbz {
      @Override
      default fod bake(Function<fcb, fod> $$0) {
         return foe.a;
      }
   }
}
