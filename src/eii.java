import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eii(Optional<cb> b) implements eib {
   public static final Codec<eii> a = RecordCodecBuilder.create($$0 -> $$0.group(asy.a(cb.a, "predicate").forGetter(eii::c)).apply($$0, eii::new));

   @Override
   public eic b() {
      return eid.k;
   }

   @Override
   public Set<ehk<?>> a() {
      return ImmutableSet.of(ehn.i);
   }

   public boolean a(efc $$0) {
      clo $$1 = $$0.c(ehn.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static eib.a a(cb.a $$0) {
      return () -> new eii(Optional.of($$0.b()));
   }

   public Optional<cb> c() {
      return this.b;
   }
}
