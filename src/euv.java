import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euv(String b) implements eux {
   public static final MapCodec<euv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(euv::c)).apply($$0, euv::new));

   public static eux a(String $$0) {
      return new euv($$0);
   }

   @Override
   public euw a() {
      return euy.b;
   }

   @Override
   public ewv a(eqj $$0) {
      return ewv.c(this.b);
   }

   @Override
   public Set<etc<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
