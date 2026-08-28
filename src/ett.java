import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ett(Optional<bu> b, eqg.b c) implements etq {
   public static final MapCodec<ett> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bu.a.optionalFieldOf("predicate").forGetter(ett::c), eqg.b.e.fieldOf("entity").forGetter(ett::d)).apply($$0, ett::new)
   );

   @Override
   public etr b() {
      return ets.h;
   }

   @Override
   public Set<esz<?>> a() {
      return ImmutableSet.of(etc.f, this.c.a());
   }

   public boolean a(eqg $$0) {
      bss $$1 = $$0.c(this.c.a());
      evp $$2 = $$0.c(etc.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static etq.a a(eqg.b $$0) {
      return a($$0, bu.a.a());
   }

   public static etq.a a(eqg.b $$0, bu.a $$1) {
      return () -> new ett(Optional.of($$1.b()), $$0);
   }

   public static etq.a a(eqg.b $$0, bu $$1) {
      return () -> new ett(Optional.of($$1), $$0);
   }

   public Optional<bu> c() {
      return this.b;
   }

   public eqg.b d() {
      return this.c;
   }
}
