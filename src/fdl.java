import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdl(Optional<bn> b) implements fds {
   public static final MapCodec<fdl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bn.a.optionalFieldOf("predicate").forGetter(fdl::c)).apply($$0, fdl::new));

   @Override
   public fdt b() {
      return fdu.m;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(fdd.f, fdd.c);
   }

   public boolean a(faj $$0) {
      bvk $$1 = $$0.c(fdd.c);
      ffs $$2 = $$0.c(fdd.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static fds.a a(bn.a $$0) {
      return () -> new fdl(Optional.of($$0.b()));
   }

   public Optional<bn> c() {
      return this.b;
   }
}
