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

   fsm bake(Function<fer, fsm> var1);

   public interface a extends fep {
      @Override
      default fsm bake(Function<fer, fsm> $$0) {
         return fsn.b;
      }
   }
}
