import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fde(Optional<cm> b) implements fcx {
   public static final MapCodec<fde> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cm.a.optionalFieldOf("predicate").forGetter(fde::c)).apply($$0, fde::new));

   @Override
   public fcy b() {
      return fcz.j;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.i);
   }

   public boolean a(ezo $$0) {
      czk $$1 = $$0.c(fci.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static fcx.a a(cm.a $$0) {
      return () -> new fde(Optional.of($$0.b()));
   }

   public Optional<cm> c() {
      return this.b;
   }
}
