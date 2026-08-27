import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record awq<A>(Codec<A> a) {
   @Deprecated
   public static <A> awq<A> a(Codec<A> $$0) {
      return new awq<>($$0);
   }

   public static <A> awq<A> a(MapCodec<A> $$0) {
      return new awq<>($$0.codec());
   }
}
