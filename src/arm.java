import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record arm<A>(Codec<A> a) {
   public static <A> arm<A> a(Codec<A> $$0) {
      return new arm<>($$0);
   }

   public static <A> arm<A> a(MapCodec<A> $$0) {
      return new arm<>($$0.codec());
   }
}
