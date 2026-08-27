import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eix(Optional<bf> b) implements ejd {
   public static final Codec<eix> a = RecordCodecBuilder.create($$0 -> $$0.group(atg.a(bf.a, "predicate").forGetter(eix::c)).apply($$0, eix::new));

   @Override
   public eje b() {
      return ejf.n;
   }

   @Override
   public Set<eim<?>> a() {
      return ImmutableSet.of(eip.f, eip.c);
   }

   public boolean a(ege $$0) {
      bkd $$1 = $$0.c(eip.c);
      elb $$2 = $$0.c(eip.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ejd.a a(bf.a $$0) {
      return () -> new eix(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
