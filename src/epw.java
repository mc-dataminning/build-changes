import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record epw(Optional<bg> b) implements eqc {
   public static final Codec<epw> a = RecordCodecBuilder.create($$0 -> $$0.group(aws.a(bg.a, "predicate").forGetter(epw::c)).apply($$0, epw::new));

   @Override
   public eqd b() {
      return eqe.n;
   }

   @Override
   public Set<epl<?>> a() {
      return ImmutableSet.of(epo.f, epo.c);
   }

   public boolean a(enb $$0) {
      bot $$1 = $$0.c(epo.c);
      esa $$2 = $$0.c(epo.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static eqc.a a(bg.a $$0) {
      return () -> new epw(Optional.of($$0.b()));
   }

   public Optional<bg> c() {
      return this.b;
   }
}
