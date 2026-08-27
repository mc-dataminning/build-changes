import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record efv(aer b) implements eft {
   public static final Codec<efv> a = RecordCodecBuilder.create($$0 -> $$0.group(aer.a.fieldOf("source").forGetter(efv::c)).apply($$0, efv::new));

   @Override
   public efs a() {
      return efu.b;
   }

   @Nullable
   @Override
   public rk a(ecg $$0) {
      return $$0.d().n().aG().a(this.b);
   }

   @Override
   public Set<eeo<?>> b() {
      return ImmutableSet.of();
   }

   public aer c() {
      return this.b;
   }
}
