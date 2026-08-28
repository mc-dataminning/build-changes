import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewp(Optional<bk> b) implements eww {
   public static final MapCodec<ewp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bk.a.optionalFieldOf("predicate").forGetter(ewp::c)).apply($$0, ewp::new));

   @Override
   public ewx b() {
      return ewy.m;
   }

   @Override
   public Set<ewe<?>> a() {
      return ImmutableSet.of(ewh.f, ewh.c);
   }

   public boolean a(etl $$0) {
      bsj $$1 = $$0.c(ewh.c);
      eyw $$2 = $$0.c(ewh.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static eww.a a(bk.a $$0) {
      return () -> new ewp(Optional.of($$0.b()));
   }

   public Optional<bk> c() {
      return this.b;
   }
}
