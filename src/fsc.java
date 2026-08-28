import java.util.Objects;
import org.joml.Matrix4f;

public interface fsc {
   static fsc a(ayo $$0) {
      return new fsb($$0);
   }

   static fsc a(csx $$0) {
      Objects.requireNonNull($$0);

      return (fsc)(switch ($$0) {
         case csw $$1 -> new fsa($$1.a());
         case frz.a $$2 -> new frz($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fjl var1);

   int b(fjl var1);

   default boolean a() {
      return false;
   }

   default void a(fjl $$0, int $$1, int $$2, Matrix4f $$3, ggv.a $$4) {
   }

   default void a(fjl $$0, int $$1, int $$2, fjn $$3) {
   }
}
