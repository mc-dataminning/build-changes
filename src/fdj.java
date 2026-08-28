import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdj(Optional<bn> b) implements fdq {
   public static final MapCodec<fdj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bn.a.optionalFieldOf("predicate").forGetter(fdj::c)).apply($$0, fdj::new));

   @Override
   public fdr b() {
      return fds.m;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.f, fdb.c);
   }

   public boolean a(fah $$0) {
      bvi $$1 = $$0.c(fdb.c);
      ffq $$2 = $$0.c(fdb.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static fdq.a a(bn.a $$0) {
      return () -> new fdj(Optional.of($$0.b()));
   }

   public Optional<bn> c() {
      return this.b;
   }
}
