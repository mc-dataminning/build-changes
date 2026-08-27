import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aot(chs b) {
   private static final Codec<aot> c = RecordCodecBuilder.create($$0 -> $$0.group(chu.f.fieldOf("enabled").forGetter(aot::a)).apply($$0, aot::new));
   public static final apj<aot> a = apj.a("features", c);

   public chs a() {
      return this.b;
   }
}
