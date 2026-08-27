import com.mojang.serialization.MapCodec;

public record axx<A>(MapCodec<A> a) {
   public static <A> axx<A> a(MapCodec<A> $$0) {
      return new axx<>($$0);
   }
}
