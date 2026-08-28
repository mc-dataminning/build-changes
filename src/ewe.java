import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface ewe extends esu, Predicate<est> {
   Codec<ewe> d = lu.F.q().dispatch("condition", ewe::b, ewf::a);
   Codec<ewe> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, evr.b));
   Codec<jn<ewe>> f = akx.a(lv.be, e);

   ewf b();

   @FunctionalInterface
   public interface a {
      ewe build();

      default ewe.a invert() {
         return ewb.a(this);
      }

      default evs.a or(ewe.a $$0) {
         return evs.a(this, $$0);
      }

      default evr.a and(ewe.a $$0) {
         return evr.a(this, $$0);
      }
   }
}
