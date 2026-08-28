import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbk(jq<daa> d, int e, int f) implements dbh {
   public static final int b = 10000;
   public static final MapCodec<dbk> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kb.a(lu.aL).fieldOf("enchantments").forGetter(dbk::b),
               axv.a(1, 10000).fieldOf("min_cost").forGetter(dbk::c),
               axv.a(0, 10000).fieldOf("max_cost_span").forGetter(dbk::d)
            )
            .apply($$0, dbk::new)
   );

   @Override
   public void a(cuo $$0, dag.a $$1, ayv $$2, bqo $$3) {
      float $$4 = $$3.d();
      int $$5 = ayn.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dad $$7 : dac.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dbk> a() {
      return c;
   }

   public jq<daa> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
