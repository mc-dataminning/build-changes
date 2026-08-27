import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record esh(Optional<bg> b) implements esn {
   public static final MapCodec<esh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bg.a.optionalFieldOf("predicate").forGetter(esh::c)).apply($$0, esh::new));

   @Override
   public eso b() {
      return esp.o;
   }

   @Override
   public Set<erw<?>> a() {
      return ImmutableSet.of(erz.f, erz.c);
   }

   public boolean a(eph $$0) {
      bqp $$1 = $$0.c(erz.c);
      eum $$2 = $$0.c(erz.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static esn.a a(bg.a $$0) {
      return () -> new esh(Optional.of($$0.b()));
   }

   public Optional<bg> c() {
      return this.b;
   }
}
