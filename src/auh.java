import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record auh<A>(Codec<A> a) {
   @Deprecated
   public static <A> auh<A> a(Codec<A> $$0) {
      return new auh<>($$0);
   }

   public static <A> auh<A> a(MapCodec<A> $$0) {
      return new auh<>($$0.codec());
   }
}
