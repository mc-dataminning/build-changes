import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record arj<A>(Codec<A> a) {
   public static <A> arj<A> a(Codec<A> $$0) {
      return new arj<>($$0);
   }

   public static <A> arj<A> a(MapCodec<A> $$0) {
      return new arj<>($$0.codec());
   }
}
