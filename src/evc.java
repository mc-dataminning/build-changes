import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface evc extends ers, Predicate<err> {
   Codec<evc> d = lt.F.r().dispatch("condition", evc::b, evd::a);
   Codec<evc> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, eup.b));
   Codec<jm<evc>> f = akn.a(lu.be, e);

   evd b();

   @FunctionalInterface
   public interface a {
      evc build();

      default evc.a invert() {
         return euz.a(this);
      }

      default euq.a or(evc.a $$0) {
         return euq.a(this, $$0);
      }

      default eup.a and(evc.a $$0) {
         return eup.a(this, $$0);
      }
   }
}
