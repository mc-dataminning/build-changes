import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezk(Optional<bl> b) implements ezr {
   public static final MapCodec<ezk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bl.a.optionalFieldOf("predicate").forGetter(ezk::c)).apply($$0, ezk::new));

   @Override
   public ezs b() {
      return ezt.m;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(ezc.f, ezc.c);
   }

   public boolean a(ewi $$0) {
      btr $$1 = $$0.c(ezc.c);
      fbr $$2 = $$0.c(ezc.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ezr.a a(bl.a $$0) {
      return () -> new ezk(Optional.of($$0.b()));
   }

   public Optional<bl> c() {
      return this.b;
   }
}
