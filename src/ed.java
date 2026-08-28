import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ed<T>(axj<T> a, boolean b) {
   public static <T> Codec<ed<T>> a(alb<? extends ka<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(axj.a($$0).fieldOf("id").forGetter(ed::a), Codec.BOOL.fieldOf("expected").forGetter(ed::b)).apply($$1, ed::new)
      );
   }

   public static <T> ed<T> a(axj<T> $$0) {
      return new ed<>($$0, true);
   }

   public static <T> ed<T> b(axj<T> $$0) {
      return new ed<>($$0, false);
   }

   public boolean a(jn<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
