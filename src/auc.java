import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record auc<A>(Codec<A> a) {
   @Deprecated
   public static <A> auc<A> a(Codec<A> $$0) {
      return new auc<>($$0);
   }

   public static <A> auc<A> a(MapCodec<A> $$0) {
      return new auc<>($$0.codec());
   }
}
