import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface ews extends eti, Predicate<eth> {
   Codec<ews> d = lu.F.q().dispatch("condition", ews::b, ewt::a);
   Codec<ews> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, ewf.b));
   Codec<jn<ews>> f = aky.a(lv.bf, e);

   ewt b();

   @FunctionalInterface
   public interface a {
      ews build();

      default ews.a invert() {
         return ewp.a(this);
      }

      default ewg.a or(ews.a $$0) {
         return ewg.a(this, $$0);
      }

      default ewf.a and(ews.a $$0) {
         return ewf.a(this, $$0);
      }
   }
}
