import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewz(Optional<bv> b, etl.b c) implements eww {
   public static final MapCodec<ewz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bv.a.optionalFieldOf("predicate").forGetter(ewz::c), etl.b.e.fieldOf("entity").forGetter(ewz::d)).apply($$0, ewz::new)
   );

   @Override
   public ewx b() {
      return ewy.f;
   }

   @Override
   public Set<ewe<?>> a() {
      return ImmutableSet.of(ewh.f, this.c.a());
   }

   public boolean a(etl $$0) {
      btr $$1 = $$0.c(this.c.a());
      eyw $$2 = $$0.c(ewh.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static eww.a a(etl.b $$0) {
      return a($$0, bv.a.a());
   }

   public static eww.a a(etl.b $$0, bv.a $$1) {
      return () -> new ewz(Optional.of($$1.b()), $$0);
   }

   public static eww.a a(etl.b $$0, bv $$1) {
      return () -> new ewz(Optional.of($$1), $$0);
   }

   public Optional<bv> c() {
      return this.b;
   }

   public etl.b d() {
      return this.c;
   }
}
