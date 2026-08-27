import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record auj<A>(Codec<A> a) {
   @Deprecated
   public static <A> auj<A> a(Codec<A> $$0) {
      return new auj<>($$0);
   }

   public static <A> auj<A> a(MapCodec<A> $$0) {
      return new auj<>($$0.codec());
   }
}
