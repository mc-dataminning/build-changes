import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dty(dvh b) implements dtg {
   public static final Codec<dty> a = RecordCodecBuilder.create($$0 -> $$0.group(dvh.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dty::new));

   public dvh a() {
      return this.b;
   }
}
