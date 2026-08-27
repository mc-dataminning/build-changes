import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efw(Optional<cb> b) implements efp {
   public static final Codec<efw> a = RecordCodecBuilder.create($$0 -> $$0.group(arg.a(cb.a, "predicate").forGetter(efw::c)).apply($$0, efw::new));

   @Override
   public efq b() {
      return efr.k;
   }

   @Override
   public Set<eey<?>> a() {
      return ImmutableSet.of(efb.i);
   }

   public boolean a(ecq $$0) {
      cjf $$1 = $$0.c(efb.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static efp.a a(cb.a $$0) {
      return () -> new efw(Optional.of($$0.b()));
   }

   public Optional<cb> c() {
      return this.b;
   }
}
