import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eso(Optional<br> b, epf.b c) implements esl {
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(br.a.optionalFieldOf("predicate").forGetter(eso::c), epf.b.e.fieldOf("entity").forGetter(eso::d)).apply($$0, eso::new)
   );

   @Override
   public esm b() {
      return esn.h;
   }

   @Override
   public Set<eru<?>> a() {
      return ImmutableSet.of(erx.f, this.c.a());
   }

   public boolean a(epf $$0) {
      bru $$1 = $$0.c(this.c.a());
      euk $$2 = $$0.c(erx.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static esl.a a(epf.b $$0) {
      return a($$0, br.a.a());
   }

   public static esl.a a(epf.b $$0, br.a $$1) {
      return () -> new eso(Optional.of($$1.b()), $$0);
   }

   public static esl.a a(epf.b $$0, br $$1) {
      return () -> new eso(Optional.of($$1), $$0);
   }

   public Optional<br> c() {
      return this.b;
   }

   public epf.b d() {
      return this.c;
   }
}
