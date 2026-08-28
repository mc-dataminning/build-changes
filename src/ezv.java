import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezv(Optional<bw> b, ewh.b c) implements ezs {
   public static final MapCodec<ezv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bw.a.optionalFieldOf("predicate").forGetter(ezv::c), ewh.b.e.fieldOf("entity").forGetter(ezv::d)).apply($$0, ezv::new)
   );

   @Override
   public ezt b() {
      return ezu.f;
   }

   @Override
   public Set<eza<?>> a() {
      return ImmutableSet.of(ezd.f, this.c.a());
   }

   public boolean a(ewh $$0) {
      bvf $$1 = $$0.c(this.c.a());
      fbs $$2 = $$0.c(ezd.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ezs.a a(ewh.b $$0) {
      return a($$0, bw.a.a());
   }

   public static ezs.a a(ewh.b $$0, bw.a $$1) {
      return () -> new ezv(Optional.of($$1.b()), $$0);
   }

   public static ezs.a a(ewh.b $$0, bw $$1) {
      return () -> new ezv(Optional.of($$1), $$0);
   }

   public Optional<bw> c() {
      return this.b;
   }

   public ewh.b d() {
      return this.c;
   }
}
