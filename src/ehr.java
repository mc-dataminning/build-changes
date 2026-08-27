import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ehr(Optional<cb> b) implements ehk {
   public static final Codec<ehr> a = RecordCodecBuilder.create($$0 -> $$0.group(asq.a(cb.a, "predicate").forGetter(ehr::c)).apply($$0, ehr::new));

   @Override
   public ehl b() {
      return ehm.k;
   }

   @Override
   public Set<egt<?>> a() {
      return ImmutableSet.of(egw.i);
   }

   public boolean a(eel $$0) {
      clb $$1 = $$0.c(egw.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ehk.a a(cb.a $$0) {
      return () -> new ehr(Optional.of($$0.b()));
   }

   public Optional<cb> c() {
      return this.b;
   }
}
