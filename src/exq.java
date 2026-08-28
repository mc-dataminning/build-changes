import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exq(Optional<bw> b, euc.b c) implements exn {
   public static final MapCodec<exq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bw.a.optionalFieldOf("predicate").forGetter(exq::c), euc.b.e.fieldOf("entity").forGetter(exq::d)).apply($$0, exq::new)
   );

   @Override
   public exo b() {
      return exp.f;
   }

   @Override
   public Set<ewv<?>> a() {
      return ImmutableSet.of(ewy.f, this.c.a());
   }

   public boolean a(euc $$0) {
      bue $$1 = $$0.c(this.c.a());
      ezn $$2 = $$0.c(ewy.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static exn.a a(euc.b $$0) {
      return a($$0, bw.a.a());
   }

   public static exn.a a(euc.b $$0, bw.a $$1) {
      return () -> new exq(Optional.of($$1.b()), $$0);
   }

   public static exn.a a(euc.b $$0, bw $$1) {
      return () -> new exq(Optional.of($$1), $$0);
   }

   public Optional<bw> c() {
      return this.b;
   }

   public euc.b d() {
      return this.c;
   }
}
