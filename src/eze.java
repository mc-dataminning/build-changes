import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eze(Optional<bx> b, evs.b c) implements ezb {
   public static final MapCodec<eze> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bx.a.optionalFieldOf("predicate").forGetter(eze::c), evs.b.e.fieldOf("entity").forGetter(eze::d)).apply($$0, eze::new)
   );

   @Override
   public ezc b() {
      return ezd.f;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eym.f, this.c.a());
   }

   public boolean a(evs $$0) {
      bum $$1 = $$0.c(this.c.a());
      fbb $$2 = $$0.c(eym.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ezb.a a(evs.b $$0) {
      return a($$0, bx.a.a());
   }

   public static ezb.a a(evs.b $$0, bx.a $$1) {
      return () -> new eze(Optional.of($$1.b()), $$0);
   }

   public static ezb.a a(evs.b $$0, bx $$1) {
      return () -> new eze(Optional.of($$1), $$0);
   }

   public Optional<bx> c() {
      return this.b;
   }

   public evs.b d() {
      return this.c;
   }
}
