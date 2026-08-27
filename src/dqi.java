import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqi(drr b) implements dpq {
   public static final Codec<dqi> a = RecordCodecBuilder.create($$0 -> $$0.group(drr.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dqi::new));

   public drr a() {
      return this.b;
   }
}
