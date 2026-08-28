import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface fbw extends eyo, Predicate<eyn> {
   Codec<fbw> d = mf.F.q().dispatch("condition", fbw::b, fbx::a);
   Codec<fbw> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, fbj.b));
   Codec<je<fbw>> f = ala.a(mg.bq, e);

   fbx b();

   @FunctionalInterface
   public interface a {
      fbw build();

      default fbw.a invert() {
         return fbt.a(this);
      }

      default fbk.a or(fbw.a $$0) {
         return fbk.a(this, $$0);
      }

      default fbj.a and(fbw.a $$0) {
         return fbj.a(this, $$0);
      }
   }
}
