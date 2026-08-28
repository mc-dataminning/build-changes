import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asm(cpl b) {
   private static final Codec<asm> c = RecordCodecBuilder.create($$0 -> $$0.group(cpn.e.fieldOf("enabled").forGetter(asm::a)).apply($$0, asm::new));
   public static final ate<asm> a = ate.a("features", c);

   public cpl a() {
      return this.b;
   }
}
