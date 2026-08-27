import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eqo(Optional<br> b, enk.b c) implements eql {
   public static final Codec<eqo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awu.a(br.a, "predicate").forGetter(eqo::c), enk.b.e.fieldOf("entity").forGetter(eqo::d)).apply($$0, eqo::new)
   );

   @Override
   public eqm b() {
      return eqn.g;
   }

   @Override
   public Set<epu<?>> a() {
      return ImmutableSet.of(epx.f, this.c.a());
   }

   public boolean a(enk $$0) {
      bqa $$1 = $$0.c(this.c.a());
      esj $$2 = $$0.c(epx.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static eql.a a(enk.b $$0) {
      return a($$0, br.a.a());
   }

   public static eql.a a(enk.b $$0, br.a $$1) {
      return () -> new eqo(Optional.of($$1.b()), $$0);
   }

   public static eql.a a(enk.b $$0, br $$1) {
      return () -> new eqo(Optional.of($$1), $$0);
   }

   public Optional<br> c() {
      return this.b;
   }

   public enk.b d() {
      return this.c;
   }
}
