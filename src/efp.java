import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efp(egb b, ecg c) implements efg {
   public static final Codec<efp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egc.a.fieldOf("value").forGetter(efp::c), ecg.a.fieldOf("range").forGetter(efp::d)).apply($$0, efp::new)
   );

   @Override
   public efh b() {
      return efi.s;
   }

   @Override
   public Set<eep<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ech $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static efg.a a(egb $$0, ecg $$1) {
      return () -> new efp($$0, $$1);
   }

   public egb c() {
      return this.b;
   }

   public ecg d() {
      return this.c;
   }
}
