import com.mojang.serialization.MapCodec;

public record ayv<A>(MapCodec<A> a) {
   public static <A> ayv<A> a(MapCodec<A> $$0) {
      return new ayv<>($$0);
   }
}
