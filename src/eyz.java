import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface eyz extends evr, Predicate<evq> {
   Codec<eyz> d = mb.F.q().dispatch("condition", eyz::b, eza::a);
   Codec<eyz> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, eym.b));
   Codec<jr<eyz>> f = akr.a(mc.bi, e);

   eza b();

   @FunctionalInterface
   public interface a {
      eyz build();

      default eyz.a invert() {
         return eyw.a(this);
      }

      default eyn.a or(eyz.a $$0) {
         return eyn.a(this, $$0);
      }

      default eym.a and(eyz.a $$0) {
         return eym.a(this, $$0);
      }
   }
}
