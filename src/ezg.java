import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezg(Optional<cv> b) implements eyz {
   public static final MapCodec<ezg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cv.a.optionalFieldOf("predicate").forGetter(ezg::c)).apply($$0, ezg::new));

   @Override
   public eza b() {
      return ezb.j;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyk.i);
   }

   public boolean a(evq $$0) {
      cwo $$1 = $$0.c(eyk.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static eyz.a a(cv.a $$0) {
      return () -> new ezg(Optional.of($$0.b()));
   }

   public Optional<cv> c() {
      return this.b;
   }
}
