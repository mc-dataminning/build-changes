import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aos(chr b) {
   private static final Codec<aos> c = RecordCodecBuilder.create($$0 -> $$0.group(cht.f.fieldOf("enabled").forGetter(aos::a)).apply($$0, aos::new));
   public static final api<aos> a = api.a("features", c);

   public chr a() {
      return this.b;
   }
}
