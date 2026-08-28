import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface exh extends etx, Predicate<etw> {
   Codec<exh> d = lx.F.q().dispatch("condition", exh::b, exi::a);
   Codec<exh> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, ewu.b));
   Codec<jp<exh>> f = ald.a(ly.bf, e);

   exi b();

   @FunctionalInterface
   public interface a {
      exh build();

      default exh.a invert() {
         return exe.a(this);
      }

      default ewv.a or(exh.a $$0) {
         return ewv.a(this, $$0);
      }

      default ewu.a and(exh.a $$0) {
         return ewu.a(this, $$0);
      }
   }
}
