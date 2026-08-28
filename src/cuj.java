import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuj<T>(T a, ix b) {
   public cuj(T $$0, alr $$1) {
      this($$0, new ix($$1));
   }

   public static <T> MapCodec<cuj<T>> a(Codec<T> $$0, T $$1) {
      return RecordCodecBuilder.mapCodec($$2 -> $$2.group($$0.optionalFieldOf("model", $$1).forGetter(cuj::a), ix.b.forGetter(cuj::b)).apply($$2, cuj::new));
   }

   public static <T> ze<wp, cuj<T>> a(ze<? super wp, T> $$0) {
      return ze.a($$0, cuj::a, ix.c, cuj::b, cuj::new);
   }
}
