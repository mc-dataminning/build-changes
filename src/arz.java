import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record arz(cnu b) {
   private static final Codec<arz> c = RecordCodecBuilder.create($$0 -> $$0.group(cnw.f.fieldOf("enabled").forGetter(arz::a)).apply($$0, arz::new));
   public static final asr<arz> a = asr.a("features", c);

   public cnu a() {
      return this.b;
   }
}
