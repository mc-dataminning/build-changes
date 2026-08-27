import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egf(aew b) implements egd {
   public static final Codec<egf> a = RecordCodecBuilder.create($$0 -> $$0.group(aew.a.fieldOf("source").forGetter(egf::c)).apply($$0, egf::new));

   @Override
   public egc a() {
      return ege.b;
   }

   @Nullable
   @Override
   public rq a(ecq $$0) {
      return $$0.d().n().aG().a(this.b);
   }

   @Override
   public Set<eey<?>> b() {
      return ImmutableSet.of();
   }

   public aew c() {
      return this.b;
   }
}
