import java.util.Objects;
import org.joml.Matrix4f;

public interface fsq {
   static fsq a(ayr $$0) {
      return new fsp($$0);
   }

   static fsq a(ctg $$0) {
      Objects.requireNonNull($$0);

      return (fsq)(switch ($$0) {
         case ctf $$1 -> new fso($$1.a());
         case fsn.a $$2 -> new fsn($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fjz var1);

   int b(fjz var1);

   default boolean a() {
      return false;
   }

   default void a(fjz $$0, int $$1, int $$2, Matrix4f $$3, ghl.a $$4) {
   }

   default void a(fjz $$0, int $$1, int $$2, int $$3, int $$4, fkb $$5) {
   }
}
