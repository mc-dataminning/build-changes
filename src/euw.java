import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface euw extends erm, Predicate<erl> {
   Codec<euw> d = lt.F.r().dispatch("condition", euw::b, eux::a);
   Codec<euw> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, euj.b));
   Codec<jm<euw>> f = akm.a(lu.be, e);

   eux b();

   @FunctionalInterface
   public interface a {
      euw build();

      default euw.a invert() {
         return eut.a(this);
      }

      default euk.a or(euw.a $$0) {
         return euk.a(this, $$0);
      }

      default euj.a and(euw.a $$0) {
         return euj.a(this, $$0);
      }
   }
}
