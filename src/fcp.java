import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcp(Optional<cl> b) implements fci {
   public static final MapCodec<fcp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cl.a.optionalFieldOf("predicate").forGetter(fcp::c)).apply($$0, fcp::new));

   @Override
   public fcj b() {
      return fck.j;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.i);
   }

   public boolean a(eyz $$0) {
      cyy $$1 = $$0.c(fbt.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static fci.a a(cl.a $$0) {
      return () -> new fcp(Optional.of($$0.b()));
   }

   public Optional<cl> c() {
      return this.b;
   }
}
