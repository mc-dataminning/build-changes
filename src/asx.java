import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asx(crr b) {
   private static final Codec<asx> c = RecordCodecBuilder.create($$0 -> $$0.group(crt.f.fieldOf("enabled").forGetter(asx::a)).apply($$0, asx::new));
   public static final ato<asx> a = new ato<>("features", c);

   public crr a() {
      return this.b;
   }
}
