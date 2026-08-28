import com.mojang.serialization.MapCodec;

public record ayr<A>(MapCodec<A> a) {
   public static <A> ayr<A> a(MapCodec<A> $$0) {
      return new ayr<>($$0);
   }
}
