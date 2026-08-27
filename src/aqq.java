import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aqq(ckl b) {
   private static final Codec<aqq> c = RecordCodecBuilder.create($$0 -> $$0.group(ckn.f.fieldOf("enabled").forGetter(aqq::a)).apply($$0, aqq::new));
   public static final arg<aqq> a = arg.a("features", c);

   public ckl a() {
      return this.b;
   }
}
