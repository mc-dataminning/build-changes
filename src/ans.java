import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ans(cgd b) {
   private static final Codec<ans> c = RecordCodecBuilder.create($$0 -> $$0.group(cgf.f.fieldOf("enabled").forGetter(ans::a)).apply($$0, ans::new));
   public static final aoi<ans> a = aoi.a("features", c);

   public cgd a() {
      return this.b;
   }
}
