import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezl(Optional<bl> b) implements ezs {
   public static final MapCodec<ezl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bl.a.optionalFieldOf("predicate").forGetter(ezl::c)).apply($$0, ezl::new));

   @Override
   public ezt b() {
      return ezu.m;
   }

   @Override
   public Set<eza<?>> a() {
      return ImmutableSet.of(ezd.f, ezd.c);
   }

   public boolean a(ewh $$0) {
      btv $$1 = $$0.c(ezd.c);
      fbs $$2 = $$0.c(ezd.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ezs.a a(bl.a $$0) {
      return () -> new ezl(Optional.of($$0.b()));
   }

   public Optional<bl> c() {
      return this.b;
   }
}
