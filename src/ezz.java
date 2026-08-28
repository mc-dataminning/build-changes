import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezz(Optional<cu> b) implements ezs {
   public static final MapCodec<ezz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cu.a.optionalFieldOf("predicate").forGetter(ezz::c)).apply($$0, ezz::new));

   @Override
   public ezt b() {
      return ezu.j;
   }

   @Override
   public Set<eza<?>> a() {
      return ImmutableSet.of(ezd.i);
   }

   public boolean a(ewh $$0) {
      cxk $$1 = $$0.c(ezd.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ezs.a a(cu.a $$0) {
      return () -> new ezz(Optional.of($$0.b()));
   }

   public Optional<cu> c() {
      return this.b;
   }
}
