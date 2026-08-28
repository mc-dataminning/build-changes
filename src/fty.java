import java.util.Objects;
import org.joml.Matrix4f;

public interface fty {
   static fty a(ayz $$0) {
      return new ftx($$0);
   }

   static fty a(ctz $$0) {
      Objects.requireNonNull($$0);

      return (fty)(switch ($$0) {
         case cty $$1 -> new ftw($$1.a());
         case ftv.a $$2 -> new ftv($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(flh var1);

   int b(flh var1);

   default boolean a() {
      return false;
   }

   default void a(flh $$0, int $$1, int $$2, Matrix4f $$3, gix.a $$4) {
   }

   default void a(flh $$0, int $$1, int $$2, int $$3, int $$4, flj $$5) {
   }
}
