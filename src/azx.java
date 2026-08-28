import com.mojang.serialization.MapCodec;

public record azx<A>(MapCodec<A> a) {
   public static <A> azx<A> a(MapCodec<A> $$0) {
      return new azx<>($$0);
   }
}
