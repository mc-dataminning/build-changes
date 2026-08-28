import java.util.Objects;
import org.joml.Matrix4f;

public interface fsm {
   static fsm a(ayp $$0) {
      return new fsl($$0);
   }

   static fsm a(ctd $$0) {
      Objects.requireNonNull($$0);

      return (fsm)(switch ($$0) {
         case ctc $$1 -> new fsk($$1.a());
         case fsj.a $$2 -> new fsj($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fjv var1);

   int b(fjv var1);

   default boolean a() {
      return false;
   }

   default void a(fjv $$0, int $$1, int $$2, Matrix4f $$3, ghg.a $$4) {
   }

   default void a(fjv $$0, int $$1, int $$2, fjx $$3) {
   }
}
