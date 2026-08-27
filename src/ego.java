import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ego(Optional<cb> b) implements egh {
   public static final Codec<ego> a = RecordCodecBuilder.create($$0 -> $$0.group(asg.a(cb.a, "predicate").forGetter(ego::c)).apply($$0, ego::new));

   @Override
   public egi b() {
      return egj.k;
   }

   @Override
   public Set<efq<?>> a() {
      return ImmutableSet.of(eft.i);
   }

   public boolean a(edi $$0) {
      ckj $$1 = $$0.c(eft.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static egh.a a(cb.a $$0) {
      return () -> new ego(Optional.of($$0.b()));
   }

   public Optional<cb> c() {
      return this.b;
   }
}
