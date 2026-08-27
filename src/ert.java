import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ert(Optional<br> b, eol.b c) implements erq {
   public static final Codec<ert> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axh.a(br.a, "predicate").forGetter(ert::c), eol.b.e.fieldOf("entity").forGetter(ert::d)).apply($$0, ert::new)
   );

   @Override
   public err b() {
      return ers.h;
   }

   @Override
   public Set<eqz<?>> a() {
      return ImmutableSet.of(erc.f, this.c.a());
   }

   public boolean a(eol $$0) {
      brh $$1 = $$0.c(this.c.a());
      etp $$2 = $$0.c(erc.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static erq.a a(eol.b $$0) {
      return a($$0, br.a.a());
   }

   public static erq.a a(eol.b $$0, br.a $$1) {
      return () -> new ert(Optional.of($$1.b()), $$0);
   }

   public static erq.a a(eol.b $$0, br $$1) {
      return () -> new ert(Optional.of($$1), $$0);
   }

   public Optional<br> c() {
      return this.b;
   }

   public eol.b d() {
      return this.c;
   }
}
