import com.mojang.serialization.MapCodec;

public record ayq<A>(MapCodec<A> a) {
   public static <A> ayq<A> a(MapCodec<A> $$0) {
      return new ayq<>($$0);
   }
}
