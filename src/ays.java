import com.mojang.serialization.MapCodec;

public record ays<A>(MapCodec<A> a) {
   public static <A> ays<A> a(MapCodec<A> $$0) {
      return new ays<>($$0);
   }
}
