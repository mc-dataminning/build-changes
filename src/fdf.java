import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdf(Optional<by> b, ezt.b c) implements fdc {
   public static final MapCodec<fdf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(by.a.optionalFieldOf("predicate").forGetter(fdf::c), ezt.b.e.fieldOf("entity").forGetter(fdf::d)).apply($$0, fdf::new)
   );

   @Override
   public fdd b() {
      return fde.f;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.f, this.c.a());
   }

   public boolean a(ezt $$0) {
      bwi $$1 = $$0.c(this.c.a());
      ffc $$2 = $$0.c(fcn.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static fdc.a a(ezt.b $$0) {
      return a($$0, by.a.a());
   }

   public static fdc.a a(ezt.b $$0, by.a $$1) {
      return () -> new fdf(Optional.of($$1.b()), $$0);
   }

   public static fdc.a a(ezt.b $$0, by $$1) {
      return () -> new fdf(Optional.of($$1), $$0);
   }

   public Optional<by> c() {
      return this.b;
   }

   public ezt.b d() {
      return this.c;
   }
}
