import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dd<T>(aup<T> a, boolean b) {
   public static <T> Codec<dd<T>> a(aix<? extends iv<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(aup.a($$0).fieldOf("id").forGetter(dd::a), Codec.BOOL.fieldOf("expected").forGetter(dd::b)).apply($$1, dd::new)
      );
   }

   public static <T> dd<T> a(aup<T> $$0) {
      return new dd<>($$0, true);
   }

   public static <T> dd<T> b(aup<T> $$0) {
      return new dd<>($$0, false);
   }

   public boolean a(ij<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
