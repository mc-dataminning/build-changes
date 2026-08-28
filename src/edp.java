import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edp(eey b) implements ecx {
   public static final Codec<edp> a = RecordCodecBuilder.create($$0 -> $$0.group(eey.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, edp::new));

   public eey a() {
      return this.b;
   }
}
