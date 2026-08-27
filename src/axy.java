import com.mojang.serialization.MapCodec;

public record axy<A>(MapCodec<A> a) {
   public static <A> axy<A> a(MapCodec<A> $$0) {
      return new axy<>($$0);
   }
}
