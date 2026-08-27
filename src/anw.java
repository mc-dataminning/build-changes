import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record anw(cgi b) {
   private static final Codec<anw> c = RecordCodecBuilder.create($$0 -> $$0.group(cgk.f.fieldOf("enabled").forGetter(anw::a)).apply($$0, anw::new));
   public static final aom<anw> a = aom.a("features", c);

   public cgi a() {
      return this.b;
   }
}
