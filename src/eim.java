import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eim(agi b) implements eik {
   public static final Codec<eim> a = RecordCodecBuilder.create($$0 -> $$0.group(agi.a.fieldOf("source").forGetter(eim::c)).apply($$0, eim::new));

   @Override
   public eij a() {
      return eil.b;
   }

   @Nullable
   @Override
   public sw a(eex $$0) {
      return $$0.d().n().aI().a(this.b);
   }

   @Override
   public Set<ehf<?>> b() {
      return ImmutableSet.of();
   }

   public agi c() {
      return this.b;
   }
}
