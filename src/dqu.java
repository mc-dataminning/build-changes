import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqu(dsd b) implements dqc {
   public static final Codec<dqu> a = RecordCodecBuilder.create($$0 -> $$0.group(dsd.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dqu::new));

   public dsd a() {
      return this.b;
   }
}
