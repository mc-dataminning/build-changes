import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exh(String b) implements exj {
   public static final MapCodec<exh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(exh::c)).apply($$0, exh::new));

   public static exj a(String $$0) {
      return new exh($$0);
   }

   @Override
   public exi a() {
      return exk.b;
   }

   @Override
   public ezh a(est $$0) {
      return ezh.c(this.b);
   }

   @Override
   public Set<evm<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
