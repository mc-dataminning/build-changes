import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fef(Optional<bz> b, fat.b c) implements fec {
   public static final MapCodec<fef> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bz.a.optionalFieldOf("predicate").forGetter(fef::c), fat.b.e.fieldOf("entity").forGetter(fef::d)).apply($$0, fef::new)
   );

   @Override
   public fed b() {
      return fee.f;
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(fdn.f, this.c.a());
   }

   public boolean a(fat $$0) {
      bxe $$1 = $$0.c(this.c.a());
      fgc $$2 = $$0.c(fdn.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static fec.a a(fat.b $$0) {
      return a($$0, bz.a.a());
   }

   public static fec.a a(fat.b $$0, bz.a $$1) {
      return () -> new fef(Optional.of($$1.b()), $$0);
   }

   public static fec.a a(fat.b $$0, bz $$1) {
      return () -> new fef(Optional.of($$1), $$0);
   }

   public Optional<bz> c() {
      return this.b;
   }

   public fat.b d() {
      return this.c;
   }
}
