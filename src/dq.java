import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dq<T>(awt<T> a, boolean b) {
   public static <T> Codec<dq<T>> a(aks<? extends jn<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(awt.a($$0).fieldOf("id").forGetter(dq::a), Codec.BOOL.fieldOf("expected").forGetter(dq::b)).apply($$1, dq::new)
      );
   }

   public static <T> dq<T> a(awt<T> $$0) {
      return new dq<>($$0, true);
   }

   public static <T> dq<T> b(awt<T> $$0) {
      return new dq<>($$0, false);
   }

   public boolean a(ja<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
