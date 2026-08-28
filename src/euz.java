import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record euz(Optional<bv> b, erl.b c) implements euw {
   public static final MapCodec<euz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bv.a.optionalFieldOf("predicate").forGetter(euz::c), erl.b.e.fieldOf("entity").forGetter(euz::d)).apply($$0, euz::new)
   );

   @Override
   public eux b() {
      return euy.f;
   }

   @Override
   public Set<eue<?>> a() {
      return ImmutableSet.of(euh.f, this.c.a());
   }

   public boolean a(erl $$0) {
      bsq $$1 = $$0.c(this.c.a());
      eww $$2 = $$0.c(euh.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static euw.a a(erl.b $$0) {
      return a($$0, bv.a.a());
   }

   public static euw.a a(erl.b $$0, bv.a $$1) {
      return () -> new euz(Optional.of($$1.b()), $$0);
   }

   public static euw.a a(erl.b $$0, bv $$1) {
      return () -> new euz(Optional.of($$1), $$0);
   }

   public Optional<bv> c() {
      return this.b;
   }

   public erl.b d() {
      return this.c;
   }
}
