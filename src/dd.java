import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dd<T>(avr<T> a, boolean b) {
   public static <T> Codec<dd<T>> a(ajs<? extends iy<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(avr.a($$0).fieldOf("id").forGetter(dd::a), Codec.BOOL.fieldOf("expected").forGetter(dd::b)).apply($$1, dd::new)
      );
   }

   public static <T> dd<T> a(avr<T> $$0) {
      return new dd<>($$0, true);
   }

   public static <T> dd<T> b(avr<T> $$0) {
      return new dd<>($$0, false);
   }

   public boolean a(il<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
