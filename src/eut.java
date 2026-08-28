import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eut(String b) implements euv {
   public static final MapCodec<eut> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(eut::c)).apply($$0, eut::new));

   public static euv a(String $$0) {
      return new eut($$0);
   }

   @Override
   public euu a() {
      return euw.b;
   }

   @Override
   public ewt a(eqh $$0) {
      return ewt.c(this.b);
   }

   @Override
   public Set<eta<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
