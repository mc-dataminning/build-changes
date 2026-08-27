import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ane(cfg b) {
   private static final Codec<ane> c = RecordCodecBuilder.create($$0 -> $$0.group(cfi.e.fieldOf("enabled").forGetter(ane::a)).apply($$0, ane::new));
   public static final anu<ane> a = anu.a("features", c);

   public cfg a() {
      return this.b;
   }
}
