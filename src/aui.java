import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record aui<A>(Codec<A> a) {
   @Deprecated
   public static <A> aui<A> a(Codec<A> $$0) {
      return new aui<>($$0);
   }

   public static <A> aui<A> a(MapCodec<A> $$0) {
      return new aui<>($$0.codec());
   }
}
