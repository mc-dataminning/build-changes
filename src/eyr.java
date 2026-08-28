import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eyr(Optional<bm> b) implements eyy {
   public static final MapCodec<eyr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bm.a.optionalFieldOf("predicate").forGetter(eyr::c)).apply($$0, eyr::new));

   @Override
   public eyz b() {
      return eza.m;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(eyj.f, eyj.c);
   }

   public boolean a(evp $$0) {
      bsz $$1 = $$0.c(eyj.c);
      fay $$2 = $$0.c(eyj.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static eyy.a a(bm.a $$0) {
      return () -> new eyr(Optional.of($$0.b()));
   }

   public Optional<bm> c() {
      return this.b;
   }
}
