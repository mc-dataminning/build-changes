import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record ars<A>(Codec<A> a) {
   public static <A> ars<A> a(Codec<A> $$0) {
      return new ars<>($$0);
   }

   public static <A> ars<A> a(MapCodec<A> $$0) {
      return new ars<>($$0.codec());
   }
}
