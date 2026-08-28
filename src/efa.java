import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efa(egj b) implements eei {
   public static final Codec<efa> a = RecordCodecBuilder.create($$0 -> $$0.group(egj.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, efa::new));

   public egj a() {
      return this.b;
   }
}
