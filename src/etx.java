import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etx(Optional<bu> b, eqk.b c) implements etu {
   public static final MapCodec<etx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bu.a.optionalFieldOf("predicate").forGetter(etx::c), eqk.b.e.fieldOf("entity").forGetter(etx::d)).apply($$0, etx::new)
   );

   @Override
   public etv b() {
      return etw.h;
   }

   @Override
   public Set<etd<?>> a() {
      return ImmutableSet.of(etg.f, this.c.a());
   }

   public boolean a(eqk $$0) {
      bsw $$1 = $$0.c(this.c.a());
      evt $$2 = $$0.c(etg.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static etu.a a(eqk.b $$0) {
      return a($$0, bu.a.a());
   }

   public static etu.a a(eqk.b $$0, bu.a $$1) {
      return () -> new etx(Optional.of($$1.b()), $$0);
   }

   public static etu.a a(eqk.b $$0, bu $$1) {
      return () -> new etx(Optional.of($$1), $$0);
   }

   public Optional<bu> c() {
      return this.b;
   }

   public eqk.b d() {
      return this.c;
   }
}
