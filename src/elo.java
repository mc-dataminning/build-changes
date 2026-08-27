import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record elo(Optional<bg> b) implements elu {
   public static final Codec<elo> a = RecordCodecBuilder.create($$0 -> $$0.group(avp.a(bg.a, "predicate").forGetter(elo::c)).apply($$0, elo::new));

   @Override
   public elv b() {
      return elw.n;
   }

   @Override
   public Set<eld<?>> a() {
      return ImmutableSet.of(elg.f, elg.c);
   }

   public boolean a(eiv $$0) {
      bmn $$1 = $$0.c(elg.c);
      ens $$2 = $$0.c(elg.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static elu.a a(bg.a $$0) {
      return () -> new elo(Optional.of($$0.b()));
   }

   public Optional<bg> c() {
      return this.b;
   }
}
