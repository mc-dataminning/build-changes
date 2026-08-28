import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcj(Optional<bm> b) implements fcq {
   public static final MapCodec<fcj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bm.a.optionalFieldOf("predicate").forGetter(fcj::c)).apply($$0, fcj::new));

   @Override
   public fcr b() {
      return fcs.m;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcb.f, fcb.c);
   }

   public boolean a(ezh $$0) {
      buu $$1 = $$0.c(fcb.c);
      feq $$2 = $$0.c(fcb.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static fcq.a a(bm.a $$0) {
      return () -> new fcj(Optional.of($$0.b()));
   }

   public Optional<bm> c() {
      return this.b;
   }
}
