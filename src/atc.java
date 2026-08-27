import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record atc<A>(Codec<A> a) {
   @Deprecated
   public static <A> atc<A> a(Codec<A> $$0) {
      return new atc<>($$0);
   }

   public static <A> atc<A> a(MapCodec<A> $$0) {
      return new atc<>($$0.codec());
   }
}
