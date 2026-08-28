import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface eww extends etm, Predicate<etl> {
   Codec<eww> d = lv.F.q().dispatch("condition", eww::b, ewx::a);
   Codec<eww> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, ewj.b));
   Codec<jo<eww>> f = ala.a(lw.bg, e);

   ewx b();

   @FunctionalInterface
   public interface a {
      eww build();

      default eww.a invert() {
         return ewt.a(this);
      }

      default ewk.a or(eww.a $$0) {
         return ewk.a(this, $$0);
      }

      default ewj.a and(eww.a $$0) {
         return ewj.a(this, $$0);
      }
   }
}
