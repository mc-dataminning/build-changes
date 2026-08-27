import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record axq<A>(Codec<A> a) {
   @Deprecated
   public static <A> axq<A> a(Codec<A> $$0) {
      return new axq<>($$0);
   }

   public static <A> axq<A> a(MapCodec<A> $$0) {
      return new axq<>($$0.codec());
   }
}
