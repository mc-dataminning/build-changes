import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egf(ecg.b c) implements egi {
   public static final Codec<egf> a = RecordCodecBuilder.create($$0 -> $$0.group(ecg.b.e.fieldOf("target").forGetter(egf::c)).apply($$0, egf::new));
   public static final Codec<egf> b = ecg.b.e.xmap(egf::new, egf::c);

   public static egi a(ecg.b $$0) {
      return new egf($$0);
   }

   @Override
   public egh a() {
      return egj.c;
   }

   @Nullable
   @Override
   public String a(ecg $$0) {
      bii $$1 = $$0.c(this.c.a());
      return $$1 != null ? $$1.cx() : null;
   }

   @Override
   public Set<eeo<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
