import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record aou<A>(Codec<A> a) {
   public static <A> aou<A> a(Codec<A> $$0) {
      return new aou<>($$0);
   }

   public static <A> aou<A> a(MapCodec<A> $$0) {
      return new aou<>($$0.codec());
   }
}
