import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ark(cmg b) {
   private static final Codec<ark> c = RecordCodecBuilder.create($$0 -> $$0.group(cmi.f.fieldOf("enabled").forGetter(ark::a)).apply($$0, ark::new));
   public static final asc<ark> a = asc.a("features", c);

   public cmg a() {
      return this.b;
   }
}
