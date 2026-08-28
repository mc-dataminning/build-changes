import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fae(Optional<cv> b) implements ezx {
   public static final MapCodec<fae> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cv.a.optionalFieldOf("predicate").forGetter(fae::c)).apply($$0, fae::new));

   @Override
   public ezy b() {
      return ezz.j;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(ezi.i);
   }

   public boolean a(ewo $$0) {
      cxh $$1 = $$0.c(ezi.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ezx.a a(cv.a $$0) {
      return () -> new fae(Optional.of($$0.b()));
   }

   public Optional<cv> c() {
      return this.b;
   }
}
