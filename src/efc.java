import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efc(egl b) implements eek {
   public static final Codec<efc> a = RecordCodecBuilder.create($$0 -> $$0.group(egl.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, efc::new));

   public egl a() {
      return this.b;
   }
}
