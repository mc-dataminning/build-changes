import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duj(dvs b) implements dtr {
   public static final Codec<duj> a = RecordCodecBuilder.create($$0 -> $$0.group(dvs.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, duj::new));

   public dvs a() {
      return this.b;
   }
}
