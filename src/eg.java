import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eg<T>(ayk<T> a, boolean b) {
   public static <T> Codec<eg<T>> a(aly<? extends kd<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(ayk.a($$0).fieldOf("id").forGetter(eg::a), Codec.BOOL.fieldOf("expected").forGetter(eg::b)).apply($$1, eg::new)
      );
   }

   public static <T> eg<T> a(ayk<T> $$0) {
      return new eg<>($$0, true);
   }

   public static <T> eg<T> b(ayk<T> $$0) {
      return new eg<>($$0, false);
   }

   public boolean a(jq<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
