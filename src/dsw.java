import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsw(duf b) implements dse {
   public static final Codec<dsw> a = RecordCodecBuilder.create($$0 -> $$0.group(duf.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dsw::new));

   public duf a() {
      return this.b;
   }
}
