import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record elx(Optional<br> b, eiv.b c) implements elu {
   public static final Codec<elx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avp.a(br.a, "predicate").forGetter(elx::c), eiv.b.e.fieldOf("entity").forGetter(elx::d)).apply($$0, elx::new)
   );

   @Override
   public elv b() {
      return elw.g;
   }

   @Override
   public Set<eld<?>> a() {
      return ImmutableSet.of(elg.f, this.c.a());
   }

   public boolean a(eiv $$0) {
      bno $$1 = $$0.c(this.c.a());
      ens $$2 = $$0.c(elg.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static elu.a a(eiv.b $$0) {
      return a($$0, br.a.a());
   }

   public static elu.a a(eiv.b $$0, br.a $$1) {
      return () -> new elx(Optional.of($$1.b()), $$0);
   }

   public static elu.a a(eiv.b $$0, br $$1) {
      return () -> new elx(Optional.of($$1), $$0);
   }

   public Optional<br> c() {
      return this.b;
   }

   public eiv.b d() {
      return this.c;
   }
}
