import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eys(Optional<bm> b) implements eyz {
   public static final MapCodec<eys> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bm.a.optionalFieldOf("predicate").forGetter(eys::c)).apply($$0, eys::new));

   @Override
   public eza b() {
      return ezb.m;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyk.f, eyk.c);
   }

   public boolean a(evq $$0) {
      bta $$1 = $$0.c(eyk.c);
      faz $$2 = $$0.c(eyk.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static eyz.a a(bm.a $$0) {
      return () -> new eys(Optional.of($$0.b()));
   }

   public Optional<bm> c() {
      return this.b;
   }
}
