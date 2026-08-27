import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record elv(Optional<bg> b) implements emb {
   public static final Codec<elv> a = RecordCodecBuilder.create($$0 -> $$0.group(avq.a(bg.a, "predicate").forGetter(elv::c)).apply($$0, elv::new));

   @Override
   public emc b() {
      return emd.n;
   }

   @Override
   public Set<elk<?>> a() {
      return ImmutableSet.of(eln.f, eln.c);
   }

   public boolean a(ejc $$0) {
      bmp $$1 = $$0.c(eln.c);
      enz $$2 = $$0.c(eln.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static emb.a a(bg.a $$0) {
      return () -> new elv(Optional.of($$0.b()));
   }

   public Optional<bg> c() {
      return this.b;
   }
}
