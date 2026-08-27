import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejx(Optional<bp> b, egv.b c) implements eju {
   public static final Codec<ejx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atv.a(bp.a, "predicate").forGetter(ejx::c), egv.b.e.fieldOf("entity").forGetter(ejx::d)).apply($$0, ejx::new)
   );

   @Override
   public ejv b() {
      return ejw.g;
   }

   @Override
   public Set<ejd<?>> a() {
      return ImmutableSet.of(ejg.f, this.c.a());
   }

   public boolean a(egv $$0) {
      blu $$1 = $$0.c(this.c.a());
      els $$2 = $$0.c(ejg.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static eju.a a(egv.b $$0) {
      return a($$0, bp.a.a());
   }

   public static eju.a a(egv.b $$0, bp.a $$1) {
      return () -> new ejx(Optional.of($$1.b()), $$0);
   }

   public static eju.a a(egv.b $$0, bp $$1) {
      return () -> new ejx(Optional.of($$1), $$0);
   }

   public Optional<bp> c() {
      return this.b;
   }

   public egv.b d() {
      return this.c;
   }
}
