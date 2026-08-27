import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asl(cop b) {
   private static final Codec<asl> c = RecordCodecBuilder.create($$0 -> $$0.group(cor.f.fieldOf("enabled").forGetter(asl::a)).apply($$0, asl::new));
   public static final atd<asl> a = atd.a("features", c);

   public cop a() {
      return this.b;
   }
}
