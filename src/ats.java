import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record ats<A>(Codec<A> a) {
   @Deprecated
   public static <A> ats<A> a(Codec<A> $$0) {
      return new ats<>($$0);
   }

   public static <A> ats<A> a(MapCodec<A> $$0) {
      return new ats<>($$0.codec());
   }
}
