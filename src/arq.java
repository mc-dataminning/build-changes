import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record arq<A>(Codec<A> a) {
   public static <A> arq<A> a(Codec<A> $$0) {
      return new arq<>($$0);
   }

   public static <A> arq<A> a(MapCodec<A> $$0) {
      return new arq<>($$0.codec());
   }
}
