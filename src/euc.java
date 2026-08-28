import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record euc(Optional<bu> b, eqo.b c) implements etz {
   public static final MapCodec<euc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bu.a.optionalFieldOf("predicate").forGetter(euc::c), eqo.b.e.fieldOf("entity").forGetter(euc::d)).apply($$0, euc::new)
   );

   @Override
   public eua b() {
      return eub.f;
   }

   @Override
   public Set<eth<?>> a() {
      return ImmutableSet.of(etk.f, this.c.a());
   }

   public boolean a(eqo $$0) {
      bsd $$1 = $$0.c(this.c.a());
      evz $$2 = $$0.c(etk.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static etz.a a(eqo.b $$0) {
      return a($$0, bu.a.a());
   }

   public static etz.a a(eqo.b $$0, bu.a $$1) {
      return () -> new euc(Optional.of($$1.b()), $$0);
   }

   public static etz.a a(eqo.b $$0, bu $$1) {
      return () -> new euc(Optional.of($$1), $$0);
   }

   public Optional<bu> c() {
      return this.b;
   }

   public eqo.b d() {
      return this.c;
   }
}
