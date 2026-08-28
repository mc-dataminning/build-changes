import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcv(Optional<bn> b) implements fdc {
   public static final MapCodec<fcv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bn.a.optionalFieldOf("predicate").forGetter(fcv::c)).apply($$0, fcv::new));

   @Override
   public fdd b() {
      return fde.m;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.f, fcn.c);
   }

   public boolean a(ezt $$0) {
      bux $$1 = $$0.c(fcn.c);
      ffc $$2 = $$0.c(fcn.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static fdc.a a(bn.a $$0) {
      return () -> new fcv(Optional.of($$0.b()));
   }

   public Optional<bn> c() {
      return this.b;
   }
}
