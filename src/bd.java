import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record bd<T, P extends Predicate<T>>(Optional<bb<T, P>> a, Optional<bc<T, P>> b, Optional<di.d> c) implements Predicate<Iterable<T>> {
   public static <T, P extends Predicate<T>> Codec<bd<T, P>> a(Codec<P> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(
                  bb.a($$0).optionalFieldOf("contains").forGetter(bd::a),
                  bc.a($$0).optionalFieldOf("count").forGetter(bd::b),
                  di.d.d.optionalFieldOf("size").forGetter(bd::c)
               )
               .apply($$1, bd::new)
      );
   }

   public boolean a(Iterable<T> $$0) {
      if (this.a.isPresent() && !this.a.get().test($$0)) {
         return false;
      } else {
         return this.b.isPresent() && !this.b.get().test($$0) ? false : !this.c.isPresent() || this.c.get().d(Iterables.size($$0));
      }
   }
}
