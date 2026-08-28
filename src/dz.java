import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dz<T>(axb<T> a, boolean b) {
   public static <T> Codec<dz<T>> a(ala<? extends jv<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(axb.a($$0).fieldOf("id").forGetter(dz::a), Codec.BOOL.fieldOf("expected").forGetter(dz::b)).apply($$1, dz::new)
      );
   }

   public static <T> dz<T> a(axb<T> $$0) {
      return new dz<>($$0, true);
   }

   public static <T> dz<T> b(axb<T> $$0) {
      return new dz<>($$0, false);
   }

   public boolean a(ji<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
