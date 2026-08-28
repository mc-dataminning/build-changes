import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbl(jq<dac> c, bpw d) implements dbj {
   public static final MapCodec<dbl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.a(lu.aL).fieldOf("enchantments").forGetter(dbl::b), bpw.c.fieldOf("cost").forGetter(dbl::c)).apply($$0, dbl::new)
   );

   @Override
   public void a(cuq $$0, dai.a $$1, ayw $$2, bqp $$3) {
      for (daf $$5 : dae.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dbl> a() {
      return b;
   }

   public jq<dac> b() {
      return this.c;
   }

   public bpw c() {
      return this.d;
   }
}
