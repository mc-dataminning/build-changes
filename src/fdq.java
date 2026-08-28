import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface fdq extends fai, Predicate<fah> {
   Codec<fdq> d = mg.F.q().dispatch("condition", fdq::b, fdr::a);
   Codec<fdq> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, fdd.b));
   Codec<jf<fdq>> f = ale.a(mh.bt, e);

   fdr b();

   @FunctionalInterface
   public interface a {
      fdq build();

      default fdq.a invert() {
         return fdn.a(this);
      }

      default fde.a or(fdq.a $$0) {
         return fde.a(this, $$0);
      }

      default fdd.a and(fdq.a $$0) {
         return fdd.a(this, $$0);
      }
   }
}
