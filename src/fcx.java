import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface fcx extends ezp, Predicate<ezo> {
   Codec<fcx> d = mg.F.q().dispatch("condition", fcx::b, fcy::a);
   Codec<fcx> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, fck.b));
   Codec<jf<fcx>> f = alc.a(mh.bs, e);

   fcy b();

   @FunctionalInterface
   public interface a {
      fcx build();

      default fcx.a invert() {
         return fcu.a(this);
      }

      default fcl.a or(fcx.a $$0) {
         return fcl.a(this, $$0);
      }

      default fck.a and(fcx.a $$0) {
         return fck.a(this, $$0);
      }
   }
}
