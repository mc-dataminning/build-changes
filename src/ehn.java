import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ehn(Optional<bq> b, eel.b c) implements ehk {
   public static final Codec<ehn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asq.a(bq.a, "predicate").forGetter(ehn::c), eel.b.e.fieldOf("entity").forGetter(ehn::d)).apply($$0, ehn::new)
   );

   @Override
   public ehl b() {
      return ehm.g;
   }

   @Override
   public Set<egt<?>> a() {
      return ImmutableSet.of(egw.f, this.c.a());
   }

   public boolean a(eel $$0) {
      bki $$1 = $$0.c(this.c.a());
      eji $$2 = $$0.c(egw.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ehk.a a(eel.b $$0) {
      return a($$0, bq.a.a());
   }

   public static ehk.a a(eel.b $$0, bq.a $$1) {
      return () -> new ehn(Optional.of($$1.b()), $$0);
   }

   public static ehk.a a(eel.b $$0, bq $$1) {
      return () -> new ehn(Optional.of($$1), $$0);
   }

   public Optional<bq> c() {
      return this.b;
   }

   public eel.b d() {
      return this.c;
   }
}
