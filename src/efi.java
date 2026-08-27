import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efi(Optional<bo> b, ecg.b c) implements eff {
   public static final Codec<efi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.a(bo.a, "predicate").forGetter(efi::c), ecg.b.e.fieldOf("entity").forGetter(efi::d)).apply($$0, efi::new)
   );

   @Override
   public efg b() {
      return efh.g;
   }

   @Override
   public Set<eeo<?>> a() {
      return ImmutableSet.of(eer.f, this.c.a());
   }

   public boolean a(ecg $$0) {
      bii $$1 = $$0.c(this.c.a());
      ehd $$2 = $$0.c(eer.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static eff.a a(ecg.b $$0) {
      return a($$0, bo.a.a());
   }

   public static eff.a a(ecg.b $$0, bo.a $$1) {
      return () -> new efi($$1.b(), $$0);
   }

   public static eff.a a(ecg.b $$0, bo $$1) {
      return () -> new efi(Optional.of($$1), $$0);
   }

   public Optional<bo> c() {
      return this.b;
   }

   public ecg.b d() {
      return this.c;
   }
}
