import com.mojang.serialization.MapCodec;

public record azf<A>(MapCodec<A> a) {
   public static <A> azf<A> a(MapCodec<A> $$0) {
      return new azf<>($$0);
   }
}
