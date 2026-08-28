import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fax(Optional<bx> b, exl.b c) implements fau {
   public static final MapCodec<fax> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bx.a.optionalFieldOf("predicate").forGetter(fax::c), exl.b.e.fieldOf("entity").forGetter(fax::d)).apply($$0, fax::new)
   );

   @Override
   public fav b() {
      return faw.f;
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(faf.f, this.c.a());
   }

   public boolean a(exl $$0) {
      bvs $$1 = $$0.c(this.c.a());
      fcu $$2 = $$0.c(faf.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static fau.a a(exl.b $$0) {
      return a($$0, bx.a.a());
   }

   public static fau.a a(exl.b $$0, bx.a $$1) {
      return () -> new fax(Optional.of($$1.b()), $$0);
   }

   public static fau.a a(exl.b $$0, bx $$1) {
      return () -> new fax(Optional.of($$1), $$0);
   }

   public Optional<bx> c() {
      return this.b;
   }

   public exl.b d() {
      return this.c;
   }
}
