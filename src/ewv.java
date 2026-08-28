import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewv(Optional<bv> b, eth.b c) implements ews {
   public static final MapCodec<ewv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bv.a.optionalFieldOf("predicate").forGetter(ewv::c), eth.b.e.fieldOf("entity").forGetter(ewv::d)).apply($$0, ewv::new)
   );

   @Override
   public ewt b() {
      return ewu.f;
   }

   @Override
   public Set<ewa<?>> a() {
      return ImmutableSet.of(ewd.f, this.c.a());
   }

   public boolean a(eth $$0) {
      bto $$1 = $$0.c(this.c.a());
      eys $$2 = $$0.c(ewd.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ews.a a(eth.b $$0) {
      return a($$0, bv.a.a());
   }

   public static ews.a a(eth.b $$0, bv.a $$1) {
      return () -> new ewv(Optional.of($$1.b()), $$0);
   }

   public static ews.a a(eth.b $$0, bv $$1) {
      return () -> new ewv(Optional.of($$1), $$0);
   }

   public Optional<bv> c() {
      return this.b;
   }

   public eth.b d() {
      return this.c;
   }
}
