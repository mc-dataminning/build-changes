import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eyu(Optional<bm> b) implements ezb {
   public static final MapCodec<eyu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bm.a.optionalFieldOf("predicate").forGetter(eyu::c)).apply($$0, eyu::new));

   @Override
   public ezc b() {
      return ezd.m;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eym.f, eym.c);
   }

   public boolean a(evs $$0) {
      btc $$1 = $$0.c(eym.c);
      fbb $$2 = $$0.c(eym.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ezb.a a(bm.a $$0) {
      return () -> new eyu(Optional.of($$0.b()));
   }

   public Optional<bm> c() {
      return this.b;
   }
}
