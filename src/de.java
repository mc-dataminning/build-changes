import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record de<T>(avt<T> a, boolean b) {
   public static <T> Codec<de<T>> a(aju<? extends ja<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(avt.a($$0).fieldOf("id").forGetter(de::a), Codec.BOOL.fieldOf("expected").forGetter(de::b)).apply($$1, de::new)
      );
   }

   public static <T> de<T> a(avt<T> $$0) {
      return new de<>($$0, true);
   }

   public static <T> de<T> b(avt<T> $$0) {
      return new de<>($$0, false);
   }

   public boolean a(in<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
