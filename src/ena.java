import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ena(Optional<br> b, ejy.b c) implements emx {
   public static final Codec<ena> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avu.a(br.a, "predicate").forGetter(ena::c), ejy.b.e.fieldOf("entity").forGetter(ena::d)).apply($$0, ena::new)
   );

   @Override
   public emy b() {
      return emz.g;
   }

   @Override
   public Set<emg<?>> a() {
      return ImmutableSet.of(emj.f, this.c.a());
   }

   public boolean a(ejy $$0) {
      bof $$1 = $$0.c(this.c.a());
      eov $$2 = $$0.c(emj.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static emx.a a(ejy.b $$0) {
      return a($$0, br.a.a());
   }

   public static emx.a a(ejy.b $$0, br.a $$1) {
      return () -> new ena(Optional.of($$1.b()), $$0);
   }

   public static emx.a a(ejy.b $$0, br $$1) {
      return () -> new ena(Optional.of($$1), $$0);
   }

   public Optional<br> c() {
      return this.b;
   }

   public ejy.b d() {
      return this.c;
   }
}
