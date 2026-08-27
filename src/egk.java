import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record egk(Optional<bq> b, edi.b c) implements egh {
   public static final Codec<egk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asg.a(bq.a, "predicate").forGetter(egk::c), edi.b.e.fieldOf("entity").forGetter(egk::d)).apply($$0, egk::new)
   );

   @Override
   public egi b() {
      return egj.g;
   }

   @Override
   public Set<efq<?>> a() {
      return ImmutableSet.of(eft.f, this.c.a());
   }

   public boolean a(edi $$0) {
      bjt $$1 = $$0.c(this.c.a());
      eif $$2 = $$0.c(eft.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static egh.a a(edi.b $$0) {
      return a($$0, bq.a.a());
   }

   public static egh.a a(edi.b $$0, bq.a $$1) {
      return () -> new egk(Optional.of($$1.b()), $$0);
   }

   public static egh.a a(edi.b $$0, bq $$1) {
      return () -> new egk(Optional.of($$1), $$0);
   }

   public Optional<bq> c() {
      return this.b;
   }

   public edi.b d() {
      return this.c;
   }
}
