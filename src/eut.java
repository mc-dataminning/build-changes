import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eut(Optional<bk> b) implements eva {
   public static final MapCodec<eut> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bk.a.optionalFieldOf("predicate").forGetter(eut::c)).apply($$0, eut::new));

   @Override
   public evb b() {
      return evc.m;
   }

   @Override
   public Set<eui<?>> a() {
      return ImmutableSet.of(eul.f, eul.c);
   }

   public boolean a(erp $$0) {
      brk $$1 = $$0.c(eul.c);
      exa $$2 = $$0.c(eul.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static eva.a a(bk.a $$0) {
      return () -> new eut(Optional.of($$0.b()));
   }

   public Optional<bk> c() {
      return this.b;
   }
}
