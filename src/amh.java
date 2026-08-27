import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record amh(cei b) {
   private static final Codec<amh> c = RecordCodecBuilder.create($$0 -> $$0.group(cek.e.fieldOf("enabled").forGetter(amh::a)).apply($$0, amh::new));
   public static final amx<amh> a = amx.a("features", c);

   public cei a() {
      return this.b;
   }
}
