import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ef<T>(axp<T> a, boolean b) {
   public static <T> Codec<ef<T>> a(alg<? extends kc<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(axp.a($$0).fieldOf("id").forGetter(ef::a), Codec.BOOL.fieldOf("expected").forGetter(ef::b)).apply($$1, ef::new)
      );
   }

   public static <T> ef<T> a(axp<T> $$0) {
      return new ef<>($$0, true);
   }

   public static <T> ef<T> b(axp<T> $$0) {
      return new ef<>($$0, false);
   }

   public boolean a(jp<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
