import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dc<T>(arh<T> a, boolean b) {
   public static <T> Codec<dc<T>> a(afv<? extends io<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(arh.a($$0).fieldOf("id").forGetter(dc::a), Codec.BOOL.fieldOf("expected").forGetter(dc::b)).apply($$1, dc::new)
      );
   }

   public static <T> dc<T> a(arh<T> $$0) {
      return new dc<>($$0, true);
   }

   public static <T> dc<T> b(arh<T> $$0) {
      return new dc<>($$0, false);
   }

   public boolean a(ib<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
