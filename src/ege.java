import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ege(egb b, egb c) implements egb {
   public static final Codec<ege> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egc.a.fieldOf("min").forGetter(ege::c), egc.a.fieldOf("max").forGetter(ege::d)).apply($$0, ege::new)
   );

   @Override
   public ega b() {
      return egc.c;
   }

   public static ege a(float $$0, float $$1) {
      return new ege(efz.a($$0), efz.a($$1));
   }

   @Override
   public int a(ech $$0) {
      return arp.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ech $$0) {
      return arp.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eep<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public egb c() {
      return this.b;
   }

   public egb d() {
      return this.c;
   }
}
