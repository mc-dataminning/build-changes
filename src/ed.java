import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ed<T>(awt<T> a, boolean b) {
   public static <T> Codec<ed<T>> a(akp<? extends jz<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(awt.a($$0).fieldOf("id").forGetter(ed::a), Codec.BOOL.fieldOf("expected").forGetter(ed::b)).apply($$1, ed::new)
      );
   }

   public static <T> ed<T> a(awt<T> $$0) {
      return new ed<>($$0, true);
   }

   public static <T> ed<T> b(awt<T> $$0) {
      return new ed<>($$0, false);
   }

   public boolean a(jm<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
