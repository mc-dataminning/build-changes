import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejg(Optional<bp> b, ege.b c) implements ejd {
   public static final Codec<ejg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atg.a(bp.a, "predicate").forGetter(ejg::c), ege.b.e.fieldOf("entity").forGetter(ejg::d)).apply($$0, ejg::new)
   );

   @Override
   public eje b() {
      return ejf.g;
   }

   @Override
   public Set<eim<?>> a() {
      return ImmutableSet.of(eip.f, this.c.a());
   }

   public boolean a(ege $$0) {
      blf $$1 = $$0.c(this.c.a());
      elb $$2 = $$0.c(eip.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ejd.a a(ege.b $$0) {
      return a($$0, bp.a.a());
   }

   public static ejd.a a(ege.b $$0, bp.a $$1) {
      return () -> new ejg(Optional.of($$1.b()), $$0);
   }

   public static ejd.a a(ege.b $$0, bp $$1) {
      return () -> new ejg(Optional.of($$1), $$0);
   }

   public Optional<bp> c() {
      return this.b;
   }

   public ege.b d() {
      return this.c;
   }
}
