import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqj(drs b) implements dpr {
   public static final Codec<dqj> a = RecordCodecBuilder.create($$0 -> $$0.group(drs.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dqj::new));

   public drs a() {
      return this.b;
   }
}
