import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aon(chl b) {
   private static final Codec<aon> c = RecordCodecBuilder.create($$0 -> $$0.group(chn.f.fieldOf("enabled").forGetter(aon::a)).apply($$0, aon::new));
   public static final apd<aon> a = apd.a("features", c);

   public chl a() {
      return this.b;
   }
}
