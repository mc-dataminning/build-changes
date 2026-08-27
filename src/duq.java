import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duq(dvz b) implements dty {
   public static final Codec<duq> a = RecordCodecBuilder.create($$0 -> $$0.group(dvz.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, duq::new));

   public dvz a() {
      return this.b;
   }
}
