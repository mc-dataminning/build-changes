import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface euf extends eqv, Predicate<equ> {
   Codec<euf> d = lq.F.r().dispatch("condition", euf::b, eug::a);
   Codec<euf> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, ets.b));
   Codec<jj<euf>> f = akg.a(lr.bd, e);

   eug b();

   @FunctionalInterface
   public interface a {
      euf build();

      default euf.a invert() {
         return euc.a(this);
      }

      default ett.a or(euf.a $$0) {
         return ett.a(this, $$0);
      }

      default ets.a and(euf.a $$0) {
         return ets.a(this, $$0);
      }
   }
}
