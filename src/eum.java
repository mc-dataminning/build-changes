import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eum(eui b, eui c) implements eui {
   public static final MapCodec<eum> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euj.a.fieldOf("min").forGetter(eum::c), euj.a.fieldOf("max").forGetter(eum::d)).apply($$0, eum::new)
   );

   @Override
   public euh b() {
      return euj.c;
   }

   public static eum a(float $$0, float $$1) {
      return new eum(eug.a($$0), eug.a($$1));
   }

   @Override
   public int a(eqd $$0) {
      return ayu.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eqd $$0) {
      return ayu.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<esw<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eui c() {
      return this.b;
   }

   public eui d() {
      return this.c;
   }
}
