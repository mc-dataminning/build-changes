import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dm<T>(awg<T> a, boolean b) {
   public static <T> Codec<dm<T>> a(akg<? extends jj<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(awg.a($$0).fieldOf("id").forGetter(dm::a), Codec.BOOL.fieldOf("expected").forGetter(dm::b)).apply($$1, dm::new)
      );
   }

   public static <T> dm<T> a(awg<T> $$0) {
      return new dm<>($$0, true);
   }

   public static <T> dm<T> b(awg<T> $$0) {
      return new dm<>($$0, false);
   }

   public boolean a(iw<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
