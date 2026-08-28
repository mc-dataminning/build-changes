import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface fdc extends ezu, Predicate<ezt> {
   Codec<fdc> d = mg.F.q().dispatch("condition", fdc::b, fdd::a);
   Codec<fdc> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, fcp.b));
   Codec<jf<fdc>> f = alc.a(mh.bt, e);

   fdd b();

   @FunctionalInterface
   public interface a {
      fdc build();

      default fdc.a invert() {
         return fcz.a(this);
      }

      default fcq.a or(fdc.a $$0) {
         return fcq.a(this, $$0);
      }

      default fcp.a and(fdc.a $$0) {
         return fcp.a(this, $$0);
      }
   }
}
