import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdt(Optional<by> b, fah.b c) implements fdq {
   public static final MapCodec<fdt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(by.a.optionalFieldOf("predicate").forGetter(fdt::c), fah.b.e.fieldOf("entity").forGetter(fdt::d)).apply($$0, fdt::new)
   );

   @Override
   public fdr b() {
      return fds.f;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.f, this.c.a());
   }

   public boolean a(fah $$0) {
      bwt $$1 = $$0.c(this.c.a());
      ffq $$2 = $$0.c(fdb.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static fdq.a a(fah.b $$0) {
      return a($$0, by.a.a());
   }

   public static fdq.a a(fah.b $$0, by.a $$1) {
      return () -> new fdt(Optional.of($$1.b()), $$0);
   }

   public static fdq.a a(fah.b $$0, by $$1) {
      return () -> new fdt(Optional.of($$1), $$0);
   }

   public Optional<by> c() {
      return this.b;
   }

   public fah.b d() {
      return this.c;
   }
}
