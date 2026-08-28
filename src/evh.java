import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record evh(Optional<cs> b) implements eva {
   public static final MapCodec<evh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cs.a.optionalFieldOf("predicate").forGetter(evh::c)).apply($$0, evh::new));

   @Override
   public evb b() {
      return evc.j;
   }

   @Override
   public Set<eui<?>> a() {
      return ImmutableSet.of(eul.i);
   }

   public boolean a(erp $$0) {
      cuq $$1 = $$0.c(eul.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static eva.a a(cs.a $$0) {
      return () -> new evh(Optional.of($$0.b()));
   }

   public Optional<cs> c() {
      return this.b;
   }
}
