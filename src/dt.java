import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dt<T>(axr<T> a, boolean b) {
   public static <T> Codec<dt<T>> a(alf<? extends js<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(axr.a($$0).fieldOf("id").forGetter(dt::a), Codec.BOOL.fieldOf("expected").forGetter(dt::b)).apply($$1, dt::new)
      );
   }

   public static <T> dt<T> a(axr<T> $$0) {
      return new dt<>($$0, true);
   }

   public static <T> dt<T> b(axr<T> $$0) {
      return new dt<>($$0, false);
   }

   public boolean a(jf<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
