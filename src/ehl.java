import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehl(eiu b) implements egt {
   public static final Codec<ehl> a = RecordCodecBuilder.create($$0 -> $$0.group(eiu.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, ehl::new));

   public eiu a() {
      return this.b;
   }
}
