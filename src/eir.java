import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eir(agm b) implements eip {
   public static final Codec<eir> a = RecordCodecBuilder.create($$0 -> $$0.group(agm.a.fieldOf("source").forGetter(eir::c)).apply($$0, eir::new));

   @Override
   public eio a() {
      return eiq.b;
   }

   @Nullable
   @Override
   public ta a(efc $$0) {
      return $$0.d().n().aI().a(this.b);
   }

   @Override
   public Set<ehk<?>> b() {
      return ImmutableSet.of();
   }

   public agm c() {
      return this.b;
   }
}
