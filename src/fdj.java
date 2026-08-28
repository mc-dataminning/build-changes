import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdj(Optional<cm> b) implements fdc {
   public static final MapCodec<fdj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cm.a.optionalFieldOf("predicate").forGetter(fdj::c)).apply($$0, fdj::new));

   @Override
   public fdd b() {
      return fde.j;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.i);
   }

   public boolean a(ezt $$0) {
      czn $$1 = $$0.c(fcn.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static fdc.a a(cm.a $$0) {
      return () -> new fdj(Optional.of($$0.b()));
   }

   public Optional<cm> c() {
      return this.b;
   }
}
