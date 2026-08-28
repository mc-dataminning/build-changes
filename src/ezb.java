import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface ezb extends evt, Predicate<evs> {
   Codec<ezb> d = mb.F.q().dispatch("condition", ezb::b, ezc::a);
   Codec<ezb> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, eyo.b));
   Codec<jr<ezb>> f = akr.a(mc.bi, e);

   ezc b();

   @FunctionalInterface
   public interface a {
      ezb build();

      default ezb.a invert() {
         return eyy.a(this);
      }

      default eyp.a or(ezb.a $$0) {
         return eyp.a(this, $$0);
      }

      default eyo.a and(ezb.a $$0) {
         return eyo.a(this, $$0);
      }
   }
}
