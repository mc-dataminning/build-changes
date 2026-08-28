import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fab(Optional<bw> b, ewp.b c) implements ezy {
   public static final MapCodec<fab> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bw.a.optionalFieldOf("predicate").forGetter(fab::c), ewp.b.e.fieldOf("entity").forGetter(fab::d)).apply($$0, fab::new)
   );

   @Override
   public ezz b() {
      return faa.f;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezj.f, this.c.a());
   }

   public boolean a(ewp $$0) {
      bvk $$1 = $$0.c(this.c.a());
      fby $$2 = $$0.c(ezj.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ezy.a a(ewp.b $$0) {
      return a($$0, bw.a.a());
   }

   public static ezy.a a(ewp.b $$0, bw.a $$1) {
      return () -> new fab(Optional.of($$1.b()), $$0);
   }

   public static ezy.a a(ewp.b $$0, bw $$1) {
      return () -> new fab(Optional.of($$1), $$0);
   }

   public Optional<bw> c() {
      return this.b;
   }

   public ewp.b d() {
      return this.c;
   }
}
