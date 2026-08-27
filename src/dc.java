import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dc<T>(aqk<T> a, boolean b) {
   public static <T> Codec<dc<T>> a(aey<? extends hq<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(aqk.a($$0).fieldOf("id").forGetter(dc::a), Codec.BOOL.fieldOf("expected").forGetter(dc::b)).apply($$1, dc::new)
      );
   }

   public static <T> dc<T> a(aqk<T> $$0) {
      return new dc<>($$0, true);
   }

   public static <T> dc<T> b(aqk<T> $$0) {
      return new dc<>($$0, false);
   }

   public boolean a(he<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
