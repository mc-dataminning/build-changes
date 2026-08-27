import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record egb(Optional<bf> b) implements egh {
   public static final Codec<egb> a = RecordCodecBuilder.create($$0 -> $$0.group(asg.a(bf.a, "predicate").forGetter(egb::c)).apply($$0, egb::new));

   @Override
   public egi b() {
      return egj.n;
   }

   @Override
   public Set<efq<?>> a() {
      return ImmutableSet.of(eft.f, eft.c);
   }

   public boolean a(edi $$0) {
      bir $$1 = $$0.c(eft.c);
      eif $$2 = $$0.c(eft.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static egh.a a(bf.a $$0) {
      return () -> new egb(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
