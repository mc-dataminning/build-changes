import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eup(Optional<bk> b) implements euw {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bk.a.optionalFieldOf("predicate").forGetter(eup::c)).apply($$0, eup::new));

   @Override
   public eux b() {
      return euy.m;
   }

   @Override
   public Set<eue<?>> a() {
      return ImmutableSet.of(euh.f, euh.c);
   }

   public boolean a(erl $$0) {
      brj $$1 = $$0.c(euh.c);
      eww $$2 = $$0.c(euh.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static euw.a a(bk.a $$0) {
      return () -> new eup(Optional.of($$0.b()));
   }

   public Optional<bk> c() {
      return this.b;
   }
}
