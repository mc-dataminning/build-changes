import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aod(chb b) {
   private static final Codec<aod> c = RecordCodecBuilder.create($$0 -> $$0.group(chd.f.fieldOf("enabled").forGetter(aod::a)).apply($$0, aod::new));
   public static final aot<aod> a = aot.a("features", c);

   public chb a() {
      return this.b;
   }
}
