import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record esu(Optional<ch> b) implements esn {
   public static final MapCodec<esu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ch.a.optionalFieldOf("predicate").forGetter(esu::c)).apply($$0, esu::new));

   @Override
   public eso b() {
      return esp.l;
   }

   @Override
   public Set<erw<?>> a() {
      return ImmutableSet.of(erz.i);
   }

   public boolean a(eph $$0) {
      ctq $$1 = $$0.c(erz.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static esn.a a(ch.a $$0) {
      return () -> new esu(Optional.of($$0.b()));
   }

   public Optional<ch> c() {
      return this.b;
   }
}
