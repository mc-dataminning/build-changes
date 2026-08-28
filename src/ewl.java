import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewl(Optional<cs> b) implements ewe {
   public static final MapCodec<ewl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cs.a.optionalFieldOf("predicate").forGetter(ewl::c)).apply($$0, ewl::new));

   @Override
   public ewf b() {
      return ewg.j;
   }

   @Override
   public Set<evm<?>> a() {
      return ImmutableSet.of(evp.i);
   }

   public boolean a(est $$0) {
      cvl $$1 = $$0.c(evp.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ewe.a a(cs.a $$0) {
      return () -> new ewl(Optional.of($$0.b()));
   }

   public Optional<cs> c() {
      return this.b;
   }
}
