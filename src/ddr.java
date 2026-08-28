import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddr(ddo f, ddo g, ddo h, ddo i, ddo j) implements ddi {
   public static final MapCodec<ddr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddo.a.fieldOf("template").forGetter(ddr::b),
               ddo.a.fieldOf("base").forGetter(ddr::c),
               ddo.a.fieldOf("addition").forGetter(ddr::f),
               ddo.a.fieldOf("result").forGetter(ddr::d),
               ddo.a.fieldOf("crafting_station").forGetter(ddr::e)
            )
            .apply($$0, ddr::new)
   );
   public static final zt<xg, ddr> b = zt.a(ddo.b, ddr::b, ddo.b, ddr::c, ddo.b, ddr::f, ddo.b, ddr::d, ddo.b, ddr::e, ddr::new);
   public static final ddi.a<ddr> c = new ddi.a<>(a, b);

   @Override
   public ddi.a<ddr> a() {
      return c;
   }

   public ddo b() {
      return this.f;
   }

   public ddo c() {
      return this.g;
   }

   public ddo f() {
      return this.h;
   }

   @Override
   public ddo d() {
      return this.i;
   }

   @Override
   public ddo e() {
      return this.j;
   }
}
