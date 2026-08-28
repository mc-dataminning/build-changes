import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezf(Optional<cv> b) implements eyy {
   public static final MapCodec<ezf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cv.a.optionalFieldOf("predicate").forGetter(ezf::c)).apply($$0, ezf::new));

   @Override
   public eyz b() {
      return eza.j;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(eyj.i);
   }

   public boolean a(evp $$0) {
      cwn $$1 = $$0.c(eyj.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static eyy.a a(cv.a $$0) {
      return () -> new ezf(Optional.of($$0.b()));
   }

   public Optional<cv> c() {
      return this.b;
   }
}
