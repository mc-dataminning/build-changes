import com.mojang.serialization.MapCodec;

public record ayh<A>(MapCodec<A> a) {
   public static <A> ayh<A> a(MapCodec<A> $$0) {
      return new ayh<>($$0);
   }
}
