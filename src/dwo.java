import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwo(dxx b) implements dvw {
   public static final Codec<dwo> a = RecordCodecBuilder.create($$0 -> $$0.group(dxx.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dwo::new));

   public dxx a() {
      return this.b;
   }
}
