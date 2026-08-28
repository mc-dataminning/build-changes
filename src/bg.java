import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record bg<T, P extends Predicate<T>>(Optional<be<T, P>> a, Optional<bf<T, P>> b, Optional<cx.d> c) implements Predicate<Iterable<T>> {
   public static <T, P extends Predicate<T>> Codec<bg<T, P>> a(Codec<P> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(
                  be.a($$0).optionalFieldOf("contains").forGetter(bg::a),
                  bf.a($$0).optionalFieldOf("count").forGetter(bg::b),
                  cx.d.d.optionalFieldOf("size").forGetter(bg::c)
               )
               .apply($$1, bg::new)
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
