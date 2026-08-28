import com.mojang.serialization.MapCodec;

public record ayw<A>(MapCodec<A> a) {
   public static <A> ayw<A> a(MapCodec<A> $$0) {
      return new ayw<>($$0);
   }
}
