import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface ezs extends ewi, Predicate<ewh> {
   Codec<ezs> d = ma.F.q().dispatch("condition", ezs::b, ezt::a);
   Codec<ezs> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, ezf.b));
   Codec<jq<ezs>> f = alv.a(mb.bh, e);

   ezt b();

   @FunctionalInterface
   public interface a {
      ezs build();

      default ezs.a invert() {
         return ezp.a(this);
      }

      default ezg.a or(ezs.a $$0) {
         return ezg.a(this, $$0);
      }

      default ezf.a and(ezs.a $$0) {
         return ezf.a(this, $$0);
      }
   }
}
