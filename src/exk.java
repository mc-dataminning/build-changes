import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exk(Optional<bv> b, etw.b c) implements exh {
   public static final MapCodec<exk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bv.a.optionalFieldOf("predicate").forGetter(exk::c), etw.b.e.fieldOf("entity").forGetter(exk::d)).apply($$0, exk::new)
   );

   @Override
   public exi b() {
      return exj.f;
   }

   @Override
   public Set<ewp<?>> a() {
      return ImmutableSet.of(ews.f, this.c.a());
   }

   public boolean a(etw $$0) {
      btz $$1 = $$0.c(this.c.a());
      ezh $$2 = $$0.c(ews.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static exh.a a(etw.b $$0) {
      return a($$0, bv.a.a());
   }

   public static exh.a a(etw.b $$0, bv.a $$1) {
      return () -> new exk(Optional.of($$1.b()), $$0);
   }

   public static exh.a a(etw.b $$0, bv $$1) {
      return () -> new exk(Optional.of($$1), $$0);
   }

   public Optional<bv> c() {
      return this.b;
   }

   public etw.b d() {
      return this.c;
   }
}
