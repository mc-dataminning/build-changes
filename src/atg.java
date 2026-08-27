import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record atg<A>(Codec<A> a) {
   @Deprecated
   public static <A> atg<A> a(Codec<A> $$0) {
      return new atg<>($$0);
   }

   public static <A> atg<A> a(MapCodec<A> $$0) {
      return new atg<>($$0.codec());
   }
}
