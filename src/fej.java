import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fej(Optional<cn> b) implements fec {
   public static final MapCodec<fej> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cn.a.optionalFieldOf("predicate").forGetter(fej::c)).apply($$0, fej::new));

   @Override
   public fed b() {
      return fee.j;
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(fdn.i);
   }

   public boolean a(fat $$0) {
      dak $$1 = $$0.c(fdn.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static fec.a a(cn.a $$0) {
      return () -> new fej(Optional.of($$0.b()));
   }

   public Optional<cn> c() {
      return this.b;
   }
}
