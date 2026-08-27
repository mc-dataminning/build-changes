import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record axg<A>(Codec<A> a) {
   @Deprecated
   public static <A> axg<A> a(Codec<A> $$0) {
      return new axg<>($$0);
   }

   public static <A> axg<A> a(MapCodec<A> $$0) {
      return new axg<>($$0.codec());
   }
}
