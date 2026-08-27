import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record awb<A>(Codec<A> a) {
   @Deprecated
   public static <A> awb<A> a(Codec<A> $$0) {
      return new awb<>($$0);
   }

   public static <A> awb<A> a(MapCodec<A> $$0) {
      return new awb<>($$0.codec());
   }
}
