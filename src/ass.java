import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record ass<A>(Codec<A> a) {
   @Deprecated
   public static <A> ass<A> a(Codec<A> $$0) {
      return new ass<>($$0);
   }

   public static <A> ass<A> a(MapCodec<A> $$0) {
      return new ass<>($$0.codec());
   }
}
