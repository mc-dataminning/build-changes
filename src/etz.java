import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface etz extends eqp, Predicate<eqo> {
   Codec<etz> d = lq.F.r().dispatch("condition", etz::b, eua::a);
   Codec<etz> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, etm.b));
   Codec<jj<etz>> f = akg.a(lr.bd, e);

   eua b();

   @FunctionalInterface
   public interface a {
      etz build();

      default etz.a invert() {
         return etw.a(this);
      }

      default etn.a or(etz.a $$0) {
         return etn.a(this, $$0);
      }

      default etm.a and(etz.a $$0) {
         return etm.a(this, $$0);
      }
   }
}
