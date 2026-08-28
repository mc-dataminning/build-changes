import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etv(Optional<bu> b, eqi.b c) implements ets {
   public static final MapCodec<etv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bu.a.optionalFieldOf("predicate").forGetter(etv::c), eqi.b.e.fieldOf("entity").forGetter(etv::d)).apply($$0, etv::new)
   );

   @Override
   public ett b() {
      return etu.h;
   }

   @Override
   public Set<etb<?>> a() {
      return ImmutableSet.of(ete.f, this.c.a());
   }

   public boolean a(eqi $$0) {
      bsu $$1 = $$0.c(this.c.a());
      evr $$2 = $$0.c(ete.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ets.a a(eqi.b $$0) {
      return a($$0, bu.a.a());
   }

   public static ets.a a(eqi.b $$0, bu.a $$1) {
      return () -> new etv(Optional.of($$1.b()), $$0);
   }

   public static ets.a a(eqi.b $$0, bu $$1) {
      return () -> new etv(Optional.of($$1), $$0);
   }

   public Optional<bu> c() {
      return this.b;
   }

   public eqi.b d() {
      return this.c;
   }
}
