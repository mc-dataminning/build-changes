import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record ayg<A>(Codec<A> a) {
   @Deprecated
   public static <A> ayg<A> a(Codec<A> $$0) {
      return new ayg<>($$0);
   }

   public static <A> ayg<A> a(MapCodec<A> $$0) {
      return new ayg<>($$0.codec());
   }
}
