import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfb(jv<ddr> c, bsd d) implements dez {
   public static final MapCodec<dfb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.a(mc.aP).fieldOf("enchantments").forGetter(dfb::b), bsd.c.fieldOf("cost").forGetter(dfb::c)).apply($$0, dfb::new)
   );

   @Override
   public void a(cxh $$0, ddx.a $$1, azh $$2, bsw $$3) {
      for (ddu $$5 : ddt.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.b(), $$5.c());
      }
   }

   @Override
   public MapCodec<dfb> a() {
      return b;
   }

   public jv<ddr> b() {
      return this.c;
   }

   public bsd c() {
      return this.d;
   }
}
