import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record atb(cqn b) {
   private static final Codec<atb> c = RecordCodecBuilder.create($$0 -> $$0.group(cqp.g.fieldOf("enabled").forGetter(atb::a)).apply($$0, atb::new));
   public static final att<atb> a = att.a("features", c);

   public cqn a() {
      return this.b;
   }
}
