import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eie(Optional<bq> b, efc.b c) implements eib {
   public static final Codec<eie> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asy.a(bq.a, "predicate").forGetter(eie::c), efc.b.e.fieldOf("entity").forGetter(eie::d)).apply($$0, eie::new)
   );

   @Override
   public eic b() {
      return eid.g;
   }

   @Override
   public Set<ehk<?>> a() {
      return ImmutableSet.of(ehn.f, this.c.a());
   }

   public boolean a(efc $$0) {
      bkv $$1 = $$0.c(this.c.a());
      ejz $$2 = $$0.c(ehn.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static eib.a a(efc.b $$0) {
      return a($$0, bq.a.a());
   }

   public static eib.a a(efc.b $$0, bq.a $$1) {
      return () -> new eie(Optional.of($$1.b()), $$0);
   }

   public static eib.a a(efc.b $$0, bq $$1) {
      return () -> new eie(Optional.of($$1), $$0);
   }

   public Optional<bq> c() {
      return this.b;
   }

   public efc.b d() {
      return this.c;
   }
}
