import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface fec extends fau, Predicate<fat> {
   Codec<fec> d = mh.F.q().dispatch("condition", fec::b, fed::a);
   Codec<fec> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, fdp.b));
   Codec<jg<fec>> f = aln.a(mi.bt, e);

   fed b();

   @FunctionalInterface
   public interface a {
      fec build();

      default fec.a invert() {
         return fdz.a(this);
      }

      default fdq.a or(fec.a $$0) {
         return fdq.a(this, $$0);
      }

      default fdp.a and(fec.a $$0) {
         return fdp.a(this, $$0);
      }
   }
}
