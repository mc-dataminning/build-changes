import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewd(String b) implements ewf {
   public static final MapCodec<ewd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ewd::c)).apply($$0, ewd::new));

   public static ewf a(String $$0) {
      return new ewd($$0);
   }

   @Override
   public ewe a() {
      return ewg.b;
   }

   @Override
   public eyd a(erp $$0) {
      return eyd.c(this.b);
   }

   @Override
   public Set<eui<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
