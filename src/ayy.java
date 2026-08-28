import com.mojang.serialization.MapCodec;

public record ayy<A>(MapCodec<A> a) {
   public static <A> ayy<A> a(MapCodec<A> $$0) {
      return new ayy<>($$0);
   }
}
