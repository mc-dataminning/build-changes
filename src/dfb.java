import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfb(ju<ddr> c, bsj d) implements dez {
   public static final MapCodec<dfb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(mb.aN).fieldOf("enchantments").forGetter(dfb::b), bsj.c.fieldOf("cost").forGetter(dfb::c)).apply($$0, dfb::new)
   );

   @Override
   public void a(cxk $$0, ddx.a $$1, bam $$2, btc $$3) {
      for (ddu $$5 : ddt.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dfb> a() {
      return b;
   }

   public ju<ddr> b() {
      return this.c;
   }

   public bsj c() {
      return this.d;
   }
}
