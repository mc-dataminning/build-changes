import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eme(Optional<br> b, ejc.b c) implements emb {
   public static final Codec<eme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avq.a(br.a, "predicate").forGetter(eme::c), ejc.b.e.fieldOf("entity").forGetter(eme::d)).apply($$0, eme::new)
   );

   @Override
   public emc b() {
      return emd.g;
   }

   @Override
   public Set<elk<?>> a() {
      return ImmutableSet.of(eln.f, this.c.a());
   }

   public boolean a(ejc $$0) {
      bnq $$1 = $$0.c(this.c.a());
      enz $$2 = $$0.c(eln.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static emb.a a(ejc.b $$0) {
      return a($$0, br.a.a());
   }

   public static emb.a a(ejc.b $$0, br.a $$1) {
      return () -> new eme(Optional.of($$1.b()), $$0);
   }

   public static emb.a a(ejc.b $$0, br $$1) {
      return () -> new eme(Optional.of($$1), $$0);
   }

   public Optional<br> c() {
      return this.b;
   }

   public ejc.b d() {
      return this.c;
   }
}
