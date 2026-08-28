import java.util.function.Function;

public interface exz {
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

   fjy bake(Function<eyb, fjy> var1);

   public interface a extends exz {
      @Override
      default fjy bake(Function<eyb, fjy> $$0) {
         return fjz.a;
      }
   }
}
