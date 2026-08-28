import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface exr extends euh, Predicate<eug> {
   Codec<exr> d = lz.F.q().dispatch("condition", exr::b, exs::a);
   Codec<exr> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, exe.b));
   Codec<jq<exr>> f = alh.a(ma.bf, e);

   exs b();

   @FunctionalInterface
   public interface a {
      exr build();

      default exr.a invert() {
         return exo.a(this);
      }

      default exf.a or(exr.a $$0) {
         return exf.a(this, $$0);
      }

      default exe.a and(exr.a $$0) {
         return exe.a(this, $$0);
      }
   }
}
