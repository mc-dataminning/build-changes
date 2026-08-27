import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record atk<A>(Codec<A> a) {
   @Deprecated
   public static <A> atk<A> a(Codec<A> $$0) {
      return new atk<>($$0);
   }

   public static <A> atk<A> a(MapCodec<A> $$0) {
      return new atk<>($$0.codec());
   }
}
