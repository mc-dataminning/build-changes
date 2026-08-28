import com.mojang.serialization.MapCodec;

public record axz<A>(MapCodec<A> a) {
   public static <A> axz<A> a(MapCodec<A> $$0) {
      return new axz<>($$0);
   }
}
