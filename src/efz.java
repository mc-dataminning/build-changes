import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record efz(aez b) implements efx {
   public static final Codec<efz> a = RecordCodecBuilder.create($$0 -> $$0.group(aez.a.fieldOf("source").forGetter(efz::c)).apply($$0, efz::new));

   @Override
   public efw a() {
      return efy.b;
   }

   @Nullable
   @Override
   public rq a(eck $$0) {
      return $$0.d().n().aG().a(this.b);
   }

   @Override
   public Set<ees<?>> b() {
      return ImmutableSet.of();
   }

   public aez c() {
      return this.b;
   }
}
