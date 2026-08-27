import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record emr(Optional<bg> b) implements emx {
   public static final Codec<emr> a = RecordCodecBuilder.create($$0 -> $$0.group(avu.a(bg.a, "predicate").forGetter(emr::c)).apply($$0, emr::new));

   @Override
   public emy b() {
      return emz.n;
   }

   @Override
   public Set<emg<?>> a() {
      return ImmutableSet.of(emj.f, emj.c);
   }

   public boolean a(ejy $$0) {
      bne $$1 = $$0.c(emj.c);
      eov $$2 = $$0.c(emj.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static emx.a a(bg.a $$0) {
      return () -> new emr(Optional.of($$0.b()));
   }

   public Optional<bg> c() {
      return this.b;
   }
}
