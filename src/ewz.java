import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewz(Optional<cs> b) implements ews {
   public static final MapCodec<ewz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cs.a.optionalFieldOf("predicate").forGetter(ewz::c)).apply($$0, ewz::new));

   @Override
   public ewt b() {
      return ewu.j;
   }

   @Override
   public Set<ewa<?>> a() {
      return ImmutableSet.of(ewd.i);
   }

   public boolean a(eth $$0) {
      cvp $$1 = $$0.c(ewd.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ews.a a(cs.a $$0) {
      return () -> new ewz(Optional.of($$0.b()));
   }

   public Optional<cs> c() {
      return this.b;
   }
}
