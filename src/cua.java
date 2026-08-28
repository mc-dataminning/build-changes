import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cua<T>(T a, ix b) {
   public cua(T $$0, alk $$1) {
      this($$0, new ix($$1));
   }

   public static <T> MapCodec<cua<T>> a(Codec<T> $$0, T $$1) {
      return RecordCodecBuilder.mapCodec($$2 -> $$2.group($$0.optionalFieldOf("model", $$1).forGetter(cua::a), ix.b.forGetter(cua::b)).apply($$2, cua::new));
   }

   public static <T> za<wn, cua<T>> a(za<? super wn, T> $$0) {
      return za.a($$0, cua::a, ix.c, cua::b, cua::new);
   }
}
