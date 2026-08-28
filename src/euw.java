import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euw(String b) implements euy {
   public static final MapCodec<euw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(euw::c)).apply($$0, euw::new));

   public static euy a(String $$0) {
      return new euw($$0);
   }

   @Override
   public eux a() {
      return euz.b;
   }

   @Override
   public eww a(eqk $$0) {
      return eww.c(this.b);
   }

   @Override
   public Set<etd<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
