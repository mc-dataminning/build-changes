import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record enw(Optional<br> b, eku.b c) implements ent {
   public static final Codec<enw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awe.a(br.a, "predicate").forGetter(enw::c), eku.b.e.fieldOf("entity").forGetter(enw::d)).apply($$0, enw::new)
   );

   @Override
   public enu b() {
      return env.g;
   }

   @Override
   public Set<enc<?>> a() {
      return ImmutableSet.of(enf.f, this.c.a());
   }

   public boolean a(eku $$0) {
      bow $$1 = $$0.c(this.c.a());
      epr $$2 = $$0.c(enf.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ent.a a(eku.b $$0) {
      return a($$0, br.a.a());
   }

   public static ent.a a(eku.b $$0, br.a $$1) {
      return () -> new enw(Optional.of($$1.b()), $$0);
   }

   public static ent.a a(eku.b $$0, br $$1) {
      return () -> new enw(Optional.of($$1), $$0);
   }

   public Optional<br> c() {
      return this.b;
   }

   public eku.b d() {
      return this.c;
   }
}
