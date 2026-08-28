import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eyt(Optional<bm> b) implements eza {
   public static final MapCodec<eyt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bm.a.optionalFieldOf("predicate").forGetter(eyt::c)).apply($$0, eyt::new));

   @Override
   public ezb b() {
      return ezc.m;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.f, eyl.c);
   }

   public boolean a(evr $$0) {
      bta $$1 = $$0.c(eyl.c);
      fba $$2 = $$0.c(eyl.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static eza.a a(bm.a $$0) {
      return () -> new eyt(Optional.of($$0.b()));
   }

   public Optional<bm> c() {
      return this.b;
   }
}
