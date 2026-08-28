import com.mojang.serialization.MapCodec;

public record azj<A>(MapCodec<A> a) {
   public static <A> azj<A> a(MapCodec<A> $$0) {
      return new azj<>($$0);
   }
}
