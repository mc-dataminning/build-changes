import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exg(Optional<bl> b) implements exn {
   public static final MapCodec<exg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bl.a.optionalFieldOf("predicate").forGetter(exg::c)).apply($$0, exg::new));

   @Override
   public exo b() {
      return exp.m;
   }

   @Override
   public Set<ewv<?>> a() {
      return ImmutableSet.of(ewy.f, ewy.c);
   }

   public boolean a(euc $$0) {
      bsu $$1 = $$0.c(ewy.c);
      ezn $$2 = $$0.c(ewy.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static exn.a a(bl.a $$0) {
      return () -> new exg(Optional.of($$0.b()));
   }

   public Optional<bl> c() {
      return this.b;
   }
}
