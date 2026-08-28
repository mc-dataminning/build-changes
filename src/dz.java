import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dz<T>(axe<T> a, boolean b) {
   public static <T> Codec<dz<T>> a(ald<? extends jv<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(axe.a($$0).fieldOf("id").forGetter(dz::a), Codec.BOOL.fieldOf("expected").forGetter(dz::b)).apply($$1, dz::new)
      );
   }

   public static <T> dz<T> a(axe<T> $$0) {
      return new dz<>($$0, true);
   }

   public static <T> dz<T> b(axe<T> $$0) {
      return new dz<>($$0, false);
   }

   public boolean a(ji<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
