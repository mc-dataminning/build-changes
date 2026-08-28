import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdv(Optional<bn> b) implements fec {
   public static final MapCodec<fdv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bn.a.optionalFieldOf("predicate").forGetter(fdv::c)).apply($$0, fdv::new));

   @Override
   public fed b() {
      return fee.m;
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(fdn.f, fdn.c);
   }

   public boolean a(fat $$0) {
      bvt $$1 = $$0.c(fdn.c);
      fgc $$2 = $$0.c(fdn.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static fec.a a(bn.a $$0) {
      return () -> new fdv(Optional.of($$0.b()));
   }

   public Optional<bn> c() {
      return this.b;
   }
}
