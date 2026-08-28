import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface fau extends exm, Predicate<exl> {
   Codec<fau> d = md.F.q().dispatch("condition", fau::b, fav::a);
   Codec<fau> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, fah.b));
   Codec<js<fau>> f = akz.a(me.bp, e);

   fav b();

   @FunctionalInterface
   public interface a {
      fau build();

      default fau.a invert() {
         return far.a(this);
      }

      default fai.a or(fau.a $$0) {
         return fai.a(this, $$0);
      }

      default fah.a and(fau.a $$0) {
         return fah.a(this, $$0);
      }
   }
}
