import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eyb(Optional<bw> b, eun.b c) implements exy {
   public static final MapCodec<eyb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bw.a.optionalFieldOf("predicate").forGetter(eyb::c), eun.b.e.fieldOf("entity").forGetter(eyb::d)).apply($$0, eyb::new)
   );

   @Override
   public exz b() {
      return eya.f;
   }

   @Override
   public Set<exg<?>> a() {
      return ImmutableSet.of(exj.f, this.c.a());
   }

   public boolean a(eun $$0) {
      bul $$1 = $$0.c(this.c.a());
      ezy $$2 = $$0.c(exj.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static exy.a a(eun.b $$0) {
      return a($$0, bw.a.a());
   }

   public static exy.a a(eun.b $$0, bw.a $$1) {
      return () -> new eyb(Optional.of($$1.b()), $$0);
   }

   public static exy.a a(eun.b $$0, bw $$1) {
      return () -> new eyb(Optional.of($$1), $$0);
   }

   public Optional<bw> c() {
      return this.b;
   }

   public eun.b d() {
      return this.c;
   }
}
