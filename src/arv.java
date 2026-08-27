import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record arv<A>(Codec<A> a) {
   @Deprecated
   public static <A> arv<A> a(Codec<A> $$0) {
      return new arv<>($$0);
   }

   public static <A> arv<A> a(MapCodec<A> $$0) {
      return new arv<>($$0.codec());
   }
}
