import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record erb(Optional<bg> b) implements erh {
   public static final Codec<erb> a = RecordCodecBuilder.create($$0 -> $$0.group(axe.a(bg.a, "predicate").forGetter(erb::c)).apply($$0, erb::new));

   @Override
   public eri b() {
      return erj.n;
   }

   @Override
   public Set<eqq<?>> a() {
      return ImmutableSet.of(eqt.f, eqt.c);
   }

   public boolean a(eoa $$0) {
      bpj $$1 = $$0.c(eqt.c);
      etf $$2 = $$0.c(eqt.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static erh.a a(bg.a $$0) {
      return () -> new erb(Optional.of($$0.b()));
   }

   public Optional<bg> c() {
      return this.b;
   }
}
