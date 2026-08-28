import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etw(Optional<bu> b, eqj.b c) implements ett {
   public static final MapCodec<etw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bu.a.optionalFieldOf("predicate").forGetter(etw::c), eqj.b.e.fieldOf("entity").forGetter(etw::d)).apply($$0, etw::new)
   );

   @Override
   public etu b() {
      return etv.h;
   }

   @Override
   public Set<etc<?>> a() {
      return ImmutableSet.of(etf.f, this.c.a());
   }

   public boolean a(eqj $$0) {
      bsv $$1 = $$0.c(this.c.a());
      evs $$2 = $$0.c(etf.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ett.a a(eqj.b $$0) {
      return a($$0, bu.a.a());
   }

   public static ett.a a(eqj.b $$0, bu.a $$1) {
      return () -> new etw(Optional.of($$1.b()), $$0);
   }

   public static ett.a a(eqj.b $$0, bu $$1) {
      return () -> new etw(Optional.of($$1), $$0);
   }

   public Optional<bu> c() {
      return this.b;
   }

   public eqj.b d() {
      return this.c;
   }
}
