import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejr(ela b) implements eiz {
   public static final Codec<ejr> a = RecordCodecBuilder.create($$0 -> $$0.group(ela.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, ejr::new));

   public ela a() {
      return this.b;
   }
}
