import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface ezr extends ewj, Predicate<ewi> {
   Codec<ezr> d = ma.F.q().dispatch("condition", ezr::b, ezs::a);
   Codec<ezr> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, eze.b));
   Codec<jq<ezr>> f = all.a(mb.bi, e);

   ezs b();

   @FunctionalInterface
   public interface a {
      ezr build();

      default ezr.a invert() {
         return ezo.a(this);
      }

      default ezf.a or(ezr.a $$0) {
         return ezf.a(this, $$0);
      }

      default eze.a and(ezr.a $$0) {
         return eze.a(this, $$0);
      }
   }
}
