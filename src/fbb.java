import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fbb(Optional<cv> b) implements fau {
   public static final MapCodec<fbb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cv.a.optionalFieldOf("predicate").forGetter(fbb::c)).apply($$0, fbb::new));

   @Override
   public fav b() {
      return faw.j;
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(faf.i);
   }

   public boolean a(exl $$0) {
      cxy $$1 = $$0.c(faf.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static fau.a a(cv.a $$0) {
      return () -> new fbb(Optional.of($$0.b()));
   }

   public Optional<cv> c() {
      return this.b;
   }
}
