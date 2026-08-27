import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etd(etg b, etg c) implements etg {
   public static final MapCodec<etd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eth.a.fieldOf("n").forGetter(etd::c), eth.a.fieldOf("p").forGetter(etd::d)).apply($$0, etd::new)
   );

   @Override
   public etf b() {
      return eth.d;
   }

   @Override
   public int a(epf $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ayk $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(epf $$0) {
      return (float)this.a($$0);
   }

   public static etd a(int $$0, float $$1) {
      return new etd(ete.a((float)$$0), ete.a($$1));
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
