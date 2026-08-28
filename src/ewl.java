import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewl(Optional<bk> b) implements ews {
   public static final MapCodec<ewl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bk.a.optionalFieldOf("predicate").forGetter(ewl::c)).apply($$0, ewl::new));

   @Override
   public ewt b() {
      return ewu.m;
   }

   @Override
   public Set<ewa<?>> a() {
      return ImmutableSet.of(ewd.f, ewd.c);
   }

   public boolean a(eth $$0) {
      bsg $$1 = $$0.c(ewd.c);
      eys $$2 = $$0.c(ewd.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ews.a a(bk.a $$0) {
      return () -> new ewl(Optional.of($$0.b()));
   }

   public Optional<bk> c() {
      return this.b;
   }
}
