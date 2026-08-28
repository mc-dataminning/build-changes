import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface eva extends erq, Predicate<erp> {
   Codec<eva> d = lt.F.r().dispatch("condition", eva::b, evb::a);
   Codec<eva> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, eun.b));
   Codec<jm<eva>> f = akn.a(lu.be, e);

   evb b();

   @FunctionalInterface
   public interface a {
      eva build();

      default eva.a invert() {
         return eux.a(this);
      }

      default euo.a or(eva.a $$0) {
         return euo.a(this, $$0);
      }

      default eun.a and(eva.a $$0) {
         return eun.a(this, $$0);
      }
   }
}
