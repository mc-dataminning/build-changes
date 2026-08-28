import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record bf<T, P extends Predicate<T>>(Optional<bd<T, P>> a, Optional<be<T, P>> b, Optional<dk.d> c) implements Predicate<Iterable<T>> {
   public static <T, P extends Predicate<T>> Codec<bf<T, P>> a(Codec<P> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(
                  bd.a($$0).optionalFieldOf("contains").forGetter(bf::a),
                  be.a($$0).optionalFieldOf("count").forGetter(bf::b),
                  dk.d.d.optionalFieldOf("size").forGetter(bf::c)
               )
               .apply($$1, bf::new)
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
