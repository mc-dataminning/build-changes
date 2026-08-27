import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record ari<A>(Codec<A> a) {
   public static <A> ari<A> a(Codec<A> $$0) {
      return new ari<>($$0);
   }

   public static <A> ari<A> a(MapCodec<A> $$0) {
      return new ari<>($$0.codec());
   }
}
