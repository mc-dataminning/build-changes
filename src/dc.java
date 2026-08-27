import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dc<T>(aqi<T> a, boolean b) {
   public static <T> Codec<dc<T>> a(aew<? extends ht<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(aqi.a($$0).fieldOf("id").forGetter(dc::a), Codec.BOOL.fieldOf("expected").forGetter(dc::b)).apply($$1, dc::new)
      );
   }

   public static <T> dc<T> a(aqi<T> $$0) {
      return new dc<>($$0, true);
   }

   public static <T> dc<T> b(aqi<T> $$0) {
      return new dc<>($$0, false);
   }

   public boolean a(hg<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
