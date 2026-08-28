import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezd(Optional<bx> b, evr.b c) implements eza {
   public static final MapCodec<ezd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bx.a.optionalFieldOf("predicate").forGetter(ezd::c), evr.b.e.fieldOf("entity").forGetter(ezd::d)).apply($$0, ezd::new)
   );

   @Override
   public ezb b() {
      return ezc.f;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.f, this.c.a());
   }

   public boolean a(evr $$0) {
      bul $$1 = $$0.c(this.c.a());
      fba $$2 = $$0.c(eyl.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static eza.a a(evr.b $$0) {
      return a($$0, bx.a.a());
   }

   public static eza.a a(evr.b $$0, bx.a $$1) {
      return () -> new ezd(Optional.of($$1.b()), $$0);
   }

   public static eza.a a(evr.b $$0, bx $$1) {
      return () -> new ezd(Optional.of($$1), $$0);
   }

   public Optional<bx> c() {
      return this.b;
   }

   public evr.b d() {
      return this.c;
   }
}
