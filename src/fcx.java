import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcx(Optional<cl> b) implements fcq {
   public static final MapCodec<fcx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cl.a.optionalFieldOf("predicate").forGetter(fcx::c)).apply($$0, fcx::new));

   @Override
   public fcr b() {
      return fcs.j;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcb.i);
   }

   public boolean a(ezh $$0) {
      czd $$1 = $$0.c(fcb.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static fcq.a a(cl.a $$0) {
      return () -> new fcx(Optional.of($$0.b()));
   }

   public Optional<cl> c() {
      return this.b;
   }
}
