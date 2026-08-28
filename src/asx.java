import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asx(cpm b) {
   private static final Codec<asx> c = RecordCodecBuilder.create($$0 -> $$0.group(cpo.f.fieldOf("enabled").forGetter(asx::a)).apply($$0, asx::new));
   public static final atp<asx> a = atp.a("features", c);

   public cpm a() {
      return this.b;
   }
}
