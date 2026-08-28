import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcl(Optional<bx> b, eyz.b c) implements fci {
   public static final MapCodec<fcl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bx.a.optionalFieldOf("predicate").forGetter(fcl::c), eyz.b.e.fieldOf("entity").forGetter(fcl::d)).apply($$0, fcl::new)
   );

   @Override
   public fcj b() {
      return fck.f;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.f, this.c.a());
   }

   public boolean a(eyz $$0) {
      bwd $$1 = $$0.c(this.c.a());
      fei $$2 = $$0.c(fbt.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static fci.a a(eyz.b $$0) {
      return a($$0, bx.a.a());
   }

   public static fci.a a(eyz.b $$0, bx.a $$1) {
      return () -> new fcl(Optional.of($$1.b()), $$0);
   }

   public static fci.a a(eyz.b $$0, bx $$1) {
      return () -> new fcl(Optional.of($$1), $$0);
   }

   public Optional<bx> c() {
      return this.b;
   }

   public eyz.b d() {
      return this.c;
   }
}
