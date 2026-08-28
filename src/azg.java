import com.mojang.serialization.MapCodec;

public record azg<A>(MapCodec<A> a) {
   public static <A> azg<A> a(MapCodec<A> $$0) {
      return new azg<>($$0);
   }
}
