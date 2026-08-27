import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record emb(Optional<cc> b) implements elu {
   public static final Codec<emb> a = RecordCodecBuilder.create($$0 -> $$0.group(avp.a(cc.a, "predicate").forGetter(emb::c)).apply($$0, emb::new));

   @Override
   public elv b() {
      return elw.k;
   }

   @Override
   public Set<eld<?>> a() {
      return ImmutableSet.of(elg.i);
   }

   public boolean a(eiv $$0) {
      coz $$1 = $$0.c(elg.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static elu.a a(cc.a $$0) {
      return () -> new emb(Optional.of($$0.b()));
   }

   public Optional<cc> c() {
      return this.b;
   }
}
