import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface euh extends eqx, Predicate<eqw> {
   Codec<euh> d = lq.F.r().dispatch("condition", euh::b, eui::a);
   Codec<euh> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, etu.b));
   Codec<jj<euh>> f = akg.a(lr.bd, e);

   eui b();

   @FunctionalInterface
   public interface a {
      euh build();

      default euh.a invert() {
         return eue.a(this);
      }

      default etv.a or(euh.a $$0) {
         return etv.a(this, $$0);
      }

      default etu.a and(euh.a $$0) {
         return etu.a(this, $$0);
      }
   }
}
