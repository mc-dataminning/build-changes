import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ewc(erp.b c) implements ewf {
   public static final MapCodec<ewc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(erp.b.e.fieldOf("target").forGetter(ewc::c)).apply($$0, ewc::new));
   public static final Codec<ewc> b = erp.b.e.xmap(ewc::new, ewc::c);

   public static ewf a(erp.b $$0) {
      return new ewc($$0);
   }

   @Override
   public ewe a() {
      return ewg.c;
   }

   @Nullable
   @Override
   public eyd a(erp $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<eui<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
