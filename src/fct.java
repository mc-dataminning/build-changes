import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fct(Optional<bx> b, ezh.b c) implements fcq {
   public static final MapCodec<fct> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bx.a.optionalFieldOf("predicate").forGetter(fct::c), ezh.b.e.fieldOf("entity").forGetter(fct::d)).apply($$0, fct::new)
   );

   @Override
   public fcr b() {
      return fcs.f;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcb.f, this.c.a());
   }

   public boolean a(ezh $$0) {
      bwf $$1 = $$0.c(this.c.a());
      feq $$2 = $$0.c(fcb.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static fcq.a a(ezh.b $$0) {
      return a($$0, bx.a.a());
   }

   public static fcq.a a(ezh.b $$0, bx.a $$1) {
      return () -> new fct(Optional.of($$1.b()), $$0);
   }

   public static fcq.a a(ezh.b $$0, bx $$1) {
      return () -> new fct(Optional.of($$1), $$0);
   }

   public Optional<bx> c() {
      return this.b;
   }

   public ezh.b d() {
      return this.c;
   }
}
