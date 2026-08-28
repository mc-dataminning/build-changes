import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdz(Optional<cn> b) implements fds {
   public static final MapCodec<fdz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cn.a.optionalFieldOf("predicate").forGetter(fdz::c)).apply($$0, fdz::new));

   @Override
   public fdt b() {
      return fdu.j;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(fdd.i);
   }

   public boolean a(faj $$0) {
      daa $$1 = $$0.c(fdd.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static fds.a a(cn.a $$0) {
      return () -> new fdz(Optional.of($$0.b()));
   }

   public Optional<cn> c() {
      return this.b;
   }
}
