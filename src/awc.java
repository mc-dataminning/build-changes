import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record awc<A>(Codec<A> a) {
   @Deprecated
   public static <A> awc<A> a(Codec<A> $$0) {
      return new awc<>($$0);
   }

   public static <A> awc<A> a(MapCodec<A> $$0) {
      return new awc<>($$0.codec());
   }
}
