import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edt(efc b) implements edb {
   public static final Codec<edt> a = RecordCodecBuilder.create($$0 -> $$0.group(efc.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, edt::new));

   public efc a() {
      return this.b;
   }
}
