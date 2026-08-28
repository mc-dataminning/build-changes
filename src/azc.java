import com.mojang.serialization.MapCodec;

public record azc<A>(MapCodec<A> a) {
   public static <A> azc<A> a(MapCodec<A> $$0) {
      return new azc<>($$0);
   }
}
