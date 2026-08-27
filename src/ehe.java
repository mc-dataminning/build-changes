import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ehe(Optional<bf> b) implements ehk {
   public static final Codec<ehe> a = RecordCodecBuilder.create($$0 -> $$0.group(asq.a(bf.a, "predicate").forGetter(ehe::c)).apply($$0, ehe::new));

   @Override
   public ehl b() {
      return ehm.n;
   }

   @Override
   public Set<egt<?>> a() {
      return ImmutableSet.of(egw.f, egw.c);
   }

   public boolean a(eel $$0) {
      bjg $$1 = $$0.c(egw.c);
      eji $$2 = $$0.c(egw.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ehk.a a(bf.a $$0) {
      return () -> new ehe(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
