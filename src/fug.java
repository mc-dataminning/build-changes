import java.util.Objects;
import org.joml.Matrix4f;

public interface fug {
   static fug a(ayy $$0) {
      return new fuf($$0);
   }

   static fug a(cug $$0) {
      Objects.requireNonNull($$0);

      return (fug)(switch ($$0) {
         case cuf $$1 -> new fue($$1.a());
         case fud.a $$2 -> new fud($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(flo var1);

   int b(flo var1);

   default boolean a() {
      return false;
   }

   default void a(flo $$0, int $$1, int $$2, Matrix4f $$3, gjg.a $$4) {
   }

   default void a(flo $$0, int $$1, int $$2, int $$3, int $$4, flq $$5) {
   }
}
