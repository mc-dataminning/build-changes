import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejk(Optional<ca> b) implements ejd {
   public static final Codec<ejk> a = RecordCodecBuilder.create($$0 -> $$0.group(atg.a(ca.a, "predicate").forGetter(ejk::c)).apply($$0, ejk::new));

   @Override
   public eje b() {
      return ejf.k;
   }

   @Override
   public Set<eim<?>> a() {
      return ImmutableSet.of(eip.i);
   }

   public boolean a(ege $$0) {
      cmh $$1 = $$0.c(eip.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ejd.a a(ca.a $$0) {
      return () -> new ejk(Optional.of($$0.b()));
   }

   public Optional<ca> c() {
      return this.b;
   }
}
