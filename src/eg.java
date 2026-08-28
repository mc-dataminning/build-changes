import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eg<T>(axs<T> a, boolean b) {
   public static <T> Codec<eg<T>> a(ali<? extends kd<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(axs.a($$0).fieldOf("id").forGetter(eg::a), Codec.BOOL.fieldOf("expected").forGetter(eg::b)).apply($$1, eg::new)
      );
   }

   public static <T> eg<T> a(axs<T> $$0) {
      return new eg<>($$0, true);
   }

   public static <T> eg<T> b(axs<T> $$0) {
      return new eg<>($$0, false);
   }

   public boolean a(jq<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
