import com.mojang.serialization.MapCodec;

public record azh<A>(MapCodec<A> a) {
   public static <A> azh<A> a(MapCodec<A> $$0) {
      return new azh<>($$0);
   }
}
