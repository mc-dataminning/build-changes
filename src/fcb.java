import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcb(Optional<bm> b) implements fci {
   public static final MapCodec<fcb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bm.a.optionalFieldOf("predicate").forGetter(fcb::c)).apply($$0, fcb::new));

   @Override
   public fcj b() {
      return fck.m;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.f, fbt.c);
   }

   public boolean a(eyz $$0) {
      bus $$1 = $$0.c(fbt.c);
      fei $$2 = $$0.c(fbt.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static fci.a a(bm.a $$0) {
      return () -> new fcb(Optional.of($$0.b()));
   }

   public Optional<bm> c() {
      return this.b;
   }
}
