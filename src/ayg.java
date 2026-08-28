import com.mojang.serialization.MapCodec;

public record ayg<A>(MapCodec<A> a) {
   public static <A> ayg<A> a(MapCodec<A> $$0) {
      return new ayg<>($$0);
   }
}
