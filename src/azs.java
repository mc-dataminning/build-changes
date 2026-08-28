import com.mojang.serialization.MapCodec;

public record azs<A>(MapCodec<A> a) {
   public static <A> azs<A> a(MapCodec<A> $$0) {
      return new azs<>($$0);
   }
}
