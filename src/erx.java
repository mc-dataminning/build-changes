import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record erx(Optional<ch> b) implements erq {
   public static final Codec<erx> a = RecordCodecBuilder.create($$0 -> $$0.group(axh.a(ch.a, "predicate").forGetter(erx::c)).apply($$0, erx::new));

   @Override
   public err b() {
      return ers.l;
   }

   @Override
   public Set<eqz<?>> a() {
      return ImmutableSet.of(erc.i);
   }

   public boolean a(eol $$0) {
      csz $$1 = $$0.c(erc.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static erq.a a(ch.a $$0) {
      return () -> new erx(Optional.of($$0.b()));
   }

   public Optional<ch> c() {
      return this.b;
   }
}
