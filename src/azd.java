import com.mojang.serialization.MapCodec;

public record azd<A>(MapCodec<A> a) {
   public static <A> azd<A> a(MapCodec<A> $$0) {
      return new azd<>($$0);
   }
}
