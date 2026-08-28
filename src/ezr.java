import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezr(Optional<bl> b) implements ezy {
   public static final MapCodec<ezr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bl.a.optionalFieldOf("predicate").forGetter(ezr::c)).apply($$0, ezr::new));

   @Override
   public ezz b() {
      return faa.m;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezj.f, ezj.c);
   }

   public boolean a(ewp $$0) {
      bua $$1 = $$0.c(ezj.c);
      fby $$2 = $$0.c(ezj.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ezy.a a(bl.a $$0) {
      return () -> new ezr(Optional.of($$0.b()));
   }

   public Optional<bl> c() {
      return this.b;
   }
}
