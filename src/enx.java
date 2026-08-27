import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record enx(ejy.b c) implements eoa {
   public static final Codec<enx> a = RecordCodecBuilder.create($$0 -> $$0.group(ejy.b.e.fieldOf("target").forGetter(enx::c)).apply($$0, enx::new));
   public static final Codec<enx> b = ejy.b.e.xmap(enx::new, enx::c);

   public static eoa a(ejy.b $$0) {
      return new enx($$0);
   }

   @Override
   public enz a() {
      return eob.c;
   }

   @Nullable
   @Override
   public epy a(ejy $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<emg<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
