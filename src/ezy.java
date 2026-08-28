import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface ezy extends ewq, Predicate<ewp> {
   Codec<ezy> d = ma.F.q().dispatch("condition", ezy::b, ezz::a);
   Codec<ezy> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, ezl.b));
   Codec<jq<ezy>> f = alv.a(mb.bi, e);

   ezz b();

   @FunctionalInterface
   public interface a {
      ezy build();

      default ezy.a invert() {
         return ezv.a(this);
      }

      default ezm.a or(ezy.a $$0) {
         return ezm.a(this, $$0);
      }

      default ezl.a and(ezy.a $$0) {
         return ezl.a(this, $$0);
      }
   }
}
