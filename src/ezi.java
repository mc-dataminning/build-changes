import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezi(Optional<cv> b) implements ezb {
   public static final MapCodec<ezi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cv.a.optionalFieldOf("predicate").forGetter(ezi::c)).apply($$0, ezi::new));

   @Override
   public ezc b() {
      return ezd.j;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eym.i);
   }

   public boolean a(evs $$0) {
      cwq $$1 = $$0.c(eym.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ezb.a a(cv.a $$0) {
      return () -> new ezi(Optional.of($$0.b()));
   }

   public Optional<cv> c() {
      return this.b;
   }
}
