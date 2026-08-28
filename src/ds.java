import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ds<T>(axr<T> a, boolean b) {
   public static <T> Codec<ds<T>> a(alf<? extends jr<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(axr.a($$0).fieldOf("id").forGetter(ds::a), Codec.BOOL.fieldOf("expected").forGetter(ds::b)).apply($$1, ds::new)
      );
   }

   public static <T> ds<T> a(axr<T> $$0) {
      return new ds<>($$0, true);
   }

   public static <T> ds<T> b(axr<T> $$0) {
      return new ds<>($$0, false);
   }

   public boolean a(je<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
