import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record axe<A>(Codec<A> a) {
   @Deprecated
   public static <A> axe<A> a(Codec<A> $$0) {
      return new axe<>($$0);
   }

   public static <A> axe<A> a(MapCodec<A> $$0) {
      return new axe<>($$0.codec());
   }
}
