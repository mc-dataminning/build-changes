import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record awg<A>(Codec<A> a) {
   @Deprecated
   public static <A> awg<A> a(Codec<A> $$0) {
      return new awg<>($$0);
   }

   public static <A> awg<A> a(MapCodec<A> $$0) {
      return new awg<>($$0.codec());
   }
}
