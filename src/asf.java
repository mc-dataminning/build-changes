import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asf(col b) {
   private static final Codec<asf> c = RecordCodecBuilder.create($$0 -> $$0.group(coo.f.fieldOf("enabled").forGetter(asf::a)).apply($$0, asf::new));
   public static final asx<asf> a = asx.a("features", c);

   public col a() {
      return this.b;
   }
}
