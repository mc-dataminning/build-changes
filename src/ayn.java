import com.mojang.serialization.MapCodec;

public record ayn<A>(MapCodec<A> a) {
   public static <A> ayn<A> a(MapCodec<A> $$0) {
      return new ayn<>($$0);
   }
}
