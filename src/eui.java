import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eui(Optional<bu> b, equ.b c) implements euf {
   public static final MapCodec<eui> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bu.a.optionalFieldOf("predicate").forGetter(eui::c), equ.b.e.fieldOf("entity").forGetter(eui::d)).apply($$0, eui::new)
   );

   @Override
   public eug b() {
      return euh.f;
   }

   @Override
   public Set<etn<?>> a() {
      return ImmutableSet.of(etq.f, this.c.a());
   }

   public boolean a(equ $$0) {
      bsg $$1 = $$0.c(this.c.a());
      ewf $$2 = $$0.c(etq.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static euf.a a(equ.b $$0) {
      return a($$0, bu.a.a());
   }

   public static euf.a a(equ.b $$0, bu.a $$1) {
      return () -> new eui(Optional.of($$1.b()), $$0);
   }

   public static euf.a a(equ.b $$0, bu $$1) {
      return () -> new eui(Optional.of($$1), $$0);
   }

   public Optional<bu> c() {
      return this.b;
   }

   public equ.b d() {
      return this.c;
   }
}
