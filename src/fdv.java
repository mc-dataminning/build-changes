import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdv(Optional<bz> b, faj.b c) implements fds {
   public static final MapCodec<fdv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bz.a.optionalFieldOf("predicate").forGetter(fdv::c), faj.b.e.fieldOf("entity").forGetter(fdv::d)).apply($$0, fdv::new)
   );

   @Override
   public fdt b() {
      return fdu.f;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(fdd.f, this.c.a());
   }

   public boolean a(faj $$0) {
      bwv $$1 = $$0.c(this.c.a());
      ffs $$2 = $$0.c(fdd.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static fds.a a(faj.b $$0) {
      return a($$0, bz.a.a());
   }

   public static fds.a a(faj.b $$0, bz.a $$1) {
      return () -> new fdv(Optional.of($$1.b()), $$0);
   }

   public static fds.a a(faj.b $$0, bz $$1) {
      return () -> new fdv(Optional.of($$1), $$0);
   }

   public Optional<bz> c() {
      return this.b;
   }

   public faj.b d() {
      return this.c;
   }
}
