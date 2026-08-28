import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface ezx extends ewp, Predicate<ewo> {
   Codec<ezx> d = mb.F.q().dispatch("condition", ezx::b, ezy::a);
   Codec<ezx> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, ezk.b));
   Codec<jr<ezx>> f = akq.a(mc.bk, e);

   ezy b();

   @FunctionalInterface
   public interface a {
      ezx build();

      default ezx.a invert() {
         return ezu.a(this);
      }

      default ezl.a or(ezx.a $$0) {
         return ezl.a(this, $$0);
      }

      default ezk.a and(ezx.a $$0) {
         return ezk.a(this, $$0);
      }
   }
}
