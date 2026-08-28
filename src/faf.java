import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record faf(Optional<cu> b) implements ezy {
   public static final MapCodec<faf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cu.a.optionalFieldOf("predicate").forGetter(faf::c)).apply($$0, faf::new));

   @Override
   public ezz b() {
      return faa.j;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezj.i);
   }

   public boolean a(ewp $$0) {
      cxp $$1 = $$0.c(ezj.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ezy.a a(cu.a $$0) {
      return () -> new faf(Optional.of($$0.b()));
   }

   public Optional<cu> c() {
      return this.b;
   }
}
