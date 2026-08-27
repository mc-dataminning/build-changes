import java.util.function.Function;

public interface emd {
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

   exx bake(Function<emf, exx> var1);

   public interface a extends emd {
      @Override
      default exx bake(Function<emf, exx> $$0) {
         return exy.a;
      }
   }
}
