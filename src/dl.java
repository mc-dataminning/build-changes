import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dl<T>(awd<T> a, boolean b) {
   public static <T> Codec<dl<T>> a(ake<? extends ji<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(awd.a($$0).fieldOf("id").forGetter(dl::a), Codec.BOOL.fieldOf("expected").forGetter(dl::b)).apply($$1, dl::new)
      );
   }

   public static <T> dl<T> a(awd<T> $$0) {
      return new dl<>($$0, true);
   }

   public static <T> dl<T> b(awd<T> $$0) {
      return new dl<>($$0, false);
   }

   public boolean a(iv<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
