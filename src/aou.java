import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aou(cia b) {
   private static final Codec<aou> c = RecordCodecBuilder.create($$0 -> $$0.group(cic.f.fieldOf("enabled").forGetter(aou::a)).apply($$0, aou::new));
   public static final apk<aou> a = apk.a("features", c);

   public cia a() {
      return this.b;
   }
}
