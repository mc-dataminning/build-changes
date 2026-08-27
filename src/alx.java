import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record alx(cdv b) {
   private static final Codec<alx> c = RecordCodecBuilder.create($$0 -> $$0.group(cdx.e.fieldOf("enabled").forGetter(alx::a)).apply($$0, alx::new));
   public static final amn<alx> a = amn.a("features", c);

   public cdv a() {
      return this.b;
   }
}
