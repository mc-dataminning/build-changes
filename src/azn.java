import com.mojang.serialization.MapCodec;

public record azn<A>(MapCodec<A> a) {
   public static <A> azn<A> a(MapCodec<A> $$0) {
      return new azn<>($$0);
   }
}
