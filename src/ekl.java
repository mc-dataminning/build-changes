import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ekl(ahg b) implements ekj {
   public static final Codec<ekl> a = RecordCodecBuilder.create($$0 -> $$0.group(ahg.a.fieldOf("source").forGetter(ekl::c)).apply($$0, ekl::new));

   @Override
   public eki a() {
      return ekk.b;
   }

   @Nullable
   @Override
   public tk a(egw $$0) {
      return $$0.d().o().aI().a(this.b);
   }

   @Override
   public Set<eje<?>> b() {
      return ImmutableSet.of();
   }

   public ahg c() {
      return this.b;
   }
}
