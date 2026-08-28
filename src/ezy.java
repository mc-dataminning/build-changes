import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezy(Optional<cu> b) implements ezr {
   public static final MapCodec<ezy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cu.a.optionalFieldOf("predicate").forGetter(ezy::c)).apply($$0, ezy::new));

   @Override
   public ezs b() {
      return ezt.j;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(ezc.i);
   }

   public boolean a(ewi $$0) {
      cxg $$1 = $$0.c(ezc.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ezr.a a(cu.a $$0) {
      return () -> new ezy(Optional.of($$0.b()));
   }

   public Optional<cu> c() {
      return this.b;
   }
}
