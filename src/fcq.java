import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcq(Optional<bn> b) implements fcx {
   public static final MapCodec<fcq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bn.a.optionalFieldOf("predicate").forGetter(fcq::c)).apply($$0, fcq::new));

   @Override
   public fcy b() {
      return fcz.m;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.f, fci.c);
   }

   public boolean a(ezo $$0) {
      bux $$1 = $$0.c(fci.c);
      fex $$2 = $$0.c(fci.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static fcx.a a(bn.a $$0) {
      return () -> new fcq(Optional.of($$0.b()));
   }

   public Optional<bn> c() {
      return this.b;
   }
}
