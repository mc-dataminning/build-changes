import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface eza extends evs, Predicate<evr> {
   Codec<eza> d = mb.F.q().dispatch("condition", eza::b, ezb::a);
   Codec<eza> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, eyn.b));
   Codec<jr<eza>> f = akq.a(mc.bi, e);

   ezb b();

   @FunctionalInterface
   public interface a {
      eza build();

      default eza.a invert() {
         return eyx.a(this);
      }

      default eyo.a or(eza.a $$0) {
         return eyo.a(this, $$0);
      }

      default eyn.a and(eza.a $$0) {
         return eyn.a(this, $$0);
      }
   }
}
