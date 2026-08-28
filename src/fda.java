import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fda(Optional<by> b, ezo.b c) implements fcx {
   public static final MapCodec<fda> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(by.a.optionalFieldOf("predicate").forGetter(fda::c), ezo.b.e.fieldOf("entity").forGetter(fda::d)).apply($$0, fda::new)
   );

   @Override
   public fcy b() {
      return fcz.f;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.f, this.c.a());
   }

   public boolean a(ezo $$0) {
      bwi $$1 = $$0.c(this.c.a());
      fex $$2 = $$0.c(fci.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static fcx.a a(ezo.b $$0) {
      return a($$0, by.a.a());
   }

   public static fcx.a a(ezo.b $$0, by.a $$1) {
      return () -> new fda(Optional.of($$1.b()), $$0);
   }

   public static fcx.a a(ezo.b $$0, by $$1) {
      return () -> new fda(Optional.of($$1), $$0);
   }

   public Optional<by> c() {
      return this.b;
   }

   public ezo.b d() {
      return this.c;
   }
}
