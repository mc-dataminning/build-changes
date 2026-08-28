import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface fci extends eza, Predicate<eyz> {
   Codec<fci> d = mf.F.q().dispatch("condition", fci::b, fcj::a);
   Codec<fci> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, fbv.b));
   Codec<je<fci>> f = alc.a(mg.br, e);

   fcj b();

   @FunctionalInterface
   public interface a {
      fci build();

      default fci.a invert() {
         return fcf.a(this);
      }

      default fbw.a or(fci.a $$0) {
         return fbw.a(this, $$0);
      }

      default fbv.a and(fci.a $$0) {
         return fbv.a(this, $$0);
      }
   }
}
