import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdx(Optional<cm> b) implements fdq {
   public static final MapCodec<fdx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cm.a.optionalFieldOf("predicate").forGetter(fdx::c)).apply($$0, fdx::new));

   @Override
   public fdr b() {
      return fds.j;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.i);
   }

   public boolean a(fah $$0) {
      czy $$1 = $$0.c(fdb.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static fdq.a a(cm.a $$0) {
      return () -> new fdx(Optional.of($$0.b()));
   }

   public Optional<cm> c() {
      return this.b;
   }
}
