import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record asg<T>(T a, Optional<T> b) {
   public static <T> Codec<asg<T>> a(Codec<T> $$0) {
      Codec<asg<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(asg::a), $$0.optionalFieldOf("filtered").forGetter(asg::b)).apply($$1x, asg::new)
      );
      Codec<asg<T>> $$2 = $$0.xmap(asg::a, asg::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> yu<B, asg<T>> a(yu<B, T> $$0) {
      return yu.a($$0, asg::a, $$0.a(ys::a), asg::b, asg::new);
   }

   public static <T> asg<T> a(T $$0) {
      return new asg<>($$0, Optional.empty());
   }

   public static asg<String> a(ash $$0) {
      return new asg<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> asg<U> a(Function<T, U> $$0) {
      return new asg<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<asg<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new asg<>($$1.get(), $$2));
      } else {
         return Optional.of(new asg<>($$1.get(), Optional.empty()));
      }
   }
}
