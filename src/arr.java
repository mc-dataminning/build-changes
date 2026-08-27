import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record arr<A>(Codec<A> a) {
   public static <A> arr<A> a(Codec<A> $$0) {
      return new arr<>($$0);
   }

   public static <A> arr<A> a(MapCodec<A> $$0) {
      return new arr<>($$0.codec());
   }
}
