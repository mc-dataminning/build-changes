import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fbp(Optional<bm> b) implements fbw {
   public static final MapCodec<fbp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bm.a.optionalFieldOf("predicate").forGetter(fbp::c)).apply($$0, fbp::new));

   @Override
   public fbx b() {
      return fby.m;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(fbh.f, fbh.c);
   }

   public boolean a(eyn $$0) {
      bup $$1 = $$0.c(fbh.c);
      fdw $$2 = $$0.c(fbh.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static fbw.a a(bm.a $$0) {
      return () -> new fbp(Optional.of($$0.b()));
   }

   public Optional<bm> c() {
      return this.b;
   }
}
