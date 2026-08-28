import java.util.function.Function;

public interface eyb {
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

   fka bake(Function<eyd, fka> var1);

   public interface a extends eyb {
      @Override
      default fka bake(Function<eyd, fka> $$0) {
         return fkb.a;
      }
   }
}
