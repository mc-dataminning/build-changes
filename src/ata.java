import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ata(cqh b) {
   private static final Codec<ata> c = RecordCodecBuilder.create($$0 -> $$0.group(cqj.g.fieldOf("enabled").forGetter(ata::a)).apply($$0, ata::new));
   public static final ats<ata> a = ats.a("features", c);

   public cqh a() {
      return this.b;
   }
}
