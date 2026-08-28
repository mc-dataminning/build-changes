import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efy(ehh b) implements efg {
   public static final Codec<efy> a = RecordCodecBuilder.create($$0 -> $$0.group(ehh.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, efy::new));

   public ehh a() {
      return this.b;
   }
}
