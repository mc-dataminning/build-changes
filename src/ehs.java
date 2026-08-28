import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehs(ejb b) implements eha {
   public static final Codec<ehs> a = RecordCodecBuilder.create($$0 -> $$0.group(ejb.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, ehs::new));

   public ejb a() {
      return this.b;
   }
}
