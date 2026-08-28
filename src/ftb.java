import java.util.Objects;
import org.joml.Matrix4f;

public interface ftb {
   static ftb a(ayv $$0) {
      return new fta($$0);
   }

   static ftb a(ctq $$0) {
      Objects.requireNonNull($$0);

      return (ftb)(switch ($$0) {
         case ctp $$1 -> new fsz($$1.a());
         case fsy.a $$2 -> new fsy($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fkk var1);

   int b(fkk var1);

   default boolean a() {
      return false;
   }

   default void a(fkk $$0, int $$1, int $$2, Matrix4f $$3, ghw.a $$4) {
   }

   default void a(fkk $$0, int $$1, int $$2, int $$3, int $$4, fkm $$5) {
   }
}
