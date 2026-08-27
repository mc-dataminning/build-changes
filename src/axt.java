import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record axt<A>(Codec<A> a) {
   @Deprecated
   public static <A> axt<A> a(Codec<A> $$0) {
      return new axt<>($$0);
   }

   public static <A> axt<A> a(MapCodec<A> $$0) {
      return new axt<>($$0.codec());
   }
}
