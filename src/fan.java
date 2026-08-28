import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fan(Optional<bm> b) implements fau {
   public static final MapCodec<fan> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bm.a.optionalFieldOf("predicate").forGetter(fan::c)).apply($$0, fan::new));

   @Override
   public fav b() {
      return faw.m;
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(faf.f, faf.c);
   }

   public boolean a(exl $$0) {
      buh $$1 = $$0.c(faf.c);
      fcu $$2 = $$0.c(faf.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static fau.a a(bm.a $$0) {
      return () -> new fan(Optional.of($$0.b()));
   }

   public Optional<bm> c() {
      return this.b;
   }
}
