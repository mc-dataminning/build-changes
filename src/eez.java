import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eez(egi b) implements eeh {
   public static final Codec<eez> a = RecordCodecBuilder.create($$0 -> $$0.group(egi.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, eez::new));

   public egi a() {
      return this.b;
   }
}
