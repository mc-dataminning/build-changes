import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eez(Optional<bd> b) implements eff {
   public static final Codec<eez> a = RecordCodecBuilder.create($$0 -> $$0.group(aqy.a(bd.a, "predicate").forGetter(eez::c)).apply($$0, eez::new));

   @Override
   public efg b() {
      return efh.n;
   }

   @Override
   public Set<eeo<?>> a() {
      return ImmutableSet.of(eer.f, eer.c);
   }

   public boolean a(ecg $$0) {
      bhg $$1 = $$0.c(eer.c);
      ehd $$2 = $$0.c(eer.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static eff.a a(bd.a $$0) {
      return () -> new eez($$0.b());
   }

   public Optional<bd> c() {
      return this.b;
   }
}
