import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewf(String b) implements ewh {
   public static final MapCodec<ewf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ewf::c)).apply($$0, ewf::new));

   public static ewh a(String $$0) {
      return new ewf($$0);
   }

   @Override
   public ewg a() {
      return ewi.b;
   }

   @Override
   public eyf a(err $$0) {
      return eyf.c(this.b);
   }

   @Override
   public Set<euk<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
