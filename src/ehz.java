import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ehz(Optional<bq> b, eex.b c) implements ehw {
   public static final Codec<ehz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asu.a(bq.a, "predicate").forGetter(ehz::c), eex.b.e.fieldOf("entity").forGetter(ehz::d)).apply($$0, ehz::new)
   );

   @Override
   public ehx b() {
      return ehy.g;
   }

   @Override
   public Set<ehf<?>> a() {
      return ImmutableSet.of(ehi.f, this.c.a());
   }

   public boolean a(eex $$0) {
      bkq $$1 = $$0.c(this.c.a());
      eju $$2 = $$0.c(ehi.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ehw.a a(eex.b $$0) {
      return a($$0, bq.a.a());
   }

   public static ehw.a a(eex.b $$0, bq.a $$1) {
      return () -> new ehz(Optional.of($$1.b()), $$0);
   }

   public static ehw.a a(eex.b $$0, bq $$1) {
      return () -> new ehz(Optional.of($$1), $$0);
   }

   public Optional<bq> c() {
      return this.b;
   }

   public eex.b d() {
      return this.c;
   }
}
