import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eqf(Optional<br> b, enb.b c) implements eqc {
   public static final Codec<eqf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aws.a(br.a, "predicate").forGetter(eqf::c), enb.b.e.fieldOf("entity").forGetter(eqf::d)).apply($$0, eqf::new)
   );

   @Override
   public eqd b() {
      return eqe.g;
   }

   @Override
   public Set<epl<?>> a() {
      return ImmutableSet.of(epo.f, this.c.a());
   }

   public boolean a(enb $$0) {
      bpv $$1 = $$0.c(this.c.a());
      esa $$2 = $$0.c(epo.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static eqc.a a(enb.b $$0) {
      return a($$0, br.a.a());
   }

   public static eqc.a a(enb.b $$0, br.a $$1) {
      return () -> new eqf(Optional.of($$1.b()), $$0);
   }

   public static eqc.a a(enb.b $$0, br $$1) {
      return () -> new eqf(Optional.of($$1), $$0);
   }

   public Optional<br> c() {
      return this.b;
   }

   public enb.b d() {
      return this.c;
   }
}
