import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aqw(clh b) {
   private static final Codec<aqw> c = RecordCodecBuilder.create($$0 -> $$0.group(clj.f.fieldOf("enabled").forGetter(aqw::a)).apply($$0, aqw::new));
   public static final aro<aqw> a = aro.a("features", c);

   public clh a() {
      return this.b;
   }
}
