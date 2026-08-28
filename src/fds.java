import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface fds extends fak, Predicate<faj> {
   Codec<fds> d = mh.F.q().dispatch("condition", fds::b, fdt::a);
   Codec<fds> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, fdf.b));
   Codec<jg<fds>> f = alg.a(mi.bt, e);

   fdt b();

   @FunctionalInterface
   public interface a {
      fds build();

      default fds.a invert() {
         return fdp.a(this);
      }

      default fdg.a or(fds.a $$0) {
         return fdg.a(this, $$0);
      }

      default fdf.a and(fds.a $$0) {
         return fdf.a(this, $$0);
      }
   }
}
