import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezc(Optional<bx> b, evq.b c) implements eyz {
   public static final MapCodec<ezc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bx.a.optionalFieldOf("predicate").forGetter(ezc::c), evq.b.e.fieldOf("entity").forGetter(ezc::d)).apply($$0, ezc::new)
   );

   @Override
   public eza b() {
      return ezb.f;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyk.f, this.c.a());
   }

   public boolean a(evq $$0) {
      buk $$1 = $$0.c(this.c.a());
      faz $$2 = $$0.c(eyk.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static eyz.a a(evq.b $$0) {
      return a($$0, bx.a.a());
   }

   public static eyz.a a(evq.b $$0, bx.a $$1) {
      return () -> new ezc(Optional.of($$1.b()), $$0);
   }

   public static eyz.a a(evq.b $$0, bx $$1) {
      return () -> new ezc(Optional.of($$1), $$0);
   }

   public Optional<bx> c() {
      return this.b;
   }

   public evq.b d() {
      return this.c;
   }
}
