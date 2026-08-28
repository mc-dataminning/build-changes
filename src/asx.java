import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asx(crt b) {
   private static final Codec<asx> c = RecordCodecBuilder.create($$0 -> $$0.group(crv.f.fieldOf("enabled").forGetter(asx::a)).apply($$0, asx::new));
   public static final atp<asx> a = atp.a("features", c);

   public crt a() {
      return this.b;
   }
}
