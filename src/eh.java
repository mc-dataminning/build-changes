import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eh<T>(axe<T> a, boolean b) {
   public static <T> Codec<eh<T>> a(akt<? extends ke<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(axe.a($$0).fieldOf("id").forGetter(eh::a), Codec.BOOL.fieldOf("expected").forGetter(eh::b)).apply($$1, eh::new)
      );
   }

   public static <T> eh<T> a(axe<T> $$0) {
      return new eh<>($$0, true);
   }

   public static <T> eh<T> b(axe<T> $$0) {
      return new eh<>($$0, false);
   }

   public boolean a(jr<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
