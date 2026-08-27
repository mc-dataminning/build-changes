import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqn(drw b) implements dpv {
   public static final Codec<dqn> a = RecordCodecBuilder.create($$0 -> $$0.group(drw.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dqn::new));

   public drw a() {
      return this.b;
   }
}
