import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface fcq extends ezi, Predicate<ezh> {
   Codec<fcq> d = mf.F.q().dispatch("condition", fcq::b, fcr::a);
   Codec<fcq> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, fcd.b));
   Codec<je<fcq>> f = alc.a(mg.bs, e);

   fcr b();

   @FunctionalInterface
   public interface a {
      fcq build();

      default fcq.a invert() {
         return fcn.a(this);
      }

      default fce.a or(fcq.a $$0) {
         return fce.a(this, $$0);
      }

      default fcd.a and(fcq.a $$0) {
         return fcd.a(this, $$0);
      }
   }
}
