import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface eyy extends evq, Predicate<evp> {
   Codec<eyy> d = mb.F.q().dispatch("condition", eyy::b, eyz::a);
   Codec<eyy> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, eyl.b));
   Codec<jr<eyy>> f = akq.a(mc.bi, e);

   eyz b();

   @FunctionalInterface
   public interface a {
      eyy build();

      default eyy.a invert() {
         return eyv.a(this);
      }

      default eym.a or(eyy.a $$0) {
         return eym.a(this, $$0);
      }

      default eyl.a and(eyy.a $$0) {
         return eyl.a(this, $$0);
      }
   }
}
