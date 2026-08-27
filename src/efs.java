import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efs(Optional<bq> b, ecq.b c) implements efp {
   public static final Codec<efs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arf.a(bq.a, "predicate").forGetter(efs::c), ecq.b.e.fieldOf("entity").forGetter(efs::d)).apply($$0, efs::new)
   );

   @Override
   public efq b() {
      return efr.g;
   }

   @Override
   public Set<eey<?>> a() {
      return ImmutableSet.of(efb.f, this.c.a());
   }

   public boolean a(ecq $$0) {
      biq $$1 = $$0.c(this.c.a());
      ehn $$2 = $$0.c(efb.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static efp.a a(ecq.b $$0) {
      return a($$0, bq.a.a());
   }

   public static efp.a a(ecq.b $$0, bq.a $$1) {
      return () -> new efs(Optional.of($$1.b()), $$0);
   }

   public static efp.a a(ecq.b $$0, bq $$1) {
      return () -> new efs(Optional.of($$1), $$0);
   }

   public Optional<bq> c() {
      return this.b;
   }

   public ecq.b d() {
      return this.c;
   }
}
