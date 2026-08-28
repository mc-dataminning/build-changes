import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record bc<T, P extends Predicate<T>>(Optional<ba<T, P>> a, Optional<bb<T, P>> b, Optional<de.d> c) implements Predicate<Iterable<T>> {
   public static <T, P extends Predicate<T>> Codec<bc<T, P>> a(Codec<P> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(
                  ba.a($$0).optionalFieldOf("contains").forGetter(bc::a),
                  bb.a($$0).optionalFieldOf("count").forGetter(bc::b),
                  de.d.d.optionalFieldOf("size").forGetter(bc::c)
               )
               .apply($$1, bc::new)
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
