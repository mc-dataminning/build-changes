import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eny(Optional<br> b, ekw.b c) implements env {
   public static final Codec<eny> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awe.a(br.a, "predicate").forGetter(eny::c), ekw.b.e.fieldOf("entity").forGetter(eny::d)).apply($$0, eny::new)
   );

   @Override
   public enw b() {
      return enx.g;
   }

   @Override
   public Set<ene<?>> a() {
      return ImmutableSet.of(enh.f, this.c.a());
   }

   public boolean a(ekw $$0) {
      box $$1 = $$0.c(this.c.a());
      ept $$2 = $$0.c(enh.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static env.a a(ekw.b $$0) {
      return a($$0, br.a.a());
   }

   public static env.a a(ekw.b $$0, br.a $$1) {
      return () -> new eny(Optional.of($$1.b()), $$0);
   }

   public static env.a a(ekw.b $$0, br $$1) {
      return () -> new eny(Optional.of($$1), $$0);
   }

   public Optional<br> c() {
      return this.b;
   }

   public ekw.b d() {
      return this.c;
   }
}
