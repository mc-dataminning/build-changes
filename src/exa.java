import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exa(Optional<bk> b) implements exh {
   public static final MapCodec<exa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bk.a.optionalFieldOf("predicate").forGetter(exa::c)).apply($$0, exa::new));

   @Override
   public exi b() {
      return exj.m;
   }

   @Override
   public Set<ewp<?>> a() {
      return ImmutableSet.of(ews.f, ews.c);
   }

   public boolean a(etw $$0) {
      bsp $$1 = $$0.c(ews.c);
      ezh $$2 = $$0.c(ews.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static exh.a a(bk.a $$0) {
      return () -> new exa(Optional.of($$0.b()));
   }

   public Optional<bk> c() {
      return this.b;
   }
}
