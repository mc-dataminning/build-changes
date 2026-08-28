import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record be<T, P extends Predicate<T>>(Optional<bc<T, P>> a, Optional<bd<T, P>> b, Optional<dj.d> c) implements Predicate<Iterable<T>> {
   public static <T, P extends Predicate<T>> Codec<be<T, P>> a(Codec<P> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(
                  bc.a($$0).optionalFieldOf("contains").forGetter(be::a),
                  bd.a($$0).optionalFieldOf("count").forGetter(be::b),
                  dj.d.d.optionalFieldOf("size").forGetter(be::c)
               )
               .apply($$1, be::new)
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
