import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezb(Optional<bx> b, evp.b c) implements eyy {
   public static final MapCodec<ezb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bx.a.optionalFieldOf("predicate").forGetter(ezb::c), evp.b.e.fieldOf("entity").forGetter(ezb::d)).apply($$0, ezb::new)
   );

   @Override
   public eyz b() {
      return eza.f;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(eyj.f, this.c.a());
   }

   public boolean a(evp $$0) {
      buj $$1 = $$0.c(this.c.a());
      fay $$2 = $$0.c(eyj.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static eyy.a a(evp.b $$0) {
      return a($$0, bx.a.a());
   }

   public static eyy.a a(evp.b $$0, bx.a $$1) {
      return () -> new ezb(Optional.of($$1.b()), $$0);
   }

   public static eyy.a a(evp.b $$0, bx $$1) {
      return () -> new ezb(Optional.of($$1), $$0);
   }

   public Optional<bx> c() {
      return this.b;
   }

   public evp.b d() {
      return this.c;
   }
}
