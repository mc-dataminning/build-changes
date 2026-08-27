import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egh(ege b, ege c) implements ege {
   public static final Codec<egh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egf.a.fieldOf("min").forGetter(egh::c), egf.a.fieldOf("max").forGetter(egh::d)).apply($$0, egh::new)
   );

   @Override
   public egd b() {
      return egf.c;
   }

   public static egh a(float $$0, float $$1) {
      return new egh(egc.a($$0), egc.a($$1));
   }

   @Override
   public int a(eck $$0) {
      return asb.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eck $$0) {
      return asb.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<ees<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ege c() {
      return this.b;
   }

   public ege d() {
      return this.c;
   }
}
