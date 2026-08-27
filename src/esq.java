import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record esq(Optional<br> b, eph.b c) implements esn {
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(br.a.optionalFieldOf("predicate").forGetter(esq::c), eph.b.e.fieldOf("entity").forGetter(esq::d)).apply($$0, esq::new)
   );

   @Override
   public eso b() {
      return esp.h;
   }

   @Override
   public Set<erw<?>> a() {
      return ImmutableSet.of(erz.f, this.c.a());
   }

   public boolean a(eph $$0) {
      brw $$1 = $$0.c(this.c.a());
      eum $$2 = $$0.c(erz.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static esn.a a(eph.b $$0) {
      return a($$0, br.a.a());
   }

   public static esn.a a(eph.b $$0, br.a $$1) {
      return () -> new esq(Optional.of($$1.b()), $$0);
   }

   public static esn.a a(eph.b $$0, br $$1) {
      return () -> new esq(Optional.of($$1), $$0);
   }

   public Optional<br> c() {
      return this.b;
   }

   public eph.b d() {
      return this.c;
   }
}
