import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ene(Optional<cc> b) implements emx {
   public static final Codec<ene> a = RecordCodecBuilder.create($$0 -> $$0.group(avu.a(cc.a, "predicate").forGetter(ene::c)).apply($$0, ene::new));

   @Override
   public emy b() {
      return emz.k;
   }

   @Override
   public Set<emg<?>> a() {
      return ImmutableSet.of(emj.i);
   }

   public boolean a(ejy $$0) {
      cpq $$1 = $$0.c(emj.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static emx.a a(cc.a $$0) {
      return () -> new ene(Optional.of($$0.b()));
   }

   public Optional<cc> c() {
      return this.b;
   }
}
