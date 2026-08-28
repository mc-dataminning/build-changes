import java.util.Objects;
import org.joml.Matrix4f;

public interface ftj {
   static ftj a(ayw $$0) {
      return new fti($$0);
   }

   static ftj a(ctv $$0) {
      Objects.requireNonNull($$0);

      return (ftj)(switch ($$0) {
         case ctu $$1 -> new fth($$1.a());
         case ftg.a $$2 -> new ftg($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fks var1);

   int b(fks var1);

   default boolean a() {
      return false;
   }

   default void a(fks $$0, int $$1, int $$2, Matrix4f $$3, gih.a $$4) {
   }

   default void a(fks $$0, int $$1, int $$2, int $$3, int $$4, fku $$5) {
   }
}
