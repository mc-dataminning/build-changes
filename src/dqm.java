import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqm(drv b) implements dpu {
   public static final Codec<dqm> a = RecordCodecBuilder.create($$0 -> $$0.group(drv.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dqm::new));

   public drv a() {
      return this.b;
   }
}
