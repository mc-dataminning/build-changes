import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record atp(cvj b) {
   private static final Codec<atp> c = RecordCodecBuilder.create($$0 -> $$0.group(cvl.f.fieldOf("enabled").forGetter(atp::a)).apply($$0, atp::new));
   public static final aug<atp> a = new aug<>("features", c);

   public cvj a() {
      return this.b;
   }
}
