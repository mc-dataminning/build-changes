import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcd(Optional<cl> b) implements fbw {
   public static final MapCodec<fcd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cl.a.optionalFieldOf("predicate").forGetter(fcd::c)).apply($$0, fcd::new));

   @Override
   public fbx b() {
      return fby.j;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(fbh.i);
   }

   public boolean a(eyn $$0) {
      cys $$1 = $$0.c(fbh.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static fbw.a a(cl.a $$0) {
      return () -> new fcd(Optional.of($$0.b()));
   }

   public Optional<cl> c() {
      return this.b;
   }
}
