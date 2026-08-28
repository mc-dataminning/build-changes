import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ea<T>(awm<T> a, boolean b) {
   public static <T> Codec<ea<T>> a(akj<? extends jw<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(awm.a($$0).fieldOf("id").forGetter(ea::a), Codec.BOOL.fieldOf("expected").forGetter(ea::b)).apply($$1, ea::new)
      );
   }

   public static <T> ea<T> a(awm<T> $$0) {
      return new ea<>($$0, true);
   }

   public static <T> ea<T> b(awm<T> $$0) {
      return new ea<>($$0, false);
   }

   public boolean a(jj<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
