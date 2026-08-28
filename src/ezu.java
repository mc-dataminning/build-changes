import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezu(Optional<bw> b, ewi.b c) implements ezr {
   public static final MapCodec<ezu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bw.a.optionalFieldOf("predicate").forGetter(ezu::c), ewi.b.e.fieldOf("entity").forGetter(ezu::d)).apply($$0, ezu::new)
   );

   @Override
   public ezs b() {
      return ezt.f;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(ezc.f, this.c.a());
   }

   public boolean a(ewi $$0) {
      bvb $$1 = $$0.c(this.c.a());
      fbr $$2 = $$0.c(ezc.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ezr.a a(ewi.b $$0) {
      return a($$0, bw.a.a());
   }

   public static ezr.a a(ewi.b $$0, bw.a $$1) {
      return () -> new ezu(Optional.of($$1.b()), $$0);
   }

   public static ezr.a a(ewi.b $$0, bw $$1) {
      return () -> new ezu(Optional.of($$1), $$0);
   }

   public Optional<bw> c() {
      return this.b;
   }

   public ewi.b d() {
      return this.c;
   }
}
