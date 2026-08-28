import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface exn extends eud, Predicate<euc> {
   Codec<exn> d = ly.F.q().dispatch("condition", exn::b, exo::a);
   Codec<exn> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, exa.b));
   Codec<jq<exn>> f = ale.a(lz.bf, e);

   exo b();

   @FunctionalInterface
   public interface a {
      exn build();

      default exn.a invert() {
         return exk.a(this);
      }

      default exb.a or(exn.a $$0) {
         return exb.a(this, $$0);
      }

      default exa.a and(exn.a $$0) {
         return exa.a(this, $$0);
      }
   }
}
