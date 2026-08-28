import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface exy extends euo, Predicate<eun> {
   Codec<exy> d = lz.F.q().dispatch("condition", exy::b, exz::a);
   Codec<exy> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, exl.b));
   Codec<jq<exy>> f = alf.a(ma.bf, e);

   exz b();

   @FunctionalInterface
   public interface a {
      exy build();

      default exy.a invert() {
         return exv.a(this);
      }

      default exm.a or(exy.a $$0) {
         return exm.a(this, $$0);
      }

      default exl.a and(exy.a $$0) {
         return exl.a(this, $$0);
      }
   }
}
