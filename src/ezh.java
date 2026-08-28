import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezh(Optional<cv> b) implements eza {
   public static final MapCodec<ezh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cv.a.optionalFieldOf("predicate").forGetter(ezh::c)).apply($$0, ezh::new));

   @Override
   public ezb b() {
      return ezc.j;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.i);
   }

   public boolean a(evr $$0) {
      cwp $$1 = $$0.c(eyl.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static eza.a a(cv.a $$0) {
      return () -> new ezh(Optional.of($$0.b()));
   }

   public Optional<cv> c() {
      return this.b;
   }
}
