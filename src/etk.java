import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etk(etg b, etg c) implements etg {
   public static final MapCodec<etk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eth.a.fieldOf("min").forGetter(etk::c), eth.a.fieldOf("max").forGetter(etk::d)).apply($$0, etk::new)
   );

   @Override
   public etf b() {
      return eth.c;
   }

   public static etk a(float $$0, float $$1) {
      return new etk(ete.a($$0), ete.a($$1));
   }

   @Override
   public int a(epf $$0) {
      return ayd.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(epf $$0) {
      return ayd.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eru<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public etg c() {
      return this.b;
   }

   public etg d() {
      return this.c;
   }
}
