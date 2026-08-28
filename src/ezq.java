import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezq(Optional<bl> b) implements ezx {
   public static final MapCodec<ezq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bl.a.optionalFieldOf("predicate").forGetter(ezq::c)).apply($$0, ezq::new));

   @Override
   public ezy b() {
      return ezz.m;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezi.f, ezi.c);
   }

   public boolean a(ewo $$0) {
      btz $$1 = $$0.c(ezi.c);
      fbx $$2 = $$0.c(ezi.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ezx.a a(bl.a $$0) {
      return () -> new ezq(Optional.of($$0.b()));
   }

   public Optional<bl> c() {
      return this.b;
   }
}
