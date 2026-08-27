import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record da<T>(aqa<T> a, boolean b) {
   public static <T> Codec<da<T>> a(aeq<? extends hr<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(aqa.a($$0).fieldOf("id").forGetter(da::a), Codec.BOOL.fieldOf("expected").forGetter(da::b)).apply($$1, da::new)
      );
   }

   public static <T> da<T> a(aqa<T> $$0) {
      return new da<>($$0, true);
   }

   public static <T> da<T> b(aqa<T> $$0) {
      return new da<>($$0, false);
   }

   public boolean a(he<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
